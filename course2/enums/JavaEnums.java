
package ro.ase.course2.enums;

//enumerare definita independent asemenea unei clase
enum TipMotor {DIESEL,BENZINA,HYBRID,ELECTRIC}
 
class Vehicul
{
    //enumerare definita in interiorul unei clase
    protected enum TipCulori{RED, GREEN, BLUE, WHITE};
 
    //atribut instanta  de tip TipMotor
    public TipMotor motor;
    //atribut instanta  de tip TipCulori
    public TipCulori culoare;
}

public class JavaEnums {
    
     public static void main(String[] args) {
         
         Vehicul v = new Vehicul();
         v.motor = TipMotor.DIESEL;
         v.culoare = Vehicul.TipCulori.GREEN;
      
         System.out.println("The vehicle motor type is "+v.motor);
         
         String motorType = TipMotor.ELECTRIC.toString();
         
         System.out.println("The motor type is "+motorType);
         
         for(TipMotor t : TipMotor.values()){
     	     System.out.println("TipMotor values: "+ t);
     	 }
      
         for(Vehicul.TipCulori t : Vehicul.TipCulori.values()){
        	 System.out.println("TipCulori values: "+ t);
         }
         
         TipMotor tm = TipMotor.BENZINA;
         switch(tm) {
	         case DIESEL:
	        	 System.out.println("Diesel inseamna motorina!");
	        	 break;
	         case HYBRID:
	        	 System.out.println("Hybrid inseamna benzina plus electric!");
	        	 break;
	         default:
	        	 System.out.println("Default este benzina!");
	        	 break;
         }
     }
}
