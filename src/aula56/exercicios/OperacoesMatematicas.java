package aula56.exercicios;

public enum OperacoesMatematicas {

    SOMAR, SUBTRAIR, MULTIPLICAR, DIVIDIR;

    private char simbolo;

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }
}
