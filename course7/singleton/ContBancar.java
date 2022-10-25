package ro.ase.course7.singleton;

public abstract class ContBancar extends Cont {

	protected double balanta;
	protected String titular;
	String id;
	
	public String getTitular() 
	{
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getID()
	{
		return id;
	}
	
	@Override
	public double getBalanta()
	{
		return balanta;
	}
	
	@Override
	public void Depunere(double suma)
	{
		balanta += suma;
	}
}
