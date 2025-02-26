package ma.projet.organisation;

public class Matiere {
	public static int comp = 0;
	private int id;
	private String code;
	private String libelle;
	private Formateur formateur;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public Matiere() {
		super();
		this.id = ++comp;
		this.code = code;
		this.libelle = libelle;
		this.formateur = formateur;
	}

	@Override
	public String toString() {
		return "Matiere [id=" + id + ", code=" + code + ", libelle=" + libelle + ", formateur=" + formateur + "]";
	}

}
