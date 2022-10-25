package ro.ase.course7.callback;

public class Vector {

	private IPrelucrare handler = null;
	private int[] valori;
	
	public Vector(int n)
	{
		valori = new int[n];
		for (int i=0;i<n;i++)
			valori[i]=i+1;
	}
	
	public void addHandler(IPrelucrare h)
	{
		handler = h;
	}
	
	public int Prelucreaza(int tip)
	{
		switch (tip){
		case 1:
			return handler.suma(this.valori);
		case 2:
			return handler.produs(this.valori);
		case 3:
			return handler.minim(this.valori);
		case 4:
			return handler.maxim(this.valori);
		default:
				return 0;
		}
	}
}
