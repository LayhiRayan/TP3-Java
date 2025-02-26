package ma.projet.organisation;

import ma.projet.organisation.Etudiant;
import ma.projet.organisation.Filiere;

public class Test {

	public static void main(String[] args) {
		Filiere filieres[] = new Filiere[3];
		filieres[0] = new Filiere("ma.Ingénierie des automatismes et informatique industrielle", "IAII");
		filieres[1] = new Filiere("Ingénierie des réseaux et télécommunications", "IRT");
		filieres[2] = new Filiere("Ingénierie informatique et réseaux", "IIR");
		Etudiant etuidants[] = new Etudiant[5];
		etuidants[0] = new Etudiant("Alami", "Samir", "06 55 44 33 22", "samir.alami@gmail.com", "G786780",
				filieres[1]);

		etuidants[1] = new Etudiant("Layhi", "SRayan", "06 00 00 00 01", "rayan.layhi@gmail.com", "G005678",
				filieres[2]);
		etuidants[2] = new Etudiant("Alaoui", "Khalid", "06 11 22 33 44", "khalaid.alaoui@gmail.com", "G955679",
				filieres[0]);
		etuidants[3] = new Etudiant("Benani", "Mohamed", "06 55 66 77 88", "mohamed.benani@gmail.com", "G365680",
				filieres[1]);
		etuidants[4] = new Etudiant("Khardali", "Anas", "06 85 23 76 23", "anas.khardali@gmail.com", "G365480",
				filieres[1]);
		for (Filiere f : filieres) {
			int i = 1;
			System.out.println("La liste des étudiants de la filière " + f.getLibelle() + " est :");
			boolean etdexiste = false;
			for (Etudiant e : etuidants) {
				if (e.getFiliere().equals(f)) {
					System.out.println(i + ". " + e.toString());
					i++;
					etdexiste = true;
				}
			}
			if (!etdexiste) {
				System.out.println("Aucun étudiant inscrit dans cette filière.");
			}
		}
	}
}
