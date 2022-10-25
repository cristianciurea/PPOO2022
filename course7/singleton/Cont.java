package ro.ase.course7.singleton;

public abstract class Cont {

	public abstract void Depunere(double suma);
	public abstract void Retragere(double suma) throws ExceptieFonduriInsuficiente;
	public abstract double getBalanta();
	
	public void Transfer(double suma, Cont contDestinatie) 
			throws ExceptieTransferIlegal, ExceptieFonduriInsuficiente
	{
		if (contDestinatie==this)
		{
			ExceptieTransferIlegal ex = new ExceptieTransferIlegal();
			throw ex;
		}
		else
		{
			Retragere(suma);
			contDestinatie.Depunere(suma);
		}
	}
}
