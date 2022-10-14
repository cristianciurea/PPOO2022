package ro.ase.course4.comparator;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Angajat[] vectAng = new Angajat[4];
		vectAng[0] = new Angajat(100, "Gigel", 25, 1500);
		vectAng[1] = new Angajat(80, "Dorel", 26, 1400);
		vectAng[2] = new Angajat(150, "Ionel", 24, 1800);
		vectAng[3] = new Angajat(200, "Maria", 23, 2000);
		
		Arrays.sort(vectAng);
		System.out.println("Sortare implicita: "+Arrays.toString(vectAng));
	
		Arrays.sort(vectAng, Angajat.salariuComp);
		System.out.println("Sortare dupa salariu: "+Arrays.toString(vectAng));
		
		Arrays.sort(vectAng, Angajat.numeComp);
		System.out.println("Sortare dupa nume: "+Arrays.toString(vectAng));
		
		Arrays.sort(vectAng, Angajat.varstaComp);
		System.out.println("Sortare dupa varsta: "+Arrays.toString(vectAng));
		
		Arrays.sort(vectAng, new AngajatComparator());
		System.out.println("Sortare dupa id si nume: "+Arrays.toString(vectAng));
	}

}
