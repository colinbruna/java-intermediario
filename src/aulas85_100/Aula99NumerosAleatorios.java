package aulas85_100;

import java.util.Random;

public class Aula99NumerosAleatorios {

    public static void main(String[] args) {

        System.out.println(Math.floor(Math.random() * 100)); //ex.: número aleatório de 0 até 100

        Random aleatorio = new Random();

        System.out.println(aleatorio.nextInt(101)); //número aleatório inteiro até 100

        System.out.println(aleatorio.nextInt(100 + 1)); //número aleatório inteiro até 100
    }
}
