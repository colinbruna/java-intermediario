package aula66;

import aula61.Contato;

public class ColetorLixo {

    public static void obterMemoriaUsada() {

        final int MB = 1024 * 1024; //transformando de bytes para megabytes

        Runtime runtime = Runtime.getRuntime(); //singleton

        System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB); //total de memória - memória que está livre
    }

    public static void main(String[] args) {

        Contato[] contatos = new Contato[1000];
        Contato contato;

        for (int i = 0; i < contatos.length; i++) {
            contato = new Contato("Contato" + i, "1234-56789" + i, "contato" + i + "@email.com");
            contatos[i] = contato;
        }

        System.out.println("Contatos criados");

        obterMemoriaUsada();

        contatos = null;

        Runtime.getRuntime().runFinalization(); //finalizando os objetos criados

        Runtime.getRuntime().gc();

        System.out.println("Contatos removidos da memória");

        obterMemoriaUsada();
    }
}