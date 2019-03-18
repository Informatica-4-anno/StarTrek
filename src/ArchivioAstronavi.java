import java.util.*;

public class ArchivioAstronavi {

	public ArchivioAstronavi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Astronave> flotta = new ArrayList<Astronave>();
	
		flotta.add(new Constitution("Enterprise",500,50));
		flotta.add(new Apollo("Pina"));
		flotta.add(new Ambassador("Pinta",100,10));
		
		for ( Astronave a : flotta ) {
			System.out.println(a);
			if ( a instanceof Combattente) {
				System.out.println("  Astronave da combattimento");
				System.out.println("  Combatto "+((Combattente)a).siluri_fotonici());
			}
			if (a instanceof Soccorso) {
				System.out.println("  Astronave da soccorso");
				System.out.println("  Soccorro "+((Soccorso)a).raggio_traente());
			}
			if (a instanceof Scientifica) {
				System.out.println("  Astronave scientifica");
				System.out.println("  Ricerca "+((Scientifica)a).sensori());
			}
		}
	}

}
