package ro.ase.course5.classes3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args)
	{
		Student s1 = new Student();
		Student s2 = new Student("5678", "Ionel", 22, 9.5f);
		Student s3 = new Student(s2);
		
		System.out.println(s1.getAnStudiu()+" "+s1.getNume()+" "+s1.getVarsta()+" "+s1.getMedie());
		System.out.println(s2.getAnStudiu()+" "+s2.getNume()+" "+s2.getVarsta()+" "+s2.getMedie());
		System.out.println(s2);
		
		System.out.println("Nr. studenti ="+Student.nr);
		System.out.println("Apel metoda statica "+Student.numarStud());
		
		Angajat a1 = new Angajat("1234", "Popescu", "Ion", Angajat.Categorie.FULLTIME);
		
		s1.faceCeva("tema student");
		a1.faceCeva("tema angajat");
		
		MailServer ms = new MailServer();
		MailServer.senders.add(s1);
		MailServer.senders.add(s2);
		MailServer.senders.add(s3);
		MailServer.senders.add(a1);
		ms.sendAllSubmissions();

		List<? extends Integer> intList = new ArrayList<>();
		//intList.add(new Integer(1));//NU MERGE
		Integer[] vector = {10, 20, 30};
		List<Integer> lista = Arrays.asList(vector);
		intList = lista;
		for(Integer elem: intList)
			System.out.println(elem);
		List<? extends Number>  numList = intList;  // OK. List<? extends Integer> is a subtype of List<? extends Number>
		for(Number elem: numList)
			System.out.println(elem);

		//ConsumerSuper - Wildcard delimitat inferior
		List<? super Student> lista1 = new ArrayList<Student>();
		lista1.add(s1);
		lista1.add(s2);
		lista1.add(s3);
		//lista1.add(a1); //NU MERGE
		for(Object s: lista1)
			System.out.println(s.toString());
		
		System.out.println("------------------------------");

		//ProducerExtends - Wildcard delimitat superior
		List<? extends Persoana> lista2 = new ArrayList<Angajat>();
		//lista2.add(a1); //NU MERGE
		lista2 = ms.senders;
		for(Object a: lista2)
			System.out.println(a.toString());
	}
}
