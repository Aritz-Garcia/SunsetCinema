package objektuak;

/**
 * Dokumentala 
 * Dokumentalen inforamzioa gordetzeko klasea
 */
public class Dokumentala extends LargoMe {
    /** Dokumentalen tema */
    private String tema;
    /** Dokumentalen produktorea */
    private String produktorea;

    /** Dokumentala inizializatzeko konstruktore utsa */
    public Dokumentala() {
    }

    /**
     * Dokumentala inizializatzeko konstruktore betea
     * @param id Id-a
     * @param titulua Titulua
     * @param iraupena Iraupena
     * @param tema Tema
     * @param produktorea Produktorea
     */
    public Dokumentala(int id, String titulua, int iraupena, String tema, String produktorea) {
        super(id, titulua, iraupena);
        this.tema = tema;
        this.produktorea = produktorea;
    }

    /**
     * Tema lortzeko metodoa
     * @return Tema String moduan
     */
    public String getTema() {
        return tema;
    }

    /**
     * Tema gordetzeko metodoa
     * @param tema Tema
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * Produktorea lortzeko metodoa
     * @return Produktorea String moduan
     */
    public String getProduktorea() {
        return produktorea;
    }

    /**
     * Produktorea gordetzeko metodoa
     * @param produktorea Produktorea
     */
    public void setProduktorea(String produktorea) {
        this.produktorea = produktorea;
    }

    /** CSV-an Dokumental motako edukiak ondo gordetzeko metodoa */
    public String getCSV() {
        return "Dokumentala;" + super.getCSV() + ";;;" + this.tema + ";" + this.produktorea;
    }
    
    /** Dokumentalen informazioa inprimatzeko toString-a */
    public String toString() {
    	return super.toString() +
    			"\nGaia: " + this.tema +
    			"\nProduktorea: " + this.produktorea;
    }
}