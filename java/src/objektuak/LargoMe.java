package objektuak;

public class LargoMe extends Eduki{

    public LargoMe() {
    }

    public LargoMe(int id, String titulua, int iraupena) {
        super(id, titulua, iraupena);
    }
    
    public String getCSV() {
        return super.getCSV() + ";";
    }
}
