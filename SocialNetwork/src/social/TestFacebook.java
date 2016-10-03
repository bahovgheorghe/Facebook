package social;

public class TestFacebook {

	public static void main(String[] args) {

		Facebook f = new Facebook();

		Utente u1 = new Utente("aaaa", "aaaa", 18, 'M', "aaaa@alfa.com");

		Utente u2 = new Utente("bbbb", "bbbb", 18, 'M', "bbbb@alfa.com");

		Utente u3 = new Utente("cccc", "cccc", 28, 'f', "cccc@alfa.com");

		Utente u4 = new Utente("dddd", "dddd", 28, 'F', "dddd@alfa.com");

		Utente u5 = new Utente("eeeee", "eeee", 28, 'F', "eeeee@alfa.com");

		f.registraUtente("aaaa", "aaaa", 18, 'M', "aaaa@alfa.com");
		f.registraUtente("bbbb", "bbbb", 18, 'M', "bbbb@alfa.com");
		f.registraUtente("cccc", "cccc", 28, 'f', "cccc@alfa.com");
		f.registraUtente("dddd", "dddd", 28, 'F', "dddd@alfa.com");
		f.registraUtente("eeeee", "eeee", 28, 'F', "eeeee@alfa.com");

		f.aggiungiAmici(u1.getCognome() + " " + u1.getNome(), u2.getCognome()
				+ " " + u2.getNome());
		f.aggiungiAmici(u1.getCognome() + " " + u1.getNome(), u3.getCognome()
				+ " " + u3.getNome());
		f.aggiungiAmici(u1.getCognome() + " " + u1.getNome(), u4.getCognome()
				+ " " + u4.getNome());
		f.aggiungiAmici(u1.getCognome() + " " + u1.getNome(), u5.getCognome()
				+ " " + u5.getNome());
		f.aggiungiAmici(u2.getCognome() + " " + u2.getNome(), u3.getCognome()
				+ " " + u3.getNome());

		// System.out.println(f.getAmiciDiUnUtente("eeeee","eeee"));

		System.out.println(f.getAmiciDiAmici("bbbb", "bbbb"));

		// System.out.println(f.getAmiciComuni("aaaa","aaaa","cccc","cccc"));

	}

}
