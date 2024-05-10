package objektuak;

/**
 * LargoMe 
 * Largometrai desberdinen informazioa gordetzeko klasea
 */
public class LargoMe extends Eduki{

    /** LargoMetraia inizializatzeko konstruktore utsa */
    public LargoMe() {
    }

    /**
     * Largometraia inizializatzeko konstruktore betea
     * @param id Id-a
     * @param titulua Titulua
     * @param iraupena Iraupena
     */
    public LargoMe(int id, String titulua, int iraupena) {
        super(id, titulua, iraupena);
    }
    
    /** CSV-an Pelikula edo Dokumental motako edukiak ondo gordetzeko metodoa */
    public String getCSV() {
        return super.getCSV() + ";";
    }

    /** Pelikulen edo Dokumentalen informazioa inprimatzeko toString-a  */
    public String toString() {
        return super.toString();
    }
}
