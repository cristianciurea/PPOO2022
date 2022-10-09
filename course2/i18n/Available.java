
package ro.ase.course2.i18n;

import java.util.*; 
import java.text.*; 


public class Available {
    static public void main(String[] args) { 
    	
        Locale list[] = DateFormat.getAvailableLocales(); 
        for (Locale aLocale : list) { 
        	System.out.println(aLocale.toString()); 
        } 
    } 
}
