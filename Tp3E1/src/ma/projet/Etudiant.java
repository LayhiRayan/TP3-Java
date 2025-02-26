package ma.projet;

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
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", email="
				+ email + ", cne=" + cne + ", filiere=" + filiere.getCode() + " - " + filiere.getLibelle() + "]";
	}

}
