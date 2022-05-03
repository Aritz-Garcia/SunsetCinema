package objektuak;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class SunsetCinema {
	private Eguna[] astea;
	private EdukiZerrenda edukiak;
	private ArrayList<Langilea> langileak;
	private static SunsetCinema sunsetCinema = new SunsetCinema();
	private static HashMap<String, String> PATH_MAP;

	private SunsetCinema() {
		this.astea = new Eguna[7];
		astea[0] = new Eguna(AstekoEguna.ASTELEHENA);
		astea[1] = new Eguna(AstekoEguna.ASTEAZKENA);
		astea[2] = new Eguna(AstekoEguna.ASTEARTEA);
		astea[3] = new Eguna(AstekoEguna.OSTEGUNA);
		astea[4] = new Eguna(AstekoEguna.OSTIRALA);
		astea[5] = new Eguna(AstekoEguna.LARUNBATA);
		astea[6] = new Eguna(AstekoEguna.IGANDEA);

		PATH_MAP = new HashMap<String, String>();
		this.edukiak = new EdukiZerrenda();
		this.langileak = new ArrayList<Langilea>();
		PATH_MAP.put("Edukiak", "./datuak/Edukiak.csv");
		PATH_MAP.put("Langileak", "./datuak/Langileak.csv");
		PATH_MAP.put("Astelehena", "./datuak/Astelehena.csv");
		PATH_MAP.put("Asteartea", "./datuak/Asteartea.csv");
		PATH_MAP.put("Asteazkena", "./datuak/Asteazkena.csv");
		PATH_MAP.put("Osteguna", "./datuak/Osteguna.csv");
		PATH_MAP.put("Ostirala", "./datuak/Ostirala.csv");
		PATH_MAP.put("Larunbata", "./datuak/Larunbata.csv");
		PATH_MAP.put("Igandea", "./datuak/Igandea.csv");
	}

	public static SunsetCinema getNireSunsetCinema() {
		return sunsetCinema;
	}

	public void idatzi() {

	}

	public void irakurriLangileak() {
		ArrayList<String> langileak = irakurri(PATH_MAP.get("Langileak"));
		for (String langilea : langileak) {
			String[] info = langilea.split(";");
			Langilea langileaObj = new Langilea(
					info[0], // login
					info[1], // password
					info[2], // izena
					info[3], // abizena1
					info[4], // abizena2
					LocalDate.parse(info[5]), // jaiotze data
					EnpresaKargua.valueOf(info[6])); // enpresa kargua
			this.langileak.add(langileaObj);
		}
	}

	public void irakurriEdukiak() {
		ArrayList<String> edukiak = irakurri(PATH_MAP.get("Edukiak"));
		for (String edukia : edukiak) {
			String[] info = edukia.split(";");
			switch (info[0].toLowerCase()) {
				case "laburmetraia":
					this.edukiak.gehitu(new LaburMe(
							Integer.parseInt(info[1]),
							info[2],
							Integer.parseInt(info[3]),
							info[4]));
					break;
				case "pelikula":
					this.edukiak.gehitu(new Pelikula(
							Integer.parseInt(info[1]),
							info[2],
							Integer.parseInt(info[3]),
							info[5],
							Pegi.valueOf(info[6])));
					break;
				case "dokumentala":
					this.edukiak.gehitu(new Dokumentala(
							Integer.parseInt(info[1]),
							info[2],
							Integer.parseInt(info[3]),
							info[4],
							info[5]));
					break;

				default:
					break;
			}
		}
	}

	public void irakurriAstea(){
		
	}

	private ArrayList<String> irakurri(String path) {

		ArrayList<String> info = new ArrayList<String>();

		try {
			File fitxategia = new File(path);
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
		return info;
	}

    public void kargatuDatuak() {
		this.irakurriEdukiak();
		this.irakurriLangileak();
		this.irakurriAstea();
    }

	public boolean logeatu(String log, String pas) {
		for (Langilea langilea : langileak) {
			if (langilea.logeatu(log, pas)) {
				return true;
			}
		}
		return false;
	}

	public boolean erabiltzaileaExistitzenDa(String log) {
		for (Langilea langilea : langileak) {
			if (langilea.getLogin().equals(log)) {
				return true;
			}
		}
		return false;
	}

	public boolean erregistratu(String izen, String abizen1, String abizen2, String jaioData, String login, String pass, String kargua) {
		if (erabiltzaileaExistitzenDa(login)) {
			return false;
		}
		Langilea langilea = new Langilea(login, pass, izen, abizen1, abizen2, LocalDate.parse(jaioData), EnpresaKargua.valueOf(kargua));
		langileak.add(langilea);
		return true;
	}

}