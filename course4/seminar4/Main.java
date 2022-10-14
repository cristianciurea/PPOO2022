package ro.ase.course4.seminar4;

import ro.ase.course4.seminar4.Masina;
import ro.ase.course4.seminar4.tipVehicul;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        float[] preturi1 = {600.5f, 750.5f, 890.9f};

        Masina m1 = new Masina(4, 5, tipVehicul.MASINA,
                "Mercedes", 30000, 2020, "negru", "diesel", preturi1);
        System.out.println(m1.toString());

        Masina m2 = new Masina(8, 2, tipVehicul.CAMION, "Mercedes",
                50000, 2019, "rosu", "diesel", preturi1);
        System.out.println(m2.toString());

        Masina m3 = new Masina(4, 2, tipVehicul.TRACTOR, "New Holland",
                200000, 2021, "verde", "diesel", preturi1);
        System.out.println(m3.toString());

        m2.setPret(33000);
        System.out.println(m2.getPret());

        System.out.println("-----------------------");

        Masina[] vectMasini = {m1, m2, m3};
        for(int i=0;i<vectMasini.length;i++)
            System.out.println(vectMasini[i]);

        System.out.println("-----------------------");

        for(Masina m: vectMasini)
            System.out.println(m.toString());

        System.out.println("-----------------------");

        for(Masina m: vectMasini)
            System.out.println(m.calculPretVanzare());

        for(Masina m: vectMasini)
            System.out.println(m.spuneMarca());

        Masina m4 = m3.clone();
        m4.setPret(99000);

        System.out.println("---------------ArrayList-----------------");
        ArrayList<Masina> listaMasini = new ArrayList<>();
        for(int i=0;i<vectMasini.length;i++)
            listaMasini.add(vectMasini[i]);
        listaMasini.add(m4);

        Collections.sort(listaMasini);
        for(int i=0;i<listaMasini.size();i++)
            System.out.println(listaMasini.get(i));

        System.out.println("---------------List-----------------");
        List<Masina> masini = Arrays.asList(vectMasini);
        vectMasini[0] = m4;
        for(int i=0;i<masini.size();i++)
            System.out.println(masini.get(i));
        Masina[] vect2Masini = masini.toArray(new Masina[0]);
        for(int i=0;i<vect2Masini.length;i++)
            System.out.println(vect2Masini[i]);

        Collections.shuffle(masini);

        for(Iterator<Masina> i = masini.iterator(); i.hasNext();)
        {
            Masina m = i.next();
            System.out.println(m);
            /*String s = i.next().toString();
            System.out.println(s);*/
        }

        System.out.println("---------------Vector-----------------");
        Vector<Masina> masiniVector = new Vector<>();
        masiniVector.add(m1);
        masiniVector.add(m2);
        masiniVector.add(m3);
        masiniVector.remove(m1);
        masiniVector.add(0, m4);

        for(Masina m: masiniVector)
            System.out.println(m);

        System.out.println("---------------SortedSet-----------------");
        SortedSet<Masina> masinaSortedSet = new TreeSet<>();
        masinaSortedSet.addAll(masini);
        masinaSortedSet.add(m4);
        System.out.println(masinaSortedSet);

        System.out.println("---------------HashTable-----------------");
        Hashtable<Integer, ArrayList<Masina>> ht = new Hashtable<>();
        ht.put(100, new ArrayList<>());
        ht.get(100).add(vectMasini[0]);
        ht.get(100).add(vectMasini[1]);
        ht.get(100).add(vectMasini[2]);

        ht.put(200, new ArrayList<>());
        ht.get(200).add(m4);

        System.out.println("La garajul cu nr. 100: "+ht.get(100));
        System.out.println("La garajul cu nr. 200: "+ht.get(200));

        Student[] vectStudenti = new Student[5];
        vectStudenti[0] = new Student(7.8);
        vectStudenti[1] = new Student(5.5);
        vectStudenti[2] = new Student(6.7);
        vectStudenti[3] = new Student(8.9);
        vectStudenti[4] = new Student(6.5);

        Arrays.sort(vectStudenti, new Student.StudentComparator());
        for(int i=0;i<vectStudenti.length;i++)
            System.out.println(vectStudenti[i]);
    }
}
