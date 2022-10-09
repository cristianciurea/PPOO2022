
package ro.ase.course3.classes2;

public class Avion extends Racheta {
    
    public static int nrAvioane = 0;
    public final int serie;
    public String denumire;
    
    public static int getNrAvioane() {
		return nrAvioane;
	}

	public static void setNrAvioane(int nrAvioane) {
		Avion.nrAvioane = nrAvioane;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public int getSerie() {
		return serie;
	}
 
    public Avion()
    {
    	super();
        serie = 1;
        denumire = "Avion";
        nrAvioane++;
        System.out.println("Constructor implicit Avion");
    }
    
    public Avion(int s, String d, int v)
    {
    	super(v);
        serie = s;
        denumire = d;
        nrAvioane++;
        System.out.println("Constructor explicit Avion");
    }

    @Override
    public void doSomething() {
        System.out.println("Implementare metoda doSomething() din clasa abstracta Racheta");
    }
}
