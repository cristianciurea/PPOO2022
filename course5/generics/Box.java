package ro.ase.course5.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<T> {

	protected List<T> contents;
	
	public Box()
	{
		contents = new ArrayList<T>();
	}
	
	public int getSize()
	{
		return contents.size();
	}
	
	public boolean isEmpty()
	{
		return (contents.size() == 0);
	}
	
	public void add(T obj)
	{
		contents.add(obj);
	}
	
	public void remove(T obj)
	{
		contents.remove(obj);
	}
	
	public T get(int index)
	{
		return contents.get(index);
	}
	
	public void show()
	{
		for(Iterator i = contents.iterator();i.hasNext();)
		{
			System.out.println(i.next().toString());
		}
	}
}
