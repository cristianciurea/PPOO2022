package ro.ase.course4.collections;

import java.util.*;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Name n1 = new Name();
		Name n2 = new Name("12345", "Ion","Popescu");
		Name n3 = (Name)n2.clone();
		n3.setId("33333");
		n3.setFirstName("Clona");
		
		Name nameArray[] = {
				new Name("00000", "Marin","Georgescu"),
				new Name("11111", "Vasile","Costescu"),
				new Name("22222", "Gigel","Predescu")
		};
		
		//------------- ArrayList
		ArrayList<Name> listaNume = new ArrayList<Name>();
		listaNume.add(n1);
		listaNume.add(n2);
		for(int i=0;i<nameArray.length;i++)
			listaNume.add(nameArray[i]);
		
		//Collections.sort(listaNume);
		for(int i=0;i<listaNume.size();i++)
			System.out.println(listaNume.get(i));
		System.out.println("***************************");
		
		StringBuilder sb1 = new StringBuilder();
		for (Name n:listaNume)
		{
			sb1.append(n.getFirstName());
			sb1.append(" ");
			sb1.append(n.getLastName());
			sb1.append("\n");
		}
		
		System.out.println(sb1);
		System.out.println("***************************");
		
		//------------- List<>
		List<Name> names = Arrays.asList(nameArray);
		
		Name[] vectorNume = names.toArray(new Name[0]);
		for(int i=0;i<vectorNume.length;i++)
			System.out.println(vectorNume[i]);
		System.out.println("***************************");
		
		Collections.shuffle(names);
		
		System.out.println(names);
		System.out.println("***************************");
		
		Collections.sort(names);
	
		StringBuilder sb2 = new StringBuilder();
		for (Name n:names)
		{
			sb2.append(n.getFirstName());
			sb2.append(" ");
			sb2.append(n.getLastName());
			sb2.append("\n");
		}
		
		System.out.println(sb2);
		System.out.println("***************************");
		System.out.println(names);
		System.out.println("***************************");
		
		for(Iterator<Name> i=names.iterator();i.hasNext();)
		{
			Name n = i.next();
			System.out.println(n.toString());
			//String s = i.next().toString();
			//System.out.println(s);
		}

		//------------- Vector<>
		Vector<Name> nameVector = new Vector<>();
		nameVector.add(n1);
		nameVector.add(n2);
		nameVector.add(n3);
		nameVector.remove(n1);
		nameVector.add(0, n3);
		for(Name n: nameVector)
			System.out.println("vector: "+n.toString());

		//------------- SortedSet<>
		SortedSet<Name> sNames = new TreeSet<Name>();
		sNames.addAll(names);
		sNames.add(n3);
        System.out.println("SortedSet: \n"+sNames.headSet(n2));
        System.out.println("***************************");
        System.out.println("SortedSet: \n"+sNames.tailSet(n2));
        System.out.println("***************************");
		System.out.println("SortedSet: \n"+sNames);
		System.out.println("***************************");
		
		//------------- Hashtable
		Hashtable<Integer, ArrayList<String>> h1 = new 
				Hashtable<Integer, ArrayList<String>>();
		h1.put(2001, new ArrayList<String>());
		h1.get(2001).add("Java");
		h1.get(2001).add("POO");
		
		h1.put(2320, new ArrayList<String>());
		h1.get(2320).add("Data Structures");
		h1.get(2320).add("PAW");
		
		System.out.println("La sala 2001: "+h1.get(2001));
		System.out.println("La sala 2320: "+h1.get(2320));
		System.out.println("***************************");
		
		Hashtable<Integer, ArrayList<Name>> h2 = new 
				Hashtable<Integer, ArrayList<Name>>();
		h2.put(2001, new ArrayList<Name>());
		h2.get(2001).add(nameArray[0]);
		h2.get(2001).add(nameArray[1]);
		
		h2.put(2320, new ArrayList<Name>());
		h2.get(2320).add(nameArray[2]);
		
		System.out.println("La sala 2001: "+h2.get(2001));
		System.out.println("La sala 2320: "+h2.get(2320));
		System.out.println("***************************");
		
		n2.sayMyName(n2.toString());
		System.out.println("***************************");
		
		Persoana p1 = new Persoana(n2.getId(), n2.getFirstName(), n2.getLastName(), "Bucharest", 25, "07898989");
		System.out.println(p1);
		p1.sayMyName(p1.toString());
		p1.voteaza("partid");
	}
	
}
