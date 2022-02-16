package aula74.exercicios;

public class ThreadSemaforo implements Runnable {

    private CorSemaforoEnum corSemafaro;
    private boolean continuar;
    private boolean mudancaCor;

    public ThreadSemaforo() {
        this.corSemafaro = CorSemaforoEnum.VERDE;

        this.continuar = false;
        this.mudancaCor = false;

        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!continuar) {
            try {
                Thread.sleep(this.corSemafaro.getTempoEspera());
                this.mudancaCor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void mudancaCor() {
        switch (this.corSemafaro) {
            case VERDE:
                this.corSemafaro = CorSemaforoEnum.AMARELO;
                break;
            case AMARELO:
                this.corSemafaro = CorSemaforoEnum.VERMELHO;
                break;
            case VERMELHO:
                this.corSemafaro = CorSemaforoEnum.VERDE;
                break;
            default:
                break;
        }
        this.mudancaCor = true;
        notify();
    }

    public synchronized void esperaCorMudar(){
        while(!this.mudancaCor){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.mudancaCor = false;
    }

    public synchronized void desligarSemafaro(){
        this.continuar = true;
    }

    public CorSemaforoEnum getCorSemafaro() {
        return corSemafaro;
    }
}