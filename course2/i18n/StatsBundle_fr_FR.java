
package ro.ase.course2.i18n;

import java.util.*;

public class StatsBundle_fr_FR extends ListResourceBundle {
   
    public Object[][] getContents() {
        return contents;
    }

    private Object[][] contents = {
        { "GDP", new Integer(12300) },
        { "Population", new Integer(1234567) },
        { "Literacy", new Double(0.97) },
    };
}
