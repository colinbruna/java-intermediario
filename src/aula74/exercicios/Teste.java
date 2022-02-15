package aula74.exercicios;

public class Teste {

    public enum CorSemafaro {

        VERDE(3000), AMARELO(500), VERMELHO(1500);

        private int tempoEspera;

        CorSemafaro(int tempoEspera){
            this.tempoEspera = tempoEspera;
        }

        public int getTempoEspera() {
            return tempoEspera;
        }

        public void setTempoEspera(int tempoEspera) {
            this.tempoEspera = tempoEspera;
        }
    }

    public static void main(String[] args) {

        ThreadSemaforo semaforo = new ThreadSemaforo();

        for (int i=0; i<10; i++) {
            System.out.println(semaforo.getCorSemafaro());
            semaforo.esperaCorMudar();
        }
        semaforo.desligarSemafaro();
    }
}