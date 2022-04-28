package objektuak;

public class Dokumentala extends LargoMe {
    private String tema;
    private String produktorea;

    public Dokumentala() {
    }

    public Dokumentala(int id, String titulua, int iraupena, String tema, String produktorea) {
        super(id, titulua, iraupena);
        this.tema = tema;
        this.produktorea = produktorea;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getProduktorea() {
        return produktorea;
    }

    public void setProduktorea(String produktorea) {
        this.produktorea = produktorea;
    }

    public String getCSV() {
        return "Dokumentala;" + super.getCSV() + ";;;" + this.tema + ";" + this.produktorea;
    }
}