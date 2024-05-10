package objektuak;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * SunsetCinema
 * Intefazeen eta klase desberdinen hartean komunikatzeko klasea
 */
public class SunsetCinema {


	/** Asteko egunen informazioa gordetzeko array-a */
	private Eguna[] astea;
	/** Edukiak gordetzea zerrenda */
	private EdukiZerrenda edukiak;
	/** Langileekin login-a egiteko informazioa gordetzeko ArrayList-a */
	private ArrayList<Langilea> langileak;
	/** SunsetCinema klase berdina erabiltzeko */
	private static SunsetCinema sunsetCinema = new SunsetCinema();
	/** CSV fitxategi desberdinak irakurtzeko PATH_MAP-a inizializatzeko */
	private static HashMap<String, String> PATH_MAP;

	/**
	 * Datuak kargatzeko metodoa
	 */
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
		
		PATH_MAP.put("Edukiak", "./zinema/datuak/Edukiak.csv");
		PATH_MAP.put("Langileak", "./zinema/datuak/Langileak.csv");
		PATH_MAP.put("ASTELEHENA", "./zinema/datuak/Astelehena.csv");
		PATH_MAP.put("ASTEARTEA", "./zinema/datuak/Asteartea.csv");
		PATH_MAP.put("ASTEAZKENA", "./zinema/datuak/Asteazkena.csv");
		PATH_MAP.put("OSTEGUNA", "./zinema/datuak/Osteguna.csv");
		PATH_MAP.put("OSTIRALA", "./zinema/datuak/Ostirala.csv");
		PATH_MAP.put("LARUNBATA", "./zinema/datuak/Larunbata.csv");
		PATH_MAP.put("IGANDEA", "./zinema/datuak/Igandea.csv");
		
		/*PATH_MAP.put("Edukiak", "./datuak/Edukiak.csv");
		PATH_MAP.put("Langileak", "./datuak/Langileak.csv");
		PATH_MAP.put("ASTELEHENA", "./datuak/Astelehena.csv");
		PATH_MAP.put("ASTEARTEA", "./datuak/Asteartea.csv");
		PATH_MAP.put("ASTEAZKENA", "./datuak/Asteazkena.csv");
		PATH_MAP.put("OSTEGUNA", "./datuak/Osteguna.csv");
		PATH_MAP.put("OSTIRALA", "./datuak/Ostirala.csv");
		PATH_MAP.put("LARUNBATA", "./datuak/Larunbata.csv");
		PATH_MAP.put("IGANDEA", "./datuak/Igandea.csv");*/
		
		kargatuDatuak();
	}

	/**
	 * SunsetCinema inizializatzeko metodoa
	 * @return sunsetCinema klasea
	 */
	public static SunsetCinema getNireSunsetCinema() {
		return sunsetCinema;
	}

	/**
	 * 
	 * @param i Asteko egunaren zenbaki baliokidea
	 * @return Egun bakoitzaren informazioa lortzeko
	 */
	public boolean infoDauka(int i) {
		
		return astea[i].infoDauka();
	}

	/**
	 * Egun bakoitzaren iraupen totala jakiteko metodoa
	 * @param i Asteko egunaren zenbaki baliokidea
	 * @return Egun bakoitzeko iraupena
	 */
	public int getIraupena(int i) {
		
		return astea[i].getIraupena();
	}
	
	/**
	 * Asteko egunaren zenbaki baliokidea lortzeko metodoa
	 * @param e Asteko eguna idatziz
	 * @return Asteko egunaren zenbaki baliokidea
	 */
	public int getIraupena(AstekoEguna e) {
		
		return astea[this.fromAstekoEgunaToIndex(e)].getIraupena();
	}

	/**
	 * Egunak eduki dezakeen ordu maximoa lortzeko metodoa
	 * @param e Asteko eguna idatziz
	 * @return Egunak eduki dezakeen ordu maximoa
	 */
	public int getOrduMax(AstekoEguna e) {
		
		return astea[this.fromAstekoEgunaToIndex(e)].getOrduMax();
	}
	
	/**
	 * Egunak eduki dezakeen ordu maximoa lortzeko metodoa
	 * @param i Asteko egunaren zenbaki baliokidea
	 * @return Egunak eduki dezakeen ordu maximoa
	 */
	public int getOrduMax(int i) {
		
		return astea[i].getOrduMax();
	}

	/**
	 *  Egunak dituen eduki kopurua lortzeko metodoa
	 * @param i Asteko egunaren zenbaki baliokidea
	 * @return Egunak dituen eduki kopurua
	 */
	public int getEdukiKop(int i) {
		
		return astea[i].getEdukiKop();
	}

	/**
	 * Langileen informazioa irakurtzek eta ArrayList-ean sartzeko metodoa
	 */
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

	/**
	 * Eduki guztiak EdukiZerrenda batean sartzen dituen metodoa
	 * @param path Fitxategia irakurtzeko PATH-a
	 * @return Eduki guztiak EdukiZerrenda batean
	 */
	private EdukiZerrenda irakurriEdukiak(String path) {
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

	/** Asteko informazioa irakurtzen duen metodoa */
	public void irakurriAstea(){
		for (Eguna eguna : astea) {
			eguna.setEdukiak(irakurriEdukiak(PATH_MAP.get(eguna.getIzena())));
		}
	}

	/**
	 * CSV fitxategiak irakurtzeko metodoa
	 * @param path Fitxategia irakurtzeko PATH-a
	 * @return Informazioa ArrayList batean
	 */
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

    /** Datuak kargatzeko metodoa */
	public void kargatuDatuak() {
		this.edukiak = irakurriEdukiak(PATH_MAP.get("Edukiak"));
		this.irakurriLangileak();
		this.irakurriAstea();
    }

	/**
	 * Logeaketa konprobatzeko metodoa
	 * @param log Logina
	 * @param pas pasahitza
	 * @return true logina ondo badago eta false txarto badago
	 */
	public boolean logeatu(String log, String pas) {
		for (Langilea langilea : langileak) {
			if (langilea.logeatu(log, pas)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Login izena existizen baden konprobatzen duen metodoa
	 * @param log Logina
	 * @return true existitzen bada, bestela false
	 */
	public boolean erabiltzaileaExistitzenDa(String log) {
		for (Langilea langilea : langileak) {
			if (langilea.getLogin().equals(log)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Erabiltzaile berria erregistratzen duen metodoa
	 * @param izen Izena
	 * @param abizen1 Lehen abizena
	 * @param abizen2 Bigarren abizena
	 * @param jaioData Jaiotze data
	 * @param login Login izena
	 * @param pass Pasahitza
	 * @param kargua Kargua
	 * @return false iada existitzen bada erabiltzailea, bestela true
	 */
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
		return astea[fromAstekoEgunaToIndex(izeEguna)].getLaburpena();
	}

	/**
	 * Eduki berria sartutako egunean sartzeko metodoa
	 * @param edukia Edukiak
	 * @param izeEguna Asteko eguna idatziz
	 */
	public void infoEgunaSartu(Eduki edukia, AstekoEguna izeEguna) {
		astea[fromAstekoEgunaToIndex(izeEguna)].edukiaGehitu(edukia);
	}

	/**
	 * Asteko egunaren zenbaki baliokidea lortzeko metodoa
	 * @param izeEguna Asteko eguna idatziz
	 * @return Asteko egunaren zenbaki baliokidea
	 */
	private int fromAstekoEgunaToIndex(AstekoEguna izeEguna) {
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
		return i;
	}

	/**
	 * Asteko egunean dagoen edukiaren informazioa lortzeko metodoa
	 * @param edukia Edukia
	 * @param e Asteko eguna idatziz
	 * @return Asteko egunean dagoen edukiaren informazioa
	 */
	public String infoEgunEdukia(int edukia, AstekoEguna e) {
		return astea[fromAstekoEgunaToIndex(e)].infoEdukia(edukia);
	}
	
	/**
	 * Langileen informazioa CSV-etan gordetzeko metodoa
	 * @throws IOException e
	 */
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
	
	/**
	 * Larbumetrai berria sortzeko metodoa
	 * @param id ID-a
	 * @param tit Titulua
	 * @param iraupen Iraupena
	 * @param fabula Fabula
	 * @return true sortu bada, false iada existitzen bada
	 */
	public boolean gehituLarb(int id, String tit, int iraupen, String fabula) {
		return edukiak.sortuLarb(id, tit, iraupen, fabula);
	}

	/**
	 * Dokumental berria sortzeko metodoa
	 * @param id ID-a
	 * @param tit Titulua
	 * @param iraupen Iraupena
	 * @param tema Tema
	 * @param produktorea Produktorea
	 * @return true sortu bada, false iada existitzen bada
	 */
	public boolean gehituDoku(int id, String tit, int iraupen, String tema, String produktorea) {
		return edukiak.sortuDoc(id, tit, iraupen, tema, produktorea);
	}

	/**
	 * Pelikula berria sortzeko metodoa
	 * @param id ID-a
	 * @param tit Titulua
	 * @param iraupen Iraupena
	 * @param generoa Generoa
	 * @param pegi Pegi-a
	 * @return true sortu bada, false iada existitzen bada
	 */
	public boolean gehituPelik(int id, String tit, int iraupen, String generoa, Pegi pegi) {
		return edukiak.sortuPelik(id, tit, iraupen, generoa, pegi);
	}

	/**
	 * Edukien izenak ArrayList batean gordetzeko metodoa
	 * @return Edukien izenak ArrayList batean gordeta
	 */
	public ArrayList<String> edukienIzena() {
		return edukiak.edukienIzena();
	}

	/**
	 * Edukiak ArrayList-ean gordetzeko metodoa
	 * @param edukiakEdit Editatutako edukien ArrayList-a
	 * @return Edukiak ArrayList-ean gordeta
	 */
	public ArrayList<String> edukiakGehituta(ArrayList<String> edukiakEdit) {
        return edukiak.edukiakGehituta(edukiakEdit);
    }

	/**
	 * Edukiak CSV-an gordetzeko metodoa
	 * @throws IOException e
	 */
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

	/** Egunak CSV-ak idazteko metodoa */
	public void egunakCSV() {
		for (Eguna eguna : astea) {
			eguna.idatziCSV(PATH_MAP.get(eguna.getIzena()));
		}
    }

	/**
	 * Edukiak kentzeko metodoa
	 * @param id Edukiaren ID-a
	 */
	public void edukiaKendu(int id) {
		edukiak.ezabatuById(id);
	}

	/**
	 * Edukiaren tituluarekin id-a lortzeko metodoa
	 * @param titulua Titulua
	 * @return Edukiaren id
	 */
	public int lortuId(String titulua) {
		return edukiak.lortuId(titulua);
	}

	/**
	 * Eguneko informazioa array batean gordetzeko metodoa
	 * @param izeEguna Asteko eguna idatzita
	 * @return Eguneko informazioa array batean gordeta
	 */
	public String[][] editEguna(AstekoEguna izeEguna) {
		return astea[fromAstekoEgunaToIndex(izeEguna)].getEditLaburpena();
	}

	/**
	 * Eguneko edukiak EdukiZerrenda batean gordetzeko metodoa
	 * @param izeEguna Asteko eguna idatzita
	 * @return Eguneko edukiak EdukiZerrenda batean
	 */
	public EdukiZerrenda gehituDaitezkeEgunean(AstekoEguna izeEguna) {
		return astea[fromAstekoEgunaToIndex(izeEguna)].gehituDaitezke(this.edukiak);
	}

	/**
	 * Edukiak lortzeko metodoa
	 * @return Edukiak
	 */
	public EdukiZerrenda getEdukiak() {
		return edukiak;
	}

	/**
	 * EdukiZerrenda informazioa idazteko metodoa
	 * @param newEZerrenda Zerrenda berria
	 */
	public void setEZerrenda(EdukiZerrenda newEZerrenda) {
		this.edukiak = newEZerrenda;
	}

    /**
	 * Edukia gehitzeko metodoa Asteko egunarekin.
	 * @param edukia Edukiak
	 * @param eguna Asteko eguna idatzita
	 */
	public void gehituEdukiaEgunean(Eduki edukia, AstekoEguna eguna) {
		astea[fromAstekoEgunaToIndex(eguna)].edukiaGehitu(edukia);
    }

    /** Edukiak kargatzeko metodoa */
	public void kargatuEdukiak() {
		this.edukiak = irakurriEdukiak(PATH_MAP.get("Edukiak"));
    }

	/**
	 * Azken id-a lortzeko metodoa
	 * @return Azken id-a
	 */
	public int getAzkenId() {
		return edukiak.getAzkenId();
	}

	/**
	 * Eguna beteta dagoen edo ez jakiteko metodoa.
	 * @param eguna Asteko eguna idatzita
	 * @return true beteta badago, false ez badago
	 */
	public boolean egunaBetetaDago(AstekoEguna eguna) {
		return astea[fromAstekoEgunaToIndex(eguna)].betetaDago();
	}

    public void edukiaEditatu(Eduki edukia, String newTitle, int newDenb) {
		edukiak.editatuEdukia(edukia, newTitle, newDenb);
    }

}