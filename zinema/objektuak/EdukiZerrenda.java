package objektuak;

import java.time.LocalTime;
import java.util.ArrayList;

public class EdukiZerrenda {

    private ArrayList<Eduki> edukiak;
    private ArrayList<Eduki> edukiak2;

    public EdukiZerrenda() {
        this.edukiak = new ArrayList<Eduki>();
        this.edukiak2 = new ArrayList<Eduki>();
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
            edukiak2.add(edukia);
        }
    }

    public void gehitu(Eduki edukia) {
        edukiak.add(edukia);
        edukiak2.add(edukia);
    }

    private boolean sartuDauiteke(Eduki edukia) {
        for (Eduki eduki : edukiak2) {
            if (eduki.generoTituluaKonparatu(edukia)) {
                return false;
            }
        }
        return true;
    }

    public void ezabatuById(int id) {
        for (Eduki edukia : edukiak2) {
            if (edukia.getId() == id) {
                this.edukiak2.remove(edukia);
                break;
            }
        }
    }

    public void editatuEdukia(Eduki edukia) {
        int i = 0;
        for (Eduki eduki : edukiak) {
            if (eduki.equals(edukia)) {
                edukiak2.set(i, edukia);
                break;
            }
            i++;
        }
    }

    public int getAzkenId() {
        if (edukiak2.isEmpty()) {
            return 0;
        }
        return edukiak2.size() - 1;
    }

    public int getEdukiKop() {
        return edukiak2.size();
    }

    public String[][] getLaburpena() {
        String[][] laburpena = new String[edukiak2.size()][3];
        LocalTime hasHordua = LocalTime.of(16, 0);
        for (int i = 0; i < edukiak2.size(); i++) {
            laburpena[i][0] = edukiak2.get(i).getTitulua();
            laburpena[i][1] = hasHordua + ""; //para aser to string si aser to estring
            hasHordua = hasHordua.plusMinutes(edukiak2.get(i).getIraupena());
            laburpena[i][2] = hasHordua + ""; // lo mimo
            
        }
        return laburpena;
    }

	public Eduki getEdukia(int i) {
		return edukiak2.get(i);
	}

    public boolean edukiaIdKonp(int id1) {
		for (Eduki edukia : edukiak2) {
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
		LaburMe laburMe = new LaburMe(id, tit, iraupen, fabul);
		edukiak2.add(laburMe);
		return true;
    }
    
    public boolean sortuDoc(int id, String tit, int iraupen, String tema, String produktorea) {
		if (edukiaIdKonp(id))
			return false;
		Dokumentala doku = new Dokumentala(id, tit, iraupen, tema, produktorea);
		edukiak2.add(doku);
		return true;
	}

    public boolean sortuPelik(int id, String tit, int iraupen, String generoa, Pegi pegi) {
        if (edukiaIdKonp(id))
			return false;
		Pelikula pelik = new Pelikula(id, tit, iraupen, generoa, pegi);
		edukiak2.add(pelik);
		return true;
    }

    public ArrayList<String> edukienIzena() {
        ArrayList<String> erantzuna = new ArrayList<>();
        Eduki eduki = new Eduki();
        for (int i=0; i<this.edukiak2.size(); i++) {
            eduki = this.edukiak2.get(i);
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

    public int contar() {
        return this.edukiak2.size();
    }

    public Eduki getDatuak(int i) {
        return edukiak2.get(i);
    }

    public int lortuId(String titulua) {
        int z=-1;
        for (int i=0; i<edukiak2.size(); i++) {
            if (edukiak2.get(i).getTitulua()==titulua) {
                return edukiak2.get(i).getId();
            }
        }
        return z;
    }
}
