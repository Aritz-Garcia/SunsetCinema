package objektuak;

public class Eduki {
    private int id;
    private String titulua;
    private int iraupena;

    public Eduki() {
        
    }

    public Eduki(int id, String titulua, int iraupena) {
        this.id = id;
        this.titulua = titulua;
        this.iraupena = iraupena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulua() {
        return titulua;
    }

    public void setTitulua(String titulua) {
        this.titulua = titulua;
    }

    public int getIraupena() {
        return iraupena;
    }

    public void setIraupena(int iraupena) {
        this.iraupena = iraupena;
    }

    public void editatu() {
        
    }

    public boolean generoTituluaKonparatu(Eduki edukia) {
        if (this.titulua.equals(edukia.titulua)) {
            return false;
        }
        return true;
    }

	public boolean konpId(int id){
		return this.id==id;
	}
    
    public String toString() {
		return "Id: " + this.id + "\n" +
				"Izenburua: " + this.titulua + "\n" +
				"Iraupena: " + this.iraupena;
	} 

    public CharSequence getCSV() {
		return this.id + ";" + this.titulua + ";" + this.iraupena;
	}

    public String getIzenburua() {
        return this.titulua;
    }
}