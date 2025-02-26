package ma.projet.organisation;

import ma.projet.Personne;

public class Etudiant extends Personne {

	private String cne;
	private Filiere filiere;

	public Etudiant(String nom, String prenom, String telephone, String email, String cne, Filiere filiere) {
		super(nom, prenom, telephone, email);
		this.cne = cne;
		this.filiere = filiere;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	@Override
	public String toString() {
	    return "Etudiant [id=" + getId() + ", nom=" + getNom().toUpperCase() + 
	           ", prenom=" + getPrenom().substring(0, 1).toUpperCase() + getPrenom().substring(1).toLowerCase() +
	           ", telephone=" + getTelephone() + ", email=" + getEmail() +
	           ", cne=" + cne + ", filiere=" + filiere.getCode() + " - " + filiere.getLibelle() + "]";
	}

}
