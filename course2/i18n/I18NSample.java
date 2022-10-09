package ro.ase.course2.i18n;

import java.util.*;

public class I18NSample {

   static public void main(String[] args) {

      String language;
      String country;

      if (args.length != 2) {
          language = new String("fr");
          country = new String("FR");
      } else {
          language = new String(args[0]);
          country = new String(args[1]);
      }

      Locale currentLocale;
      ResourceBundle messages;

      currentLocale = new Locale(language, country);

      messages =
        ResourceBundle.getBundle("examples.course2.i18n.MessagesBundle",currentLocale);

      System.out.println(messages.getString("greetings"));
      System.out.println(messages.getString("inquiry"));
      System.out.println(messages.getString("farewell"));
   }
}
