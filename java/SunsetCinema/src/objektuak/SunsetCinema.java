package objektuak;

import java.util.ArrayList;

public class SunsetCinema{
    Eguna[] astea = new Eguna[7];
    EdukiZerrenda pelikulak;
    SunsetCinema sunsetCinema;

    public SunsetCinema(Eguna[] astea, EdukiZerrenda pelikulak, SunsetCinema sunsetCinema){
        this.astea=astea;
        this.pelikulak=pelikulak;
        this.sunsetCinema=sunsetCinema;
    }

    public EdukiZerrenda getPelikulak() {
		return pelikulak;
	}

	public void setPelikulak(EdukiZerrenda pelikulak) {
		this.pelikulak = pelikulak;
	}

	public SunsetCinema getSunsetCinema() {
		return sunsetCinema;
	}

	public void setSunsetCinema(SunsetCinema sunsetCinema) {
		this.sunsetCinema = sunsetCinema;
	}

}