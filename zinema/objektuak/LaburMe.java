package objektuak;

public class LaburMe extends Eduki{
    private String fabula;

    public LaburMe() {
    }

    public LaburMe(int id, String titulua, int iraupena, String mota, String fabula) {
        super(id, titulua, iraupena, mota);
        this.fabula = fabula;
    }

    public String getFabula() {
        return fabula;
    }

    public void setFabula(String fabula) {
        this.fabula = fabula;
    }

    public String getCSV() {
        return super.getCSV() + ";" + this.fabula + ";;;;";      
    }
    
    public String toString() {
        return super.toString() + "\nFabula: " + this.fabula;
    }
    
}
