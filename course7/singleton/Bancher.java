package ro.ase.course7.singleton;

public final class Bancher {

	private static Bancher obj;
	private int nextid;
	
	private Bancher()
	{
		nextid = 1001;
	}
	
	public static Bancher getBancher()
	{
		if (obj==null) obj = new Bancher();
		return obj;	
	}
	
	public ContBancar deschideCont(String tip)
	{
		ContBancar cont;
		if (tip.equals("Debit")) cont = new ContDebitor();
		else
			if (tip.equals("Credit")) cont = new ContCreditor();
			else return null;
		cont.id+= nextid++;
		return cont;
	}
}
