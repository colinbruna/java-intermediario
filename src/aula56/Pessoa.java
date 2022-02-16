package aula56;

public class Pessoa {

    private TipoDocumentoEnum tipoDocumento;
    private String numeroDocumento;

    public Pessoa() {
        super();
    }

    public Pessoa(TipoDocumentoEnum tipoDocumento, String numeroDocumento) {
        super();
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public TipoDocumentoEnum getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoEnum tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return "Pessoa [tipoDocumento=" + tipoDocumento + ", numeroDocumento="
                + numeroDocumento + "]";
    }
}
