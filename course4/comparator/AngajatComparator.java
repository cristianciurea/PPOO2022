package ro.ase.course4.comparator;

import java.util.Comparator;

public class AngajatComparator implements Comparator<Angajat> {

	@Override
	public int compare(Angajat a1, Angajat a2) {
		// TODO Auto-generated method stub
		int flag = a1.getId() - a2.getId();
		if (flag==0)
			flag = a1.getNume().compareTo(a2.getNume());
		return flag;
	}

}
