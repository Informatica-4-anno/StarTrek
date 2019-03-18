
public class Ambassador extends Astronave implements Combattente {
	private int n_siluri;
	public Ambassador(String nome, int siluri, int laser) {
		super(nome);
		n_siluri=siluri;
		super.laser=laser;
		velocita=10;
		
	}

	@Override
	public String siluri_fotonici() {
		// TODO Auto-generated method stub
		return "potenza massima "+n_siluri+" siluri fotonici";
	}

	@Override
	String combatti() {
		return "Uso laser e siluri fotonici "+ siluri_fotonici() ;
	}

	@Override
	String soccorri() {
		return "Chiedo aiuto";
	}

	@Override
	String analizza() {
		return "Guardo cosa c'è di strano";
	}

}
