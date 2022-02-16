package aula75_84;

import java.util.StringTokenizer;

public class Aula84 {

    public static void main(String[] args) {

        String doArquivo = "1;Antônio;30;9999-9999";

        StringTokenizer st = new StringTokenizer(doArquivo, ";");

        while (st.hasMoreTokens()){ //enquanto o st tem mais tokens
            System.out.println(st.nextToken()); //imprimir próximo token
        }
    }
}
