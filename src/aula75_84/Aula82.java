package aula75_84;

public class Aula82 {

    public static void main(String[] args) {

        String alfabeto = String.join(", ", "A", "B", "C", "D");
        System.out.println(alfabeto);

        System.out.println("----------");

        String[] letras = alfabeto.split(", "); //split = separar -- regex = expressão regular, no caso usando vírgula e espaço
        for (String letra : letras){
            System.out.println(letra);
        }

        System.out.println("----Lendo doArquivo------");

        String doArquivo = "1;Antônio;30;";
        String[] infos = doArquivo.split(";");
        for (String info : infos) {
            System.out.println(info);
        }

        System.out.println("----Criando classe Pessoa------");

        String doArquivo1 = "1;Antônio;30;";
        String[] infos1 = doArquivo1.split(";");
        Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos1[1], Integer.parseInt(infos[2]));
        System.out.println(pessoa);
    }
}