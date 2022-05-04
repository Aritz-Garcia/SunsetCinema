package objektuak;

import java.time.LocalTime;
import java.util.ArrayList;

public class EdukiZerrenda {

    private ArrayList<Eduki> edukiak;

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
    
}
