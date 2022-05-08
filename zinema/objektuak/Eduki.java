package objektuak;

public class Eduki {
    private int id;
    private String titulua;
    private int iraupena;
    private String mota;

    public Eduki() {
        
    }

    public Eduki(int id, String titulua, int iraupena, String mota) {
        this.id = id;
        this.titulua = titulua;
        this.iraupena = iraupena;
        this.mota = mota;
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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    } 

    public void editatu() {
        
    }

    public boolean generoTituluaKonparatu(Eduki edukia) {
        if (this.titulua.equals(edukia.getTitulua())) {
            return true;
        }
        return false;
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
		return this.mota + ";" + this.id + ";" + this.titulua + ";" + this.iraupena;
	}

    public LaburMe getLaburme() {
        return 
    }
}