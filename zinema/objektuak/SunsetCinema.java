package objektuak;

import java.util.ArrayList;

public class SunsetCinema{
    private Eguna[] astea;
	private EdukiZerrenda pelikulak;
	private static SunsetCinema sunsetCinema = new SunsetCinema();

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
			File fitxategia = new File(fitxa_path);
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