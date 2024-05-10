package objektuak;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * EdukiZerrenda 
 * EdukiZerrenden informazioa gordetzeko klasea
 */
public class EdukiZerrenda {

    private ArrayList<Eduki> edukiak;

    /** EdukiZerrenda inizializatzeko konstruktorea */
    public EdukiZerrenda() {
        this.edukiak = new ArrayList<Eduki>();
    }

    /**
     * EdukiZerrendaren iraupen totala lortzeko metodoa
     * @return Iraupen totala int moduan
     */
    public int getIraupenOsoa() {
        int totala = 0;
        for (Eduki edukia : edukiak) {
            totala += edukia.getIraupena();
        }
        return totala;
    }

    /**
     * Edukiak gordetzeko metodoa
     * @param edukia Edukia
     */
    public void sartuEdukia(Eduki edukia) {
        if (sartuDauiteke(edukia)) {
            edukiak.add(edukia);
        }
    }

    /**
     * Edukiak ArrayList-ean gordetzeko metodoa
     * @param edukia Edukia
     */
    public void gehitu(Eduki edukia) {
        edukiak.add(edukia);
    }

    /**
     * Edukia ArrayList-ean sartu daitekeen jakiteko metodoa
     * @param edukia Edukia
     * @return false ezin bada, bestela true
     */
    private boolean sartuDauiteke(Eduki edukia) {
        for (Eduki eduki : edukiak) {
            if (eduki.gehituDaiteke(edukia)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Eduki bat id bidez ezabatzeko metodoa
     * @param id Edukiaren id-a
     */
    public void ezabatuById(int id) {
        for (Eduki edukia : edukiak) {
            if (edukia.getId() == id) {
                this.edukiak.remove(edukia);
                break;
            }
        }
    }

    /**
     * Eduki baten informazioa editatzeko metodoa
     * @param edukia Edukia
     * @param newDenb
     * @param newTitle
     */
    public void editatuEdukia(Eduki edukia, String newTitle, int newDenb) {
        int i = 0;
        for (Eduki eduki : edukiak) {
            if (eduki.equals(edukia)) {
                eduki.edit(newTitle, newDenb);
                break;
            }
            i++;
        }
    }

    /**
     * EdukiZerrendaren azken idea lortzeko metodoa
     * @return Azken id-a int moduan
     */
    public int getAzkenId() {
        if (edukiak.isEmpty()) {
            return 0;
        }
        return edukiak.get(edukiak.size() - 1).getId();
    }

    /**
     * EdiZerrendan dagoen eduki kopuru totala jakiteko metodoa
     * @return Eduki kopurua int moduan
     */
    public int getEdukiKop() {
        return edukiak.size();
    }

    /**
     * Edukien informazioa lortzeko metodoa
     * @return Informazioa array bikoitz batean
     */
    public String[][] getLaburpena() {
        String[][] laburpena = new String[edukiak.size()][3];
        LocalTime hasHordua = LocalTime.of(16, 0);
        for (int i = 0; i < edukiak.size(); i++) {
            laburpena[i][0] = edukiak.get(i).getTitulua();
            laburpena[i][1] = hasHordua + ""; // para aser to string si aser to estring
            hasHordua = hasHordua.plusMinutes(edukiak.get(i).getIraupena());
            laburpena[i][2] = hasHordua + ""; // lo mimo

        }
        return laburpena;
    }

    /**
     * Edukia lortzeko metodoa
     * @param i Edukia non dagoen jakiteko atributua
     * @return Edukiaren informazioa
     */
    public Eduki getEdukia(int i) {
        return edukiak.get(i);
    }

    /**
     * Edukiaren informazioa id bidez lortzeko metodoa
     * @param id Edukiare id-a
     * @return Edukiaren informaizoa id-a baldin badago, bestela null
     */
    public Eduki getEdukiaById(int id) {
        for (Eduki eduki : edukiak) {
            if (eduki.getId() == id) {
                return eduki;
            }
        }
        return null;
    }

    /**
     * Edukiak konparatzeko metodoa
     * @param id1 id-a
     * @return true existitzen bada, bestela false
     */
    public boolean edukiaIdKonp(int id1) {
        for (Eduki edukia : edukiak) {
            if (edukia.konpId(id1)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Laburmetraia sortzeko metodoa
     * @param id Id-a
     * @param tit Titulua
     * @param iraupen Iraupena
     * @param fabul Fabula
     * @return false existitzen bada, bestela true
     */
    public boolean sortuLarb(int id, String tit, int iraupen, String fabul) {
        if (edukiaIdKonp(id)) {
            return false;
        }
        LaburMe laburMe = new LaburMe(id, tit, iraupen, fabul);
        edukiak.add(laburMe);
        return true;
    }

    /**
     * Dokumentala sortzeko metodoa
     * @param id Id-a
     * @param tit Titulua
     * @param iraupen Iraupena
     * @param tema Tema
     * @param produktorea Produktorea
     * @return false existitzen bada, bestela true
     */
    public boolean sortuDoc(int id, String tit, int iraupen, String tema, String produktorea) {
        if (edukiaIdKonp(id))
            return false;
        Dokumentala doku = new Dokumentala(id, tit, iraupen, tema, produktorea);
        edukiak.add(doku);
        return true;
    }

    /**
     * Pelikulak sortzeko metodoa
     * @param id Id-a
     * @param tit Titulua
     * @param iraupen Iraupena
     * @param generoa Generoa
     * @param pegi Pegi-a
     * @return false existitzen bada, bestela true
     */
    public boolean sortuPelik(int id, String tit, int iraupen, String generoa, Pegi pegi) {
        if (edukiaIdKonp(id))
            return false;
        Pelikula pelik = new Pelikula(id, tit, iraupen, generoa, pegi);
        edukiak.add(pelik);
        return true;
    }

    /**
     * Edukien izena gordetzeko metodoa
     * @return Edukien izena
     */
    public ArrayList<String> edukienIzena() {
        ArrayList<String> erantzuna = new ArrayList<>();
        Eduki eduki = new Eduki();
        for (int i = 0; i < this.edukiak.size(); i++) {
            eduki = this.edukiak.get(i);
            erantzuna.add(eduki.getTitulua());
        }
        return erantzuna;
    }

    /**
     * Edukien izenak lortzeko metodoa
     * @param edukiakEdit Edukien izenak gordetzeko
     * @return Edukien izenak
     */
    public ArrayList<String> edukiakGehituta(ArrayList<String> edukiakEdit) {
        Eduki eduki = new Eduki();
        for (int i = 0; i < this.edukiak.size(); i++) {
            eduki = this.edukiak.get(i);
            edukiakEdit.add(eduki.getTitulua());
        }
        return edukiakEdit;
    }

    /**
     * EdukiZerrenda dituen eduki kopurua kontatzeko metodoa
     * @return Eduki kopurua int moduan
     */
    public int contar() {
        return this.edukiak.size();
    }

    /**
     * Datuak lorttzeko metodoa
     * @param i ArrayList-ean non kokatuta dagoen jakiteko atributua
     * @return Eduki informazioa
     */
    public Eduki getDatuak(int i) {
        return edukiak.get(i);
    }

    /**
     * Eduki baten id-a lortzeko metodoa tituluaren bidez
     * @param titulua Titulua
     * @return Edukiaren id-a
     */
    public int lortuId(String titulua) {
        int z = -1;
        for (int i = 0; i < edukiak.size(); i++) {
            if (edukiak.get(i).getTitulua() == titulua) {
                return edukiak.get(i).getId();
            }
        }
        return z;
    }

    /**
     * Edukien informazioa lortzeko metodoa
     * @return Informazioa array bikoitz batean
     */
    public String[][] getEditLaburpena() {
        String[][] laburpena = new String[edukiak.size()][3];
        for (int i = 0; i < edukiak.size(); i++) {
            laburpena[i][0] = edukiak.get(i).getId() + "";
            laburpena[i][1] = edukiak.get(i).getIzenburua();
            laburpena[i][2] = edukiak.get(i).getIraupena() + "";

        }
        return laburpena;
    }

    /**
     * Edukia gehitu daitekeen jakiteko metodoa
     * @param eZerrenda EdukiZerrenda
     * @param maxDenbora Denbora maximoa
     * @return EdukiZerrenda
     */
    public EdukiZerrenda getGehituDaitezke(EdukiZerrenda eZerrenda, int maxDenbora) {
        EdukiZerrenda gehitu = new EdukiZerrenda();
        for (Eduki eduki : edukiak) {
            if (eZerrenda.gehituDaiteke(eduki) && eduki.getIraupena() <= maxDenbora) {
                gehitu.gehitu(eduki);
            }
        }
        return gehitu;
    }

    /**
     * Edukia gehitu daitekeen jakiteko metodoa
     * @param e Edukia
     * @return true gehitu badaiteke, bestela false
     */
    public boolean gehituDaiteke(Eduki e) {
        boolean segi = true;
        for (int i = 0; i < edukiak.size() && segi; i++) {
            segi = edukiak.get(i).gehituDaiteke(e);
        }
        return segi;
    }

    /**
     * Bataz besteko iraupena lortzeko metodoa
     * @return Bataz Besteko iraupena float moduan
     */
    public float getBzBsIraupena() {
        float bzbs = 0;
        for (Eduki eduki : edukiak) {
            bzbs += eduki.getIraupena();
        }
        return bzbs / edukiak.size();
    }

    /**
     * CSV-a idazteko metodoa
     * @param path Egunaren PATH-a
     */
    public void idatziCSVEgunean(String path) {
        try (FileWriter csvWriter = new FileWriter(path)) {
            for (Eduki eduki : edukiak) {
                csvWriter.append(eduki.getCSV());
                csvWriter.append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
