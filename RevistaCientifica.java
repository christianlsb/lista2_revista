public class RevistaCientifica {
    private String titulo;
    private int codigoISSN;
    private DateTime data;
    
    public RevistaCientifica(String titulo, int codigoISSN, DateTime data) {
        this.titulo = titulo;
        this.codigoISSN = codigoISSN;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCodigoISSN() {
        return codigoISSN;
    }

    public DateTime getData() {
        return data;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void setCodigoISSN(int codigoISSN) {
        this.codigoISSN = codigoISSN;
    }


    public void setData(DateTime data) {
        this.data = data;
    }


    
 
}
