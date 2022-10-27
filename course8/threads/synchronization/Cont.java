package ro.ase.course8.threads.synchronization;

public class Cont {
	
	private String titular;
	private String IBAN;
	
	public Cont(String titular, String iBAN) {
		super();
		this.titular = titular;
		this.IBAN = iBAN;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public static int balanta = 1000;
	public static int cheltuieli = 0;
	
	public static synchronized void extragere(int valoare)
	{
		if (valoare <= balanta)
		{
			System.out.println("Valoare de retras: "+valoare);
			balanta -= valoare;
			cheltuieli += valoare;
			System.out.println("Balanta: "+balanta);
			System.out.println("Cheltuieli: "+cheltuieli);
		}
		else
			System.out.println("Respins: "+valoare);
	}
}
