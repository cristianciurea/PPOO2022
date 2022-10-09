
package ro.ase.course2.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void EcuatieGradul2() 
    		throws DeterminantException, 
    		MyRuntimeException
    {
        int a,b,c;
        try
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Valoare coeficient a =");
            a = s.nextInt();
            if(a == 0)
                throw new MyRuntimeException("Nu este ecuatie de gradul 2 !");

            System.out.println("Valoare coeficient b =");
            b = s.nextInt();
            System.out.println("Valoare coeficient c =");
            c = s.nextInt();
            System.out.printf("\n Ecuatia de rezolvat este %dx^2 + %dx + %d \n",
                    a,b,c);

            //calculez determinant
            double d = b*b - 4*a*c;

            if(d < 0)
                throw new DeterminantException("Determinantul este negativ!");

            double s1 = (-1*b + Math.sqrt(d))/(2*a);
            double s2 = (-1*b - Math.sqrt(d))/(2*a);

            System.out.println("Solutia 1 este "+s1);
            System.out.println("Solutia 2 este "+s2);
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Exceptie la citire ->" + ex.getMessage() );
        }
        catch(DeterminantException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            System.out.println("Am terminat !");
        }
    }

    // mai bine fara throws DeterminantException si atunci suntem obigati sa avem try-catch
    public static void main(String[] args)  
    {
        try
        {
            EcuatieGradul2();
        }
        //nu se ajunge aici daca exista si catch in functie insa trebuie
        catch(DeterminantException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
