package objektuak;

import java.time.LocalDate;

public class Langilea{
    String login;
    String pass;
    String izena;
    String abizena1;
    String abizena2;
    LocalDate jaiotzeData;
    EnpresaKargua enpresaKargua;

    public Langilea(){

    }

    public Langilea(String login, String pass, String izena, String abizena1, String abizena2, 
                    LocalDate jaiotzeData, EnpresaKargua enpresaKargua){
                        this.login=login;
                        this.pass=pass;
                        this.izena=izena;
                        this.abizena1=abizena1;
                        this.abizena2=abizena2;
                        this.enpresaKargua=enpresaKargua;
                    }

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena1() {
		return abizena1;
	}

	public void setAbizena1(String abizena1) {
		this.abizena1 = abizena1;
	}

	public String getAbizena2() {
		return abizena2;
	}

	public void setAbizena2(String abizena2) {
		this.abizena2 = abizena2;
	}

	public LocalDate getJaiotzeData() {
		return jaiotzeData;
	}

	public void setJaiotzeData(LocalDate jaiotzeData) {
		this.jaiotzeData = jaiotzeData;
	}

	public EnpresaKargua getEnpresaKargua() {
		return enpresaKargua;
	}

	public void setEnpresaKargua(EnpresaKargua enpresaKargua) {
		this.enpresaKargua = enpresaKargua;
	}
}