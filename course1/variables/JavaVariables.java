
package ro.ase.course1.variables;

public class JavaVariables {

    public static void main(String[] args) {
      
        //variabile definite corect
        int vb1,vb2;
        float fvb2;
        double _temp;
        boolean $flag;
        double t1emp;
 
        //variabile definite gresit - eroare compilare
        //byte 3vb;             //incepe cu o cifra
        //long for;             //foloseste un cuvant cheie
        
        int iNumarCarti;        //notatie Ungara
        int NumarCarti;         //CamelCase
        int numarCarti;         //Java mixed case
        
        float vb4 = 23.5f;       //eroare compilare - possible loss of precision
        int vb5 = 45;            //eroare compilare - possible loss of precision
        boolean test = true;     //eroare compilare  - incompatible types
        
        int sum;		  //variabila locala definita in metoda main
        //sum = sum + 10;         //eroare compilare
                                  //variable sum might not have been initialized
    }
}
