package objektuak;

/**
 * LarburMe
 * Larburmetraiaren informazioa gordetzeko klasea
 */
public class LaburMe extends Eduki{
    /** Larbumetraiek duten fabula */
    private String fabula;

    /** Pelikula inizializatzeko konstruktore utsa */
    public LaburMe() {
    }

    /**
     * Pelikula inizializatzeko konstruktore betea
     * @param id Id-a
     * @param titulua Titulua
     * @param iraupena Iraupena
     * @param fabula Fabula
     */
    public LaburMe(int id, String titulua, int iraupena, String fabula) {
        super(id, titulua, iraupena);
        this.fabula = fabula;
    }

    /**
     * Fabula lortzeko metodoa
     * @return Fabula String moduan
     */
    public String getFabula() {
        return fabula;
    }

    /**
     * Fabula atrubutuan informazioa sartzeko metodoa
     * @param fabula Faula
     */
    public void setFabula(String fabula) {
        this.fabula = fabula;
    }

    /** CSV-an Laburmetraia motako edukiak ondo gordetzeko metodoa */
    public String getCSV() {
        return "LaburMetraia;" + super.getCSV() + ";" + this.fabula + ";;;;";      
    }
    
    /** Laburmetraien informazioa inprimatzeko toString-a */
    public String toString() {
        return super.toString() + "\nFabula: " + this.fabula;
    }
    
}
