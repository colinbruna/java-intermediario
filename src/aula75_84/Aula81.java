package aula75_84;

public class Aula81 {

    public static void main(String[] args) {

        String teste = "Teste";
        String teste1 = "testes";

        String testeMinusc = teste.toLowerCase();
        String testeMaisc = teste.toUpperCase();

        System.out.println(testeMinusc);
        System.out.println(testeMaisc);

        if (teste.toLowerCase().equals(teste1.toLowerCase())) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
