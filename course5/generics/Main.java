package ro.ase.course5.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Box<Integer> integerBox = new Box<Integer>();
		integerBox.add(1);
		integerBox.add(2);
		integerBox.add(3);
		integerBox.show();
		System.out.println("Cutia are "+integerBox.getSize()+" elemente");

		Box<String> stringBox = new Box<String>();
		stringBox.add("unu");
		stringBox.add("doi");
		stringBox.add("trei");
		stringBox.show();
		stringBox.remove("doi");
		stringBox.show();
		System.out.println("Cutia are "+stringBox.getSize()+" elemente");
		
		Box<?> cutie = new Box<String>();
		//Object o = cutie.get(0); // no problem
		//cutie.add(new Object()); // fail
		//cutie.add("patru");
		Box<String> cutieS = new Box<String>();
		cutieS.add("patru");

		Box<?> cutie2 = new Box<Integer>();
		//cutie2.add(1);
		//cutie2.add(new Integer(1));
		Box<Integer> cutieI = new Box<Integer>();
		cutieI.add(1);
		cutieI.add(new Integer(1));
		
		NumberBox<Integer> nbox = new NumberBox<Integer>();
		//NumberBox<String> nboxS = new NumberBox<String>();
		nbox.add(1);
		nbox.add(2);
		nbox.add(3);
		//nbox.add(4.5f);
		nbox.show();
		System.out.println(nbox.sum());
		System.out.println("Cutia Integer are "+nbox.getSize()+" elemente");
		
		NumberBox<Float> nboxF = new NumberBox<Float>();
		//nboxF.add(1);
		nboxF.add(2.3f);
		nboxF.add(3.4f);
		nboxF.add(4.5f);
		nboxF.show();
		System.out.println(nboxF.sum());
		System.out.println("Cutia Float are "+nboxF.getSize()+" elemente");
		
		NumberBox<? super Integer> cutie1 = new NumberBox<Number>();
		cutie1.add(10);
		cutie1.add(20);
		cutie1.add(new Integer(30));
		cutie1.show();
		System.out.println(cutie1.sum());
		System.out.println("Cutia 1 are "+cutie1.getSize()+" elemente");
		
		List lista= new LinkedList();
		lista.add(new Integer(0));
		Integer x = (Integer)lista.iterator().next();
		System.out.println("x="+x);
		
		List<Integer> lista1 = new LinkedList<Integer>();
		lista1.add(new Integer(0));
		Integer x1 = lista1.iterator().next();
		System.out.println("x="+x);
		
		Collection<?> c1 = new ArrayList<String>();
		//c1.add("ceva");    // compilation error
		
		Collection c2 = new ArrayList<String>();
		c2.add("ceva");
		c2.add(new Integer(300));
		for(Object s: c2)
			System.out.println(s.toString());

		OrderedPair<String, Integer> p1 = new OrderedPair<>("nota", 10);
		OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "world");
		OrderedPair<String, Box<Integer>> p3 = new OrderedPair<>("cutie", integerBox);

		p1.show();
		p2.show();
		//p3.show();
		System.out.println(p3.getKey());
		//afisare elemente din cutie
		p3.getValue().show();

		OrderedPair<String, Box<String>> dropBox = new OrderedPair<>("DropBox", stringBox);
		System.out.println(dropBox.getKey());
		//afisare elemente din cutie
		dropBox.getValue().show();
		System.out.println("---------------------");
		dropBox.setKey("DropBoxNew");
		System.out.println(dropBox.getKey());
		dropBox.getValue().add("ceva special");
		dropBox.getValue().remove("unu");
		dropBox.getValue().show();
	}
}
