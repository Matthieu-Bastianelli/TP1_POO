package tp1POOGestionSalaires;

public class Cadre extends Employe {
	
	//Attributs de classe 
	static String groupe = "Cadre";
	static String mission = "Gérer les projets";
	
	//Attribut d'instance :
	float tauxJournalier;
	
	// Création d'un constructeur
	Cadre (float tauxJournalier){
		this.tauxJournalier = tauxJournalier;
		this.salaireAnnuelBrut = calculSalaireAnnuelBrut();
		this.salaireMensuelNet = calculSalaireMensuelNet();	
	}
	
	// Définition de la méthode calculSalaireAnnuelBrut dans cette classe 'fille' héritant de la classe Employe
	@Override
	public float calculSalaireAnnuelBrut() {
		return 212 * tauxJournalier;
	}

}
