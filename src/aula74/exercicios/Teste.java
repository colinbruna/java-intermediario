package aula74.exercicios;

public class Teste {

    public static void main(String[] args) {

        ThreadSemaforo semaforo = new ThreadSemaforo();

        for (int i=0; i<10; i++) {
            System.out.println(semaforo.getCorSemafaro());
            semaforo.esperaCorMudar();
        }
        semaforo.desligarSemafaro();
    }
}