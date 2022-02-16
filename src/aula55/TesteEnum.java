package aula55;

import aula54.DiaSemanaEnum;

public class TesteEnum {

    public static void main(String[] args) {

        DiaSemanaEnum[] dias = DiaSemanaEnum.values(); //retorna um array de todos os valores que estão dentro do enumerador

        for (int i=0; i<dias.length; i++){
            System.out.println(dias[i]);
        }

        System.out.println();

        //for melhorado
        for (DiaSemanaEnum dia : DiaSemanaEnum.values()){
            System.out.println(dia);
        }
    }
}
