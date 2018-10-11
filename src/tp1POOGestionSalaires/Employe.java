package tp1POOGestionSalaires;

public abstract class Employe extends Personne{
	// Hérite de Personne
	
	//Attributs :
	int matricule;
	
//	String groupe; // pas ici car attributs statics des classes filles
//	String mission;
	
	float salaireAnnuelBrut;
	float salaireMensuelNet;
	

	public abstract float calculSalaireAnnuelBrut();
	
	
	public float calculSalaireMensuelNet() {
		return (1-0.24f) * (this.salaireAnnuelBrut/12);
	}

}
