package aula74.exercicios;

public enum CorSemaforoEnum {

    VERDE(3000),
    AMARELO(500),
    VERMELHO(1500);

    private int tempoEspera;

    CorSemaforoEnum(int tempoEspera){
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }
}