package tp1POOGestionSalaires;

public class Technicien extends Employe {
	

	//Attributs de classe 
	static String groupe = "Technicien";
	static String mission = "Fabriquer et contrôler les produits de l'entreprise";

	//Attribut d'instance :
	float tauxHoraire;
	

	// Création d'un constructeur
	Technicien (float tauxHoraire){
		this.tauxHoraire = tauxHoraire;
		this.salaireAnnuelBrut = calculSalaireAnnuelBrut();
		this.salaireMensuelNet = this.calculSalaireMensuelNet();
				
	}
	

	// Définition de la méthode calculSalaireAnnuelBrut dans cette classe 'fille' héritant de la classe Employe
	@Override
	public float calculSalaireAnnuelBrut() {
		return 1607 * tauxHoraire;
	}

}
