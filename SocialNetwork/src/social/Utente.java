
package social;

import java.util.ArrayList;

public class Utente {
	private String cognome;
	private String nome;
	private int eta;
	private char sesso;
	private String email;
	
	private  ArrayList<Utente> amici = new ArrayList<Utente>();

	
	
	public Utente() {
	}

	public Utente(String cognome, String nome, int eta, char sesso, String email) {
		this.cognome = cognome;
		this.nome = nome;
		this.eta = eta;
		this.sesso = sesso;
		this.email = email;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public char getSesso() {
		return sesso;
	}

	public void setSesso(char sesso) {
		this.sesso = sesso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Utente> getAmici() {
		return amici;
	}

	public void setAmici(ArrayList<Utente> amici) {
		this.amici = amici;
	}
	
	
	
}
