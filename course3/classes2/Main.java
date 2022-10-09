
package ro.ase.course3.classes2;

public class Main {
    
    public static void main(String[] args)
    {
        Avion av1 = new Avion();
        Avion av2 = new Avion(123, "Boeing 747", 10000);
        
        //Racheta r1 = new Racheta(); eroare - clasa abstracta
        
        NavetaSpatiala ns1 = new NavetaSpatiala();
        NavetaSpatiala ns2 = new NavetaSpatiala(456, 
        		"Airbus A380", 900, 12000);
       
        ns1.doSomething();
        ns2.doSomething();
        
        System.out.println(ns1.toString());
        System.out.println(ns2.toString());
        
        System.out.println("Numar avioane: "+Avion.nrAvioane);
    }
}
