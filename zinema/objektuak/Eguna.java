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
                if (edukia.getIraupena() == orduDisMax*60)
                    beteta = true;
    }

    public void setEdukia(Eduki edukia) {
        this.edukiak.gehitu(edukia);;
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

	public String infoEdukia(int i) {
		return edukiak.getEdukia(i).toString();
	}

    public boolean infoDauka() {
        return this.edukiak.getIraupenOsoa() > 0;
    }

    public String[][] getEditLaburpena() {
        return edukiak.getEditLaburpena();
    }

    public EdukiZerrenda gehituDaitezke(EdukiZerrenda edukiak) {
        return edukiak.getGehituDaitezke(this.edukiak, this.orduDisMax*60 - this.edukiak.getIraupenOsoa());
    }

    public int getIraupena() {
        return this.edukiak.getIraupenOsoa();
    }

    public int getOrduMax() {
        return this.orduDisMax;
    }

    public int getEdukiKop() {
        return this.edukiak.getEdukiKop();
    }

    public void idatziCSV(String path) {
        this.edukiak.idatziCSVEgunean(path);
    }

    public boolean betetaDago() {
        return beteta;
    }

}
