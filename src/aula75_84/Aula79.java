package aula75_84;

public class Aula79 {

    public static void main(String[] args) {

        String banana = "banana";
        String ana = "ana";

        //indexOf: índice de: retorna o índice da primeira vez que esse caracter ou String aparece (retorna -1 se não encontrar)
        System.out.println(banana.indexOf('x'));
        System.out.println(banana.indexOf('b'));
        System.out.println(banana.indexOf('a'));

        System.out.println(banana.indexOf(ana));

        //lastIndexOf: retorna o índice da última vez que esse caracter ou String aparece
        System.out.println(banana.lastIndexOf('a'));
        System.out.println(banana.lastIndexOf(ana));

        //return true or false
        System.out.println(banana.contains(ana));
        System.out.println(banana.contains("ceu"));
    }
}
