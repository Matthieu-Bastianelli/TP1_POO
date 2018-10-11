package tp1POOGestionSalaires;

public class Adresse {
	
	// Définition des attributs :
	int numeroDeRue = Integer.MIN_VALUE;
	String rue = null;
	String codePostale = null; //String à cause des Corses
	String ville = null;
	
	public Adresse(int numeroDeRue, String rue, String codePostale, String ville) {
		super(); // Comme pas de classe 'parent', utilise un constructeur vide par défaut(?) de la classe Object.
		this.numeroDeRue = numeroDeRue;
		this.rue = rue;
		this.codePostale = codePostale;
		this.ville = ville;
	}
	
	@Override
	public String toString() {
		String result = "Numero rue : "+numeroDeRue+"\r\n";
		result += "Nom de rue : "+rue+"\r\n";
		result += "Nom de codePostale : "+codePostale+"\r\n";
		result += "Nom de ville : "+ville+"\r\n";
		
		
		return result;
	}
	

}
