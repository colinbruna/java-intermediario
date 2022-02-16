package aula56.exercicios;

public enum OperacaoEnum {

    SOMAR("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    }, SUBTRAIR("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    }, MULTIPLICAR("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    }, DIVIDIR("/") {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    private String simbolo;

    OperacaoEnum(String simbolo) {
        this.simbolo = simbolo;
    }

    public abstract double executarOperacao(double x, double y);

    public String toString() {
        return this.simbolo;
    }
}
