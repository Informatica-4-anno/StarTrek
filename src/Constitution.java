
public class Constitution extends Astronave implements Combattente, Scientifica {
    private int n_siluri;
	public Constitution(String nome, int siluri, int laser) {
		super(nome);
		n_siluri=siluri;
		super.laser=laser;	
	}

	@Override
	public String sensori() {
		return "Sensori a lungo raggio";
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
		// TODO Auto-generated method stub
		return "Chiedo aiuto";
	}

	@Override
	String analizza() {
		return sensori();
	}

}
