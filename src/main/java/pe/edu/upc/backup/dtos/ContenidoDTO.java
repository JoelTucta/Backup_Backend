package pe.edu.upc.backup.dtos;

public class ContenidoDTO {
    private String tipocontenido;
    private int count;
    private String huella;

    public String getHuella() {
        return huella;
    }

    public void setHuella(String huella) {
        this.huella = huella;
    }

    public ContenidoDTO() {
    }


    public ContenidoDTO(String tipocontenido, int count, String huella) {
        this.tipocontenido = tipocontenido;
        this.count = count;
        this.huella = huella;
    }

    public String getTipocontenido() {
        return tipocontenido;
    }

    public void setTipocontenido(String tipocontenido) {
        this.tipocontenido = tipocontenido;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
