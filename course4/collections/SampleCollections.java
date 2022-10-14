
package ro.ase.course4.collections;

import java.util.*;

public class SampleCollections {
    public static void main(String[] args) {
           
            ArrayList a = new ArrayList();
            //ArrayList<String> a = new ArrayList<String>();
            a.add("Hello");
            a.add("World!");
            System.out.println(a);
            System.out.println("**********************");
             
            ArrayList<Date> b = new ArrayList<Date>();
            b.add(new Date(0)); // 01 ianuarie 1970
            b.add(new Date());
            System.out.println(b);
            System.out.println("**********************");
            
            //Collection<String> names = new ArrayList<String>();
            ArrayList<String> names = new ArrayList<String>();
            names.add("Ion");
            names.add("Vasile");
            System.out.println(names);
            System.out.println(names.size());  // 2
            System.out.println(names.contains("Gigel")); // false
            String[] newNames = {"Maria", "Dorel", "Arthur", "Goethe", "Fernando"};
            for (String s : newNames ) names.add(s);
            names.addAll(Arrays.asList(newNames));
            System.out.println(names);
            System.out.println("**********************");

            SortedSet<String> snames = new TreeSet<String>();
            snames.addAll(names);
            System.out.println(snames);
            System.out.println(snames.subSet("Ion", "Vasile"));
            System.out.println(snames.headSet("Maria"));
            System.out.println(snames.tailSet("Maria"));
            System.out.println("**********************");
            
            List<String> l = new ArrayList<String>();
            String[] bus = {"Apple", "Google", "IBM", "Microsoft", "Oracle"}; 
            for (String s : bus) l.add(s);
            System.out.println(l);
            l.add("Yahoo");         // append
            System.out.println(l);
            l.add(1, "Cognos");     // add as second element
            System.out.println(l);
            l.set(1, "Cisco");      // replace second element
            System.out.println(l);
            System.out.println(l.get(0) + " " + l.get(1) + " " + l.get(2));
            System.out.println(l.subList(0,3));
            System.out.println("**********************");
            
            ListIterator<String> it = l.listIterator();
            while (it.hasNext())
                    System.out.print(it.next() + " ");
            System.out.println();
            while (it.hasPrevious())
                    System.out.print(it.previous() + " ");
            System.out.println();
            System.out.println("**********************");
            
            List<String> l2 = Arrays.asList(bus);
            System.out.println(l2);
            System.out.println(bus[1]);		 // "Google"
            l2.set(1, "Hewlett-Packard");
            System.out.println(l2);
            System.out.println(bus[1]);      // "Hewlett-Packard"
            System.out.println("**********************");
            
            Map<String,String> m = new HashMap<String,String>();
            m.put("GOOG", "Google Inc.");
            m.put("AAPL", "Apple Inc.");
            m.put("MSFT", "Microsoft Corporation");
            m.put("ORCL", "Oracle Corporation");
            m.put("CSCO", "Cisco Systems, Inc.");
            System.out.println("Stock symbol GOOG is for " + m.get("GOOG"));
            System.out.println("Stock symbol PLCS is for " + m.get("PLCS")); 
            System.out.println("Symbols: " + m.keySet());
            System.out.println("Companies: " + m.values());
            System.out.println("Mappings: " + m.entrySet());	
            System.out.println("**********************");
            
            Map<String,Collection<String>> m2 = new HashMap<String,Collection<String>>();
            m2.put("Shakespeare", new ArrayList<String>());
            m2.get("Shakespeare").add("Romeo and Juliet");
            m2.get("Shakespeare").add("Macbeth");
            m2.put("Bacon", new ArrayList<String>());
            m2.get("Bacon").add("New Atlantis");
            m2.get("Bacon").add("The Comedy of Errors");
            System.out.println("William Shakespeare wrote: " 
                            + m2.get("Shakespeare"));
            System.out.println("Sir Francis Bacon wrote: " 
                            + m2.get("Bacon"));
            System.out.println("**********************");
            
            
            Hashtable<Integer,ArrayList<String>> ma = new Hashtable<Integer,ArrayList<String>>();
            ma.put(2215,new ArrayList<String>());
            ma.get(2215).add("Java");
            ma.get(2215).add("C#");
            ma.put(2320,new ArrayList<String>());
            ma.get(2320).add("POO");
            ma.get(2320).add("Data Structures");
            System.out.println("La sala 2215:" + ma.get(2215));
            System.out.println("La sala 2320:" + ma.get(2320));
            
	}
}
