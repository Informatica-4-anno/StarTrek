
public abstract class Astronave {
	private String nome;
	protected int velocita;
	protected int laser;
	public Astronave(String nome) {
		this.nome = nome;
	}
	
	abstract String combatti();
	abstract String soccorri();
	abstract String analizza();


	@Override
	public String toString() {
		return "Astronave " + nome + ", velocita massima: " + velocita + " Potenza laser " + laser;
	}
	
}
