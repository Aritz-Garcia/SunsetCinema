package objektuak;

import java.time.LocalDate;

/** 
 * Langilea 
 * Langileen ifnromazioa desberdina gordetzeko klasea
 */
public class Langilea{
    String login;
    String pass;
    String izena;
    String abizena1;
    String abizena2;
    LocalDate jaiotzeData;
    EnpresaKargua enpresaKargua;

    /** Langileak inizializatzeko konstruktore utsa */
    public Langilea(){

    }

    /**
     * Langileak inizializatzeko konstruktore betea
     * @param login Login izena
     * @param pass Pasahitza
     * @param izena Izena
     * @param abizena1 Lehenengo abizena
     * @param abizena2 Bigarren abizena
     * @param jaiotzeData Jaiotze data
     * @param enpresaKargua Enpresa Kargua
     */
    public Langilea(String login, String pass, String izena, String abizena1, String abizena2, 
                    LocalDate jaiotzeData, EnpresaKargua enpresaKargua){
                        this.login=login;
                        this.pass=pass;
                        this.izena=izena;
                        this.abizena1=abizena1;
                        this.abizena2=abizena2;
						this.jaiotzeData=jaiotzeData;
                        this.enpresaKargua=enpresaKargua;
    }
	
    /**
     * Erabiltzailea logeatzeko metodoa
     * @param log Login izena
     * @param pas Pasahitza
     * @return true login-a ondo abdago, bestela false
     */
    public boolean logeatu(String log, String pas){
		if(this.login.equals(log) && this.pass.equals(pas)){
			return true;
		}
		return false;
	}

	/**
     * Login-a lortzeko metodoa
     * @return Login izena String modua
     */
    public String getLogin() {
		return login;
	}

	/**
     * CSV-an Langilea motako edukiak ondo gordetzeko metodoa
     * @return Langilearen informazioa CSV-an gordetzeko
     */
    public CharSequence getCSV() {
		return this.login + ";" + this.pass + ";" + this.izena + ";" + this.abizena1 + ";" + this.abizena2 + ";" + this.jaiotzeData + ";" + this.enpresaKargua;
	}
}