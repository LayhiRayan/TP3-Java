package ma.projet;

public class Filiere {
	private static int compt;
	private int id;
	private String code;
	private String libelle;

	public Filiere(String code, String libelle) {
		super();
		this.id = ++compt;
		this.code = code;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
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

	@Override
	public String toString() {
		return "Filiere [id=" + id + ", code=" + code + ", libelle=" + libelle + "]";
	}

}
