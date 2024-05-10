package objektuak;

/**
 * Eduki 
 * Edukiaren informazioa gordetzeko metodoa
 */
public class Eduki {
    /** Id-a gordetzko atributua */
    private int id;
    /** Titulua gordetzeko atributua */
    private String titulua;
    /** Iraupena gordetzeko atributua */
    private int iraupena;

    /** Edukia inizializatzeko konstruktore utsa */
    public Eduki() {
        
    }

    /**
     * Edukia inizializatzeko konstruktore betea
     * @param id Id-a
     * @param titulua Titulua
     * @param iraupena Iraupena
     */
    public Eduki(int id, String titulua, int iraupena) {
        this.id = id;
        this.titulua = titulua;
        this.iraupena = iraupena;
    }

    /**
     * Id-a lortzeko metodoa
     * @return Id-a int moduan
     */
    public int getId() {
        return id;
    }

    /**
     * Id-a gordetzeko metodoa
     * @param id Id-a
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Titulua lortzeko metodoa
     * @return Titulua String moduan
     */
    public String getTitulua() {
        return titulua;
    }

    /**
     * Titulua gordetzko metodoa
     * @param titulua Titulua
     */
    public void setTitulua(String titulua) {
        this.titulua = titulua;
    }

    /**
     * Iraupena lortzeko metodoa
     * @return Iraupena int moduan
     */
    public int getIraupena() {
        return iraupena;
    }

    /**
     * Iraupena gordetzko metodoa
     * @param iraupena Iraupena
     */
    public void setIraupena(int iraupena) {
        this.iraupena = iraupena;
    }

    /**
     * Gehitu daitekeen jakiteko metodoa
     * @param edukia Edukia
     * @return false ezin bada, bestela true
     */
    public boolean gehituDaiteke(Eduki edukia) {
        if (this.titulua.equals(edukia.titulua)) {
            return false;
        }
        return true;
    }

	/**
     * Bi id konparatzek metodoa
     * @param id Id-a
     * @return true berdinak badira, bestela false
     */
    public boolean konpId(int id){
		return this.id==id;
	}
    
    /** Edukiaren informazioa inprimatzeko toString-a */
    public String toString() {
		return "Id: " + this.id + "\n" +
				"Izenburua: " + this.titulua + "\n" +
				"Iraupena: " + this.iraupena;
	} 

    /**
     * CSV-an Eduki motako edukiak ondo gordetzeko metodoa
     * @return CSV-an Edukiak motako edukiak gordetzeko testua
     */
    public CharSequence getCSV() {
		return this.id + ";" + this.titulua + ";" + this.iraupena;
	}

    /**
     * Titulua lortzeko metodoa
     * @return Titulua String moduan
     */
    public String getIzenburua() {
        return this.titulua;
    }

    public void edit(String newIzen, int newDenb) {
        this.iraupena = newDenb;
        this.titulua = newIzen;
    }
}