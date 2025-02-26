package ma.projet.organisation;

public class Filiere {
	public static int count = 0;

	private int id;
	private String code;
	private String libelle;

	public Filiere(String code, String libelle) {
		this.id = ++count;
		this.code = code;
		this.libelle = libelle;
	}

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

	@Override
	public String toString() {
		return "Filiere [id=" + id + ", code=" + code + ", libelle=" + libelle + "]";
	}

}
