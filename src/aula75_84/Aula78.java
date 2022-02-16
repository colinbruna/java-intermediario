package aula75_84;

public class Aula78 {

    public static void main(String[] args) {

        String ola = "Olá";
        String ola2 = "OLÁ";
        String ola3 = "Olá";
        String ola4 = new String(ola);

        System.out.println("ola equals ola2 = " + ola.equals(ola2)); //false
        System.out.println("ola equals ola3 = " + ola.equals(ola3)); //true

        System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2)); //true

        //== compara as referências
        System.out.println("ola == ola2 " + (ola == ola2)); //false - as referências do ola e do ola2 são diferentes
        System.out.println("ola == ola3 " + (ola == ola3)); //true - as referências do ola e do ola3 são iguais

        System.out.println("ola == ola4 " + (ola == ola4)); //false - as referências do ola e do ola4 são diferentes
        System.out.println("ola equals ola4 = " + ola.equals(ola4)); //true - o conteúdo da String é igual
        System.out.println("ola equalsIgnoreCase ola4 = " + ola.equalsIgnoreCase(ola4)); //true

        String banana = "banana";
        String ana = "ana";
        String ban = "Ban";

        System.out.println(banana.regionMatches(1, ana, 0, 3));
        System.out.println(banana.regionMatches(2, ana, 1, 2));
        System.out.println(banana.regionMatches(true, 0, ban, 0, 3));

        System.out.println("banana termina com ana - " + banana.endsWith(ana));
        System.out.println("banana começa com Ban - " + banana.startsWith(ban));

        System.out.println("-----------");
        String bruna = "bruna";
        String una = "una";
        System.out.println("bruna " + bruna.regionMatches(3,una,1,2));
        System.out.println("-----------");

        String a = "a";
        String b = "b";
        String aMaiusculo = "A";

        System.out.println(a.compareTo(b)); //97 - 98= -1
        System.out.println(b.compareTo(a)); //98 - 97 = 1
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo("a"));
        System.out.println(a.compareTo(aMaiusculo));

        //Pela tabela ASCII a=97, b=98, A=65
        //-1 quando a > b
        //0 quando a == b
        //1 ou >1 quando a<b
    }
}