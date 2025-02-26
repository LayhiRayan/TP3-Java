package ma.projet.organisation;
import ma.projet.Personne;

public class Formateur extends Personne{
	private String matricule;

	public Formateur(String nom, String prenom, String telephone, String email, String matricule) {
		super(nom, prenom, telephone, email);
		this.matricule = matricule;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	@Override
	public String toString() {
		return "Formateur [matricule=" + matricule + "]";
	}
	
}

