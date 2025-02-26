package ma.projet;

public class Test {

	public static void main(String[] args) {
		Filiere filieres[] = new Filiere[3];
		filieres[0] = new Filiere("Ingénierie des automatismes et informatique industrielle", "IAII");
		filieres[1] = new Filiere("Ingénierie des réseaux et télécommunications", "IRT");
		filieres[2] = new Filiere("Ingénierie informatique et réseaux", "IIR");

		Etudiant etudiants[] = new Etudiant[4];
		etudiants[0] = new Etudiant("SAFI", "Amal", "0612095623", "safi.amal@gmail.com", "CNE128943", filieres[1]);
		etudiants[1] = new Etudiant("ALAMI", "Samir", "0612895478", "alami.samir@gmail.com", "CNE896712", filieres[1]);
		etudiants[2] = new Etudiant("Khardali", "Anas", "010283746", "khardali.anas@gmail.com", "CNE106529", filieres[0]);
		etudiants[3] = new Etudiant("Layhi", "Rayan", "0619480257", "layhi.rayan@gmail.com", "CNE719500", filieres[2]);

		String fil = "IRT";

		for (Etudiant e : etudiants) {
			if (e.getFiliere().getCode().equals(fil)) {
				System.out.println(e.getId() + " " + e.getCne() + " " + e.getNom() + " " + e.getPrenom());
			}

		}

	}

}
