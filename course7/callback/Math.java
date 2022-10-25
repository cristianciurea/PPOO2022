package ro.ase.course7.callback;

public class Math implements IPrelucrare {

	@Override
	public int suma(int[] v) {
		// TODO Auto-generated method stub
		int s=0;
		for (int val:v)
			s+=val;
		return s;
	}

	@Override
	public int produs(int[] v) {
		// TODO Auto-generated method stub
		int prod = 1;
		for (int val:v)
			prod*=val;
		return prod;
	}

	@Override
	public int minim(int[] v) {
		// TODO Auto-generated method stub
		int min = v[0];
		for (int val: v)
			if (min>val) min=val;
		return min;
	}

	@Override
	public int maxim(int[] v) {
		// TODO Auto-generated method stub
		int max = v[0];
		for (int val: v)
			if (max<val) max=val;
		return max;
	}

}
