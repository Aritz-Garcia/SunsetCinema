package objektuak;

import java.io.*;
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
		PATH_MAP.put("ASTELEHENA", "./datuak/Astelehena.csv");
		PATH_MAP.put("ASTEARTEA", "./datuak/Asteartea.csv");
		PATH_MAP.put("ASTEAZKENA", "./datuak/Asteazkena.csv");
		PATH_MAP.put("OSTEGUNA", "./datuak/Osteguna.csv");
		PATH_MAP.put("OSTIRALA", "./datuak/Ostirala.csv");
		PATH_MAP.put("LARUNBATA", "./datuak/Larunbata.csv");
		PATH_MAP.put("IGANDEA", "./datuak/Igandea.csv");
		
		kargatuDatuak();
	}

	public static SunsetCinema getNireSunsetCinema() {
		return sunsetCinema;
	}

	public boolean infoDauka(int i) {
		
		return astea[i].infoDauka();
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

	public EdukiZerrenda irakurriEdukiak(String path) {
		ArrayList<String> edukiak = irakurri(path);
		EdukiZerrenda edukiZerrenda = new EdukiZerrenda();
		for (String edukia : edukiak) {
			String[] info = edukia.split(";");
			switch (info[0].toLowerCase()) {
				case "laburmetraia":
				edukiZerrenda.gehitu(new LaburMe(
							Integer.parseInt(info[1]),
							info[2],
							Integer.parseInt(info[3]),
							info[4]));
					break;
				case "pelikula":
				edukiZerrenda.gehitu(new Pelikula(
							Integer.parseInt(info[1]),
							info[2],
							Integer.parseInt(info[3]),
							info[5],
							Pegi.valueOf(info[6])));
					break;
				case "dokumentala":
				edukiZerrenda.gehitu(new Dokumentala(
							Integer.parseInt(info[1]),
							info[2],
							Integer.parseInt(info[3]),
							info[7],
							info[8]));
					break;

				default:
					break;
			}
		}
		return edukiZerrenda;
	}

	public void irakurriAstea(){
		for (Eguna eguna : astea) {
			eguna.setEdukiak(irakurriEdukiak(PATH_MAP.get(eguna.getIzena())));
		}
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

    private void kargatuDatuak() {
		this.edukiak = irakurriEdukiak(PATH_MAP.get("Edukiak"));
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

	public boolean erregistratu(String izen, String abizen1, String abizen2, String jaioData, String login, String pass, EnpresaKargua kargua) {
		if (erabiltzaileaExistitzenDa(login)) {
			return false;
		}
		Langilea langilea = new Langilea(login, pass, izen, abizen1, abizen2, LocalDate.parse(jaioData), kargua);
		langileak.add(langilea);
		return true;
	}

	/**
	 * @param izeEguna izen bat emanda, egunaren edukiak itzultzen ditu
	 * @return Izenburua | Hasierako ordua | Amaierako ordua
	 */

	public String[][] infoEguna(AstekoEguna izeEguna) {
		int i = -1;
		switch (izeEguna) {
			case ASTELEHENA:
				i = 0;
				break;
			case ASTEARTEA:
				i = 1;
				break;
			case ASTEAZKENA:
				i = 2;
				break;
			case OSTEGUNA:
				i = 3;
				break;
			case OSTIRALA:
				i = 4;
				break;
			case LARUNBATA:
				i = 5;
				break;
			case IGANDEA:
				i = 6;
				break;
		}
		return astea[i].getLaburpena();
	}

	public String infoEgunEdukia(int edukia, AstekoEguna e) {
		int i = -1;
		switch (e) {
			case ASTELEHENA:
				i = 0;
				break;
			case ASTEARTEA:
				i = 1;
				break;
			case ASTEAZKENA:
				i = 2;
				break;
			case OSTEGUNA:
				i = 3;
				break;
			case OSTIRALA:
				i = 4;
				break;
			case LARUNBATA:
				i = 5;
				break;
			case IGANDEA:
				i = 6;
				break;
		}
		return astea[i].infoEdukia(edukia);
	}
	
	public void meterDatosLangilea() throws IOException{
			
			Langilea lang = new Langilea();
			try (FileWriter csvWriter = new FileWriter(PATH_MAP.get("Langileak"))) {
				for (int i=0; i<this.langileak.size(); i++) {
			        lang = this.langileak.get(i);
			        csvWriter.append(lang.getCSV());
			        csvWriter.append("\n");
		        }
	        } catch (FileNotFoundException e) {
	            System.out.println(e.getMessage());
	        }
	}
	
	public boolean gehituLarb(int id, String tit, int iraupen, String fabula) {
		return edukiak.sortuLarb(id, tit, iraupen, fabula);
	}

	public boolean gehituDoku(int id, String tit, int iraupen, String tema, String produktorea) {
		return edukiak.sortuDoc(id, tit, iraupen, tema, produktorea);
	}

	public boolean gehituPelik(int id, String tit, int iraupen, String generoa, Pegi pegi) {
		return edukiak.sortuPelik(id, tit, iraupen, generoa, pegi);
	}

	public ArrayList<String> edukienIzena() {
		return edukiak.edukienIzena();
	}

	public ArrayList<String> edukiakGehituta(ArrayList<String> edukiakEdit) {
        return edukiak.edukiakGehituta(edukiakEdit);
    }

	public void edukiakCSV() throws IOException{
		Eduki eduk = new Eduki();
		try (FileWriter csvWriter = new FileWriter(PATH_MAP.get("Edukiak"))) {
			for (int i=0; i<this.edukiak.contar(); i++) {
				eduk=edukiak.getDatuak(i);
				csvWriter.append(eduk.getCSV());
				csvWriter.append("\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}