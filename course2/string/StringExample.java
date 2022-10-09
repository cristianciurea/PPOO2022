package ro.ase.course2.string;

public class StringExample {

	public static void main(String[] args) {
		
		String s2 = new String();
        String sCuValoare = new String("Salut String!");
        
        String s3 = "Hello String!";
        s3 = "Hello Java!";
        
        //valoare memorata in String constant pool
        String string1 =  "Hello Strings";
        
        //utilizarea = intre 2 referinte String copiaza valoarea referintei si nu valoarea obiectului
        //valoare memorata in String constant pool
        String string2 = string1;
        
        //va afisa egale, deoarece referintele au aceeasi valoare/adresa
        if( string1 == string2 ) //compara referinte, NU valori
            System.out.println("egale");
        else
            System.out.println("NU sunt egale");
        
        String string3 =  "Hello String!";
        System.out.println(string3);
        //String este imuabil (immutable), deci nu isi poate modifica valoarea
        string3 = "Hello Java!";
        //cele doua instructiuni genereaza un nou obiect String si referinta string3 va primi adresa noului obiect
        System.out.println(string3);
        System.out.println(string3.charAt(4));
        System.out.println(string3.concat(string2));
        System.out.println(string3.replace("l", "L"));
                
        String string4 = new String("Hello String!");
	    if(string4 == string3)  //compara referinte, NU valori
        {
            System.out.println("EGALE");
        } else 
        {
            System.out.println("NU sunt egale");
        }
        
        //StringBuilder si StringBuffer sunt create folosind numai operatorul new, si nu cu operatorul = ca in cazul String
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuffer sb2 = new StringBuffer("Hello Java !");
        
        //eroare de compilare
        //sb1 = "Hello World !";   //NU este permis
        
        System.out.println(sb2);  
        sb2.insert(11, "version 1.7");
        System.out.println(sb2);   
        
        StringBuilder sb3 = new StringBuilder("12345");
        sb3.append("6789");
        System.out.println(sb3);    //afiseaza 123456789
 
        sb3.delete(0,2);
        System.out.println(sb3);    //afiseaza 3456789
 
        sb3.reverse();
        System.out.println(sb3);    //afiseaza 9876543

	}
}
