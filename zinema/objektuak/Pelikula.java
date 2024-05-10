package objektuak;

/**
 * Pelikulak
 * Pelikula klaseko informazioa gordetzeko klasea
 */
public class Pelikula extends LargoMe{
    /** Pelikularen generoa */
    private String generoa;
    /** Pelikularen Pegi-a */
    private Pegi pegi;
    
    /** Pelikula inizializatzeko konstruktore utsa */
    public Pelikula() {
    }

    /**
     * Pelikula inizializatzeko konstruktore betea
     * @param id Id-a
     * @param titulua Titulua
     * @param iraupena Iraupena
     * @param generoa Generoa
     * @param pegi Pegi-a
     */
    public Pelikula(int id, String titulua, int iraupena, String generoa, Pegi pegi) {
        super(id, titulua, iraupena);
        this.generoa = generoa;
        this.pegi = pegi;
    }

    /**
     * Generoa eskuratzeko metodoa
     * @return Generoa String moduan
     */
    public String getGeneroa() {
        return generoa;
    }

    /**
     * Generoa klaseko atributuan sartzeko metodoa
     * @param generoa Generoa
     */
    public void setGeneroa(String generoa) {
        this.generoa = generoa;
    }

    /**
     * Pegi-a eskuratzeko metodoa
     * @return Pegi-a Pegi moduan
     */
    public Pegi getPegi() {
        return pegi;
    }

    /**
     * Pegi-a klaseko atributuan sartzeko metodoa
     * @param pegi Pegi-a
     */
    public void setPegi(Pegi pegi) {
        this.pegi = pegi;
    }

    /** CSV-an Pelikula motako edukiak ondo gordetzeko metodoa */
    public String getCSV() {
        return "Pelikula;" + super.getCSV() + ";" + this.generoa + ";" + this.pegi + ";;";
    }

    /**
     * Pelikula gehtu daitekeen jakitekometodoa
     * @return true gehitu badaiteke
     */
    public boolean gehituDaiteke() {
        return true;
    }

    /**
     * Pelikula desberdinen generoa konparatzeko metodoa
     * @param pelikula Pelikularen informazioa
     * @return false generoa edo titulua berdina badira, true ez bada.
     */
    public boolean generoTituluaKonparatu(Pelikula pelikula) {
        if (this.generoa.equalsIgnoreCase(pelikula.generoa) || this.getTitulua().equalsIgnoreCase(pelikula.getTitulua())) {
            return false;
        }
        return true;
    }

    /** Pelikulen informazioa inprimatzeko toString-a */
    public String toString() {
        return super.toString() + "\nGeneroa: " + this.generoa + "\nPegi: " + this.pegi;
    }

}
