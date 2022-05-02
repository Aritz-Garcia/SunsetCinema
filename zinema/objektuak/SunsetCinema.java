package objektuak;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SunsetCinema{
    private Eguna[] astea;
	private EdukiZerrenda pelikulak;
	private static SunsetCinema sunsetCinema = new SunsetCinema();

	private static final String EDUKIAK_PATH = "Edukiak.csv";
	private static final String LANGILEAK_PATH = "Langileak";

    private SunsetCinema(){
        this.astea = new Eguna[7];
        this.pelikulak = new EdukiZerrenda();
    }

	public SunsetCinema getSunsetCinema() {
		return sunsetCinema;
	}

	public void idatzi(){

	}

	public void irakurri(){
		
		try {
			File fitxategia = new File();
			FileReader fr = new FileReader(fitxategia);
			BufferedReader br = new BufferedReader(fr);

			String lerroa;
			while ((lerroa = br.readLine()) != null) {
				info.add(lerroa);
			}

			fr.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}