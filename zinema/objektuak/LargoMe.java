package objektuak;

public class LargoMe extends Eduki{

    public LargoMe() {
    }

    public LargoMe(int id, String titulua, int iraupena, String mota) {
        super(id, titulua, iraupena, mota);
    }
    
    public String getCSV() {
        return super.getCSV() + ";";
    }

    public String toString() {
        return super.toString();
    }
}
