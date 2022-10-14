package ro.ase.course4.collections;

public abstract class Identity {

	private String id;
	
	public Identity() {
		super();
		this.id = null;
	}
	
	public Identity(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public abstract void sayMyName(String name);
}
