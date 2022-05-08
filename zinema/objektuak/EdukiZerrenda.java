package objektuak;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;

public class EdukiZerrenda {

    private ArrayList<Eduki> edukiak;
    private ArrayList<Eduki> edukiak2;

    public EdukiZerrenda() {
        this.edukiak = new ArrayList<Eduki>();
    }

    public int getIraupenOsoa() {
        int totala = 0;
        for (Eduki edukia : edukiak) {
            totala += edukia.getIraupena();
        }
        return totala;
    }

    public void sartuEdukia(Eduki edukia) {
        if (sartuDauiteke(edukia)) {
            edukiak.add(edukia);
        }
    }

    public void gehitu(Eduki edukia) {
        edukiak.add(edukia);
    }

    private boolean sartuDauiteke(Eduki edukia) {
        for (Eduki eduki : edukiak) {
            if (eduki.generoTituluaKonparatu(edukia)) {
                return false;
            }
        }
        return true;
    }

    public void ezabatuById(int id) {
        for (Eduki edukia : edukiak) {
            if (edukia.getId() == id) {
                this.edukiak.remove(edukia);
                break;
            }
        }
    }

    public void editatuEdukia(Eduki edukia) {
        int i = 0;
        for (Eduki eduki : edukiak) {
            if (eduki.equals(edukia)) {
                edukiak.set(i, edukia);
                break;
            }
            i++;
        }
    }

    public int getAzkenId() {
        if (edukiak.isEmpty()) {
            return 0;
        }
        return edukiak.size() - 1;
    }

    public int getEdukiKop() {
        return edukiak.size();
    }

    public String[][] getLaburpena() {
        String[][] laburpena = new String[edukiak.size()][3];
        LocalTime hasHordua = LocalTime.of(16, 0);
        for (int i = 0; i < edukiak.size(); i++) {
            laburpena[i][0] = edukiak.get(i).getTitulua();
            laburpena[i][1] = hasHordua + ""; //para aser to string si aser to estring
            hasHordua = hasHordua.plusMinutes(edukiak.get(i).getIraupena());
            laburpena[i][2] = hasHordua + ""; // lo mimo
            
        }
        return laburpena;
    }

	public Eduki getEdukia(int i) {
		return edukiak.get(i);
	}

    public boolean edukiaIdKonp(int id1) {
		for (Eduki edukia : edukiak) {
			if (edukia.konpId(id1)) {
				return true;
			}
		}
		return false;
    }
    
    public boolean sortuLarb(int id, String tit, int iraupen, String fabul) {
        if (edukiaIdKonp(id)) {
			return false;
		}
        String mota="LaburMetraia";
		LaburMe laburMe = new LaburMe(id, tit, iraupen, mota, fabul);
		edukiak.add(laburMe);
        //edukiak2.add(laburMe);
		return true;
    }
    
    public boolean sortuDoc(int id, String tit, int iraupen, String tema, String produktorea) {
		if (edukiaIdKonp(id))
			return false;
        String mota="Dokumentala";
		Dokumentala doku = new Dokumentala(id, tit, iraupen, mota, tema, produktorea);
		edukiak.add(doku);
        //edukiak2.add(doku);
		return true;
	}

    public boolean sortuPelik(int id, String tit, int iraupen, String generoa, Pegi pegi) {
        if (edukiaIdKonp(id))
			return false;
        String mota = "Pelikula";
		Pelikula pelik = new Pelikula(id, tit, iraupen, mota, generoa, pegi);
		edukiak.add(pelik);
        //edukiak2.add(pelik);
		return true;
    }

    public ArrayList<String> edukienIzena() {
        ArrayList<String> erantzuna = new ArrayList<>();
        Eduki eduki = new Eduki();
        for (int i=0; i<this.edukiak.size(); i++) {
            eduki = this.edukiak.get(i);
            erantzuna.add(eduki.getTitulua());
        }
        return erantzuna;
    }
    
    public ArrayList<String> edukiakGehituta(ArrayList<String> edukiakEdit) {
        Eduki eduki = new Eduki();
        for (int i=0; i<this.edukiak2.size(); i++) {
            eduki = this.edukiak2.get(i);
            edukiakEdit.add(eduki.getTitulua());
        }
        return edukiakEdit;
    }

    /*public ArrayList<String> meterDatosLangilea() throws IOException{
			
        Langilea lang = new Langilea();
        try (FileWriter csvWriter = new FileWriter(PATH_MAP.get("Langileak"))) {
            for (int i=0; i<this.langileak.size(); i++) {
                lang = this.langileak.get(i);
                csvWriter.append(lang.getCSV());
                csvWriter.append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }*/

    public int contar() {
        return this.edukiak.size();
    }

    public String getMota(int i) {
        return edukiak.get(i).getMota();
    }

    public Eduki getDatuakLabur(int i) {
        return edukiak.get(i);
    }

    public Pelikula getDatuakPelik(int i) {
        return edukiak.get(i);
    }

    public Dokumentala getDatuakDoku(int i) {
        return edukiak.get(i);
    }
}
