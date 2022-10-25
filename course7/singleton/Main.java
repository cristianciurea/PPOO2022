package ro.ase.course7.singleton;

public class Main {

	public static void main(String[] args)
	{
		Bancher myBanker = Bancher.getBancher();
		
		ContCreditor cc = (ContCreditor)myBanker.deschideCont("Credit");
		cc.setTitular("Gigel Ionescu");
		ContDebitor cd = (ContDebitor)myBanker.deschideCont("Debit");
		cd.setTitular("Dorel Predescu");
		
		System.out.println("Contul debitor are id "+cd.getID()+" titular "+cd.getTitular()+" si balanta "+cd.getBalanta());
		System.out.println("Contul creditor are id "+cc.getID()+" titular "+cc.getTitular()+" si balanta "+cc.getBalanta());
		
		cd.adaugaDobanda(0.15f, 12);
		
		System.out.println("Contul debitor are id "+cd.getID()+" titular "+cd.getTitular()+" si balanta "+cd.getBalanta());
	}
}
