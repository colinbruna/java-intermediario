package aula75_84;

public class Aula83 {

    public static void main(String[] args) {

        String[] letras = {"B", "C", "D", "E", "F"};

        String alfabeto = "";

        //aqui são criadas Strings novas com o conteúdo das antigas, isso não é uma boa prática
        for (String letra : letras) {
            alfabeto += letra;
        }

        System.out.println(alfabeto);

        System.out.println("----------");

        //forma mais elegante - Thread-Safe
        StringBuffer sb = new StringBuffer();
        for (String letra : letras) {
            sb.append(letra);
        }
        alfabeto = sb.toString();

        System.out.println(alfabeto);

        System.out.println("----------");

        alfabeto = new String(sb);
        System.out.println(sb);

        System.out.println("reverso " + sb.reverse());

        System.out.println("----------");

        //Não deve ser utilizado ao trabalhar com Threads
        StringBuilder sb_ = new StringBuilder();
        for (String letra : letras){
            sb_.append(letra);
        }
        alfabeto = sb_.toString();

        System.out.println(alfabeto);
    }
}