public class Edicao {
    private int numero;
    private int volume;
    private DateTime data;
    private String triagem;
    
    public Edicao(int numero, int volume, DateTime data, String triagem) {
        this.numero = numero;
        this.volume = volume;
        this.data = data;
        this.triagem = triagem;
    }

    public int getNumero() {
        return numero;
    }

    public int getVolume() {
        return volume;
    }

    public DateTime getData() {
        return data;
    }


    public String getTriagem() {
        return triagem;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setData(DateTime data) {
        this.data = data;
    }

    public void setTriagem(String triagem) {
        this.triagem = triagem;
    }

    

}
