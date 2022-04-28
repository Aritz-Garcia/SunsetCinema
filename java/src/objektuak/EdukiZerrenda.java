package objektuak;

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

    private boolean sartuDauiteke(Eduki edukia) {
        for (Eduki eduki : edukiak) {
            if (eduki.generoTituluaKonparatu(edukia)) {
                return false;
            }
        }
        return true;
    }

    public int bilatuEdukiById(int id) {
        for (int i = 0; i < edukiak.size(); i++) {
            if (edukiak.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
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
    
}
