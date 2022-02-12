package aula55;

import aula54.DiaSemana;

public class TesteEnum {

    public static void main(String[] args) {

        DiaSemana[] dias = DiaSemana.values(); //retorna um array de todos os valores que estão dentro do enumerador

        for (int i=0; i<dias.length; i++){
            System.out.println(dias[i]);
        }

        System.out.println();

        //for melhorado
        for (DiaSemana dia : DiaSemana.values()){
            System.out.println(dia);
        }
    }
}
