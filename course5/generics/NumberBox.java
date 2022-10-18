package ro.ase.course5.generics;

import java.util.Iterator;

public class NumberBox<N extends Number> extends Box<N> {

	public NumberBox()
	{
		super();
	}
	
	public double sum()
	{
		double total = 0;
		for (Iterator<N> i=contents.iterator();i.hasNext();)
		{
			total+= i.next().doubleValue();
		}
		return total;
	}
}
