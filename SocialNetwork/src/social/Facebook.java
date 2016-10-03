package social;

import java.util.ArrayList;
import java.util.List;

public class Facebook extends Utility {
	private ArrayList<Utente> utenti = new ArrayList<Utente>();

	public Facebook() {

	}

	public void registraUtente(String cognome, String nome, int eta,
			char sesso, String email) {
		if (email.contains("@")) {
			Utente utente = new Utente(cognome, nome, eta, sesso, email);
			utenti.add(utente);
			System.out.println("La registrazzione è avvenuta con sucesso! "
					+ utente.getCognome());
		} else {
			System.out
					.println("La mail non è correta!\nInserire mail correta!");
		}

	}

	public void aggiungiAmici(String cognomeNome1, String cognomeNome2) {
		Utente utente1 = null, utenteDaAggiundere = null;

		// qui scorro sulla lista e quando trovo l'ogetto interessato lo
		// inizializzo alla mia Stringa locale
		for (Utente u : utenti) {
			String strTemp = u.getCognome() + " " + u.getNome();
			if (cognomeNome1.equalsIgnoreCase(strTemp)) {
				utente1 = u;
			}
		}

		// qui scorro sulla lista e quando trovo l'ogetto interessato lo
		// inizializzo alla mia Stringa locale
		for (Utente u : utenti) {
			String strTemp = u.getCognome() + " " + u.getNome();
			if (cognomeNome2.equalsIgnoreCase(strTemp)) {
				utenteDaAggiundere = u;
			}
		}
		// adesso asegno al mio utente l'amico(utente2) e viceverssa
		utente1.getAmici().add(utenteDaAggiundere);
		utenteDaAggiundere.getAmici().add(utente1);
	}

	public String getAmiciDiUnUtente(String cognomeDaInput, String nomeDaInput) {
		Utente utente = null;
		String amici = "";
		// qui corro sulla lista degli utenti, quando trovo il mio utente lo
		// inizializzo alla variabile locale
		for (Utente ut : utenti) {

			if (cognomeDaInput.equals(ut.getCognome())
					&& ut.getNome().equals(nomeDaInput)) {
				utente = ut;
			}
		}
		// qui scorro la lista degli amici,e prendo il cognome e il nome
		// per aggiungerli nella variabile locale amici
		for (Utente ut : utente.getAmici()) {
			String temp = ut.getCognome() + " " + ut.getNome();
			amici += "\n" + temp;
		}

		return "\nGli amici di " + cognomeDaInput + " " + nomeDaInput + amici;

	}

	public String getAmiciDiAmici(String cognomeDaConsole, String nomeDaConsole) {
		Utente utenteDaConsole = null;
		String nomiAmici = "";
		List<Utente> amiciUnivoci = new ArrayList<Utente>();

		// qui scorro la lista utenti
		for (Utente ut : utenti) {
			if (cognomeDaConsole.equals(ut.getCognome())
					&& ut.getNome().equals(nomeDaConsole)) {
				utenteDaConsole = ut;
			}
		}

		for (Utente amicoDiretto : utenteDaConsole.getAmici()) {
			for (Utente amicoIndiretto : amicoDiretto.getAmici()) {
				if (!utenteDaConsole.equals(amicoIndiretto))
					if (!utenteDaConsole.getAmici().contains(amicoIndiretto))
						if (!amiciUnivoci.contains(amicoIndiretto)) {
							amiciUnivoci.add(amicoIndiretto);
						}
			}
		}

		for (Utente amico : amiciUnivoci) {
			String temp = amico.getCognome() + " " + amico.getNome();
			nomiAmici += "\n" + temp;
		}
		return "\nGli amici degli amici " + nomiAmici;
	}

	public String getAmiciComuni(String cognome1, String nome1,
			String cognome2, String nome2) {
		Utente utente1 = null;
		Utente utente2 = null;
		String amiciComuni = "";
		// qui faccio un ciclo sulla lista utenti per trovare i miei utenti
		// e li inizializzo agli oggetti locali
		for (Utente ut : utenti) {
			// qui controllo se il nome e cognome fornito dal utente
			// è uguale al nome e cognome del oggetto che sto puntando con il
			// mio ciclo for
			if (cognome1.equals(ut.getCognome()) && ut.getNome().equals(nome1)) {
				utente1 = ut;
			} else if (cognome2.equals(ut.getCognome())
					&& ut.getNome().equals(nome2)) {
				utente2 = ut;
			}
		}

		for (Utente ut : utente1.getAmici()) {
			for (Utente u : utente2.getAmici()) {
				if (ut.getAmici().equals(u.getAmici())) {
					amiciComuni += ut.getCognome() + " " + ut.getNome() + "\n";
				}
			}
		}

		return "\nGli amici comuni \n" + amiciComuni;
	}

}
