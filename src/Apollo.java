
public class Apollo extends Astronave implements Soccorso {

	public Apollo(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String raggio_traente() {
		return "Ti salvo con il raggio traente";
	}

	@Override
	String combatti() {
		return "meglio di no";
	}

	@Override
	String soccorri() {
		return raggio_traente();
	}

	@Override
	String analizza() {
		return "Guardo cosa c'è di strano";
	}

}
