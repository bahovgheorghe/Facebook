package social;

import java.util.ArrayList;

public class Utility  {
	private ArrayList<Utente> utenti = new ArrayList<Utente>();
	
	public Object trovaUtenti(String cognomeNome1 ) {
		Utente utente1 = null;
		for (Utente u : utenti) {
			String strTemp = u.getCognome() + " " + u.getNome();
			if (cognomeNome1.equals(strTemp)) {
				utente1 = u;
			}
		}
		
		return utente1;
	}


}
