package objektuak;


import java.time.LocalTime;

public class Eguna {
    private AstekoEguna izena;
    private boolean beteta;
    private EdukiZerrenda edukiak;
    private int orduDisMax;

    public Eguna() {
        this.beteta = false;
        this.edukiak = new EdukiZerrenda();
    }

    /**
     * @param izena asteko egunaren izena
     */
    public Eguna(AstekoEguna izena) {
        this.izena = izena;
        this.beteta = false;
        this.edukiak = new EdukiZerrenda();
        switch (this.izena) {
            case ASTELEHENA:
            case ASTEARTEA:
            case ASTEAZKENA:
                this.orduDisMax = 5;
                break;
            case OSTEGUNA:
            case OSTIRALA:
                this.orduDisMax = 6;
                break;
            case LARUNBATA:
            case IGANDEA:
                this.orduDisMax = 8;
                break;
            default:
                this.orduDisMax = -1;
                break;
        }
    }

    public void laburpena(){
        
    }

    public void edukiaGehitu(Eduki edukia) {
        if (!beteta)
            if (edukiak.getIraupenOsoa() + edukia.getIraupena() <= orduDisMax*60)
                edukiak.sartuEdukia(edukia);
    }
    public void setEdukiak(EdukiZerrenda edukiak) {
        this.edukiak = edukiak;
    }

    public void edukiaKenduById(int id) {
        this.edukiak.ezabatuById(id);
    }

    public void edukiaEditatu(Eduki edukia) {
        this.edukiak.editatuEdukia(edukia);
    }

    public LocalTime getAzkenOrdua() {
        return LocalTime.of(orduDisMax, 0).plusMinutes(this.edukiak.getIraupenOsoa());
    }

    public String getIzena() {
        return this.izena.toString();
    }

    public String[][] getLaburpena() {
        return edukiak.getLaburpena();
    }

}
