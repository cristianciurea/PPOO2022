package ro.ase.course5.classes3;

public abstract class Persoana {

	protected String id;
	protected String nume;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Persoana() {
		super();
		this.id = null;
		this.nume = null;
	}

	public Persoana(String id, String nume) {
		super();
		this.id = id;
		this.nume = nume;
	}

	public abstract void faceCeva(String ceva);
	
}
