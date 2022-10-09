package ro.ase.course2.i18n;

import java.util.*;

public class ListDemo {

   static void displayValues(Locale currentLocale) {

      ResourceBundle stats = ResourceBundle.getBundle("examples.course2.i18n.StatsBundle",currentLocale);

      Integer gdp = (Integer)stats.getObject("GDP");
      System.out.println("GDP = " + gdp.toString());
      Integer pop = (Integer)stats.getObject("Population");
      System.out.println("Population = " + pop.toString());
      Double lit = (Double)stats.getObject("Literacy");
      System.out.println("Literacy = " + lit.toString());
      
   } // displayValues

   public static void main(String[] args) {

      Locale[] supportedLocales = {
         new Locale("fr","FR"),
         new Locale("en","CA")
      };

      for (int i = 0; i < supportedLocales.length; i++) {
         System.out.println("Locale = " + supportedLocales[i]);
         displayValues(supportedLocales[i]);
         System.out.println();
      }

   } // main

} // class
