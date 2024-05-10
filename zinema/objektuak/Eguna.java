package objektuak;


import java.time.LocalTime;

/**
 * Eguna 
 * Egunak dituen infrmazioa desberdina gordetzeko klasea
 */
public class Eguna {
    /** Asteko eguna idatzita */
    private AstekoEguna izena;
    /** Beteta dagoen edo ez jakiteko atributua */
    private boolean beteta;
    /** egunak dituen eduki desberdinak gordetzeko EdukiZerrenda */
    private EdukiZerrenda edukiak;
    /** Egunak egin ditzakeen ordu maximoa gordetzeko atributua */
    private int orduDisMax;

    /** Eguna inizializatzeko konstruktorea */
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

    /**
     * Edukia egunean gehitzeko metodoa
     * @param edukia Edukia
     */
    public void edukiaGehitu(Eduki edukia) {
        if (!beteta)
            if (edukiak.getIraupenOsoa() + edukia.getIraupena() <= orduDisMax*60)
                edukiak.gehitu(edukia);
                if (edukiak.getIraupenOsoa() >= orduDisMax*60)
                    beteta = true;
    }
    
    /**
     * EdukiZerrendak esartzeko metodoa
     * @param edukiak Eguneko EdukiZerrenda
     */
    public void setEdukiak(EdukiZerrenda edukiak) {
        this.edukiak = edukiak;
    }

    /**
     * Edukiak id bidez ezabatzeko metodoa
     * @param id Id-a
     */
    public void edukiaKenduById(int id) {
        this.edukiak.ezabatuById(id);
    }

    /**
     * Edukia editatzeko metodoa
     * @param edukia Edukia
     */

    /**
     * Eguneko azken ordua lortzeko metodoa
     * @return Azken ordua LocalTime-an
     */
    public LocalTime getAzkenOrdua() {
        return LocalTime.of(orduDisMax, 0).plusMinutes(this.edukiak.getIraupenOsoa());
    }

    /**
     * Egunaren izena lortzeko metodoa
     * @return Eguna String moduan
     */
    public String getIzena() {
        return this.izena.toString();
    }

    /**
     * Laburpena lortzeko metodoa
     * @return Laburpena array bikoitz batean
     */
    public String[][] getLaburpena() {
        return edukiak.getLaburpena();
    }

	/**
     * Edukien informazioa lortzeko metodoa
     * @param i Edukia gordeta dagoen tokia
     * @return Informazioa String moduan
     */
    public String infoEdukia(int i) {
		return edukiak.getEdukia(i).toString();
	}

    /**
     * Egunak datuak dauzkan jakiteko metodoa
     * @return true informaziorik badu, bestela false
     */
    public boolean infoDauka() {
        return this.edukiak.getIraupenOsoa() > 0;
    }

    /**
     * Editatutako laburpenak lortzeko metodoa
     * @return Informazioa array bikoitz batean
     */
    public String[][] getEditLaburpena() {
        return edukiak.getEditLaburpena();
    }

    /**
     * Edukiak EdukiZerrenda sartu daitezkeen jakiteko metodoa
     * @param edukiak Edukia
     * @return EdukiZerrenda informazioarekin
     */
    public EdukiZerrenda gehituDaitezke(EdukiZerrenda edukiak) {
        return edukiak.getGehituDaitezke(this.edukiak, this.orduDisMax*60 - this.edukiak.getIraupenOsoa());
    }

    /**
     * Iraupena lortzeko metodoa
     * @return Iraupena int moduan
     */
    public int getIraupena() {
        return this.edukiak.getIraupenOsoa();
    }

    /**
     * Egunak egin ditzakeen ordu maximoak lortzeko metodoa
     * @return Ordu maximoa int moduan
     */
    public int getOrduMax() {
        return this.orduDisMax;
    }

    /**
     * Egunaren eduki kopurua lortzeko metodoa
     * @return Eduki kopurua int moduan
     */
    public int getEdukiKop() {
        return this.edukiak.getEdukiKop();
    }

    /**
     * CSV-a idazteko metodoa
     * @param path Egunaren PATH-a
     */
    public void idatziCSV(String path) {
        this.edukiak.idatziCSVEgunean(path);
    }

    /**
     * Eguna beteta dagoen jakiteko metodoa
     * @return true beteta badago, false ez badago
     */
    public boolean betetaDago() {
        return beteta;
    }

}
