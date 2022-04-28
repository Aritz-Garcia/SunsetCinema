package objektuak;

import java.io.*;

public class LaburMe extends Eduki{
    private String fabula;

    public LaburMe() {
    }

    public LaburMe(int id, String titulua, int iraupena, String fabula) {
        super(id, titulua, iraupena);
        this.fabula = fabula;
    }

    public String getFabula() {
        return fabula;
    }

    public void setFabula(String fabula) {
        this.fabula = fabula;
    }

    public String getCSV() {
        return "LaburMetraia" + super.getCSV() + ";" + this.fabula;      
    }
}
