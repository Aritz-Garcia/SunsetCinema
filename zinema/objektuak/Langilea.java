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
						this.jaiotzeData=jaiotzeData;
                        this.enpresaKargua=enpresaKargua;
                    }
	public boolean logeatu(String log, String pas){
		if(this.login.equals(log) && this.pass.equals(pas)){
			return true;
		}
		return false;
	}

	public String getLogin() {
		return login;
	}

	public CharSequence getCSV() {
		return this.login + ";" + this.pass + ";" + this.izena + ";" + this.abizena1 + ";" + this.abizena2 + ";" + this.jaiotzeData + ";" + this.enpresaKargua + ";";
	}
}