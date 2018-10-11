package tp1POOGestionSalaires;

public class Commercial extends Employe {
	

	//Attributs de classe 
	static String groupe = "Technicien";
	static String mission = "Fabriquer et contrôler les produits de l'entreprise";

	//Attribut d'instance :
	float ChiffreAffaireNmoins1;
	

	// Création d'un constructeur
	Commercial (float ChiffreAffaireNmoins1){
		this.ChiffreAffaireNmoins1 = ChiffreAffaireNmoins1;
		this.salaireAnnuelBrut = calculSalaireAnnuelBrut();
		this.salaireMensuelNet = this.calculSalaireMensuelNet();
				
	}
	

	// Définition de la méthode calculSalaireAnnuelBrut dans cette classe 'fille' héritant de la classe Employe
	@Override
	public float calculSalaireAnnuelBrut() {
		return 0.05f * ChiffreAffaireNmoins1;
	}
}
