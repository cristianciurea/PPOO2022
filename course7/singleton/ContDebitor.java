package ro.ase.course7.singleton;

public final class ContDebitor extends ContBancar implements IBeneficii {

	public final double BALANTA_MIN = 10.0;
	
	ContDebitor()
	{
		this.balanta = BALANTA_MIN;
		this.id = "ContD";
		this.titular = "Anonim";
	}
	
	@Override
	public void Retragere(double suma) throws ExceptieFonduriInsuficiente {
		// TODO Auto-generated method stub
		if ((balanta-suma)<BALANTA_MIN)
		{
			throw new ExceptieFonduriInsuficiente();
		}
		balanta-=suma;
	}

	@Override
	public void adaugaDobanda(float rata, int perioada) {
		// TODO Auto-generated method stub
		this.balanta = balanta *(1+rata*perioada/100);
	}
}
