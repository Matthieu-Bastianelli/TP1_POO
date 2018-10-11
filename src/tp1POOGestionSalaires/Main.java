package tp1POOGestionSalaires;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Création d'un cadre : forfait journalier de 110€
		Cadre testCadre = new Cadre(110);

		System.out.println(testCadre.groupe);
		System.out.println(testCadre.mission);
		System.out.println("Le salaire Brut annuel du cadre est :\n"+testCadre.salaireAnnuelBrut+" \u20ac");
		System.out.println("Son salaire Net mensuel est :\n"+testCadre.salaireMensuelNet+" \u20ac\n");
		

		//Création d'un Technicien : taux horaire de 10€
		Technicien testTechnicien = new Technicien(10);

		System.out.println(testTechnicien.groupe);
		System.out.println(testTechnicien.mission);
		System.out.println("Le salaire Brut annuel du technicien est :\n"+testTechnicien.salaireAnnuelBrut+" \u20ac");
		System.out.println("Son salaire Net mensuel est :\n"+testTechnicien.salaireMensuelNet+" \u20ac\n");

		//Création d'un Commercial : dont le CA de l'année n-1 est de 100 000€
		Commercial testCommercial = new Commercial(100_000);

		System.out.println(testCommercial.groupe);
		System.out.println(testCommercial.mission);
		System.out.println("Le salaire Brut annuel du commercial est :\n"+testCommercial.salaireAnnuelBrut+" \u20ac");
		System.out.println("Son salaire Net mensuel est :\n"+testCommercial.salaireMensuelNet+" \u20ac\n");
		

	}

}
