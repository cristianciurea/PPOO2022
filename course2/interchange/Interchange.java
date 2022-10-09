package ro.ase.course2.interchange;

class IntHolder { 
    public int value; 
    
    IntHolder (int v)
    {
        value=v;
    }
}

public class Interchange {
	
	public static void doInterchange1(int p, int q)
    {
        int t=p;
        p=q;
        q=t;
    }
	
	public static void doInterchange2(Integer ra, 
			Integer rb)
    {
        int temp=ra;
        ra=rb;
        rb=temp;
    }
	
	public static void doInterchange3(IntHolder a, 
			IntHolder b)
    {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
	
	 public static void main(String[] args) {
	        
	        int vb1=10;
	        int vb2=20;
	        
	        Integer vb3 = new Integer(vb1);
	        Integer vb4 = new Integer(vb2);
	        
	        doInterchange1(vb1,vb2);
	        System.out.print("vb1=");
	        System.out.println(vb1);
	        System.out.print("vb2=");
	        System.out.println(vb2);
	        
	        doInterchange2(vb3,vb4);
	        System.out.print("vb1=");
	        System.out.println(vb1);
	        System.out.print("vb2=");
	        System.out.println(vb2);
	        
	        IntHolder v1 = new IntHolder(vb1);
	        IntHolder v2 = new IntHolder(vb2);
	        doInterchange3(v1,v2);
	        System.out.print("v1=");
	        System.out.println(v1.value);
	        System.out.print("v2=");
	        System.out.println(v2.value);
	 }
}
