public class DateTime {
    private int dia;
    private Month mes;
    private int ano;

    public DateTime(int dia, Month mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public Month getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }


    public void setMes(Month mes) {
        this.mes = mes;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }

    
}
