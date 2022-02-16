package aula54;

public class TesteEnum {

    public static void main(String[] args) {

        DiaSemanaEnum dia = DiaSemanaEnum.SEGUNDA;

        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(1, 4, 2016, DiaSemanaEnum.SEXTA);

        System.out.println(data);

    }
}

