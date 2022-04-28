package objektuak;

import java.io.*;

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

    public String getCSV() {
        return this.id + ";" + this.titulua + ";" + this.iraupena;
    }

    public void editatu() {
        
    }

    public boolean generoTituluaKonparatu(Eduki edukia) {
        if (this.titulua.equals(edukia.getTitulua())) {
            return true;
        }
        return false;
    }

    public String getIzenburua() {
        return null;
    }
    
}