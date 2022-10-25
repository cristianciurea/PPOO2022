package ro.ase.course7.singleton;

public final class ContCreditor extends ContBancar {

	public final double MAX_CREDIT = 1000.0;
	
	ContCreditor()
	{
		this.balanta = 0;
		this.id = "ContC";
		this.titular = "Anonim";
	}
	
	@Override
	public void Retragere(double suma) throws ExceptieFonduriInsuficiente {
		// TODO Auto-generated method stub
		if ((balanta-suma)<-MAX_CREDIT)
		{
			throw new ExceptieFonduriInsuficiente();
		}
		balanta -= suma;
	}
}
