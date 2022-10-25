package ro.ase.course7.callback;

public class Main {

	public static void main(String[] args)
	{
		Vector v = new Vector(5);
		v.addHandler(new Math());
		System.out.println("Suma este "+v.Prelucreaza(1));
		System.out.println("Produsul este "+v.Prelucreaza(2));
		System.out.println("Minimul este "+v.Prelucreaza(3));
		System.out.println("Maximul este "+v.Prelucreaza(4));
	}
}
