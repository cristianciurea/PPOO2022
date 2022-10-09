package ro.ase.course3.classes1;

abstract class Persoana
{
	public String prenume;
	
	public Persoana()
	{
		this.prenume = null;
	}
	
	public Persoana(String prenume) {
		super();
		this.prenume = prenume;
	}

	abstract void mananca();
}

public class Abonat extends Persoana
{
		private int cnp;
        private String nume;
        private String sex;
        public Categorie cat;

        public enum Categorie {SILVER, GOLD, PLATINIUM}
        
        public Abonat()
        {
        	super();
            this.cnp = 0;
            this.nume = null;
            this.prenume = null;
            this.sex = null;
            cat=Categorie.GOLD;
        }

        public Abonat(int c, String n, String p, String s, Categorie cat)
        {
        	super(p);
            this.cnp = c;
            this.nume = n;
            //this.prenume = p;
            this.sex = s;
            this.cat=cat;
        }

        public int getCnp()
        {
            return this.cnp;
        }

        public void setCnp(int value)
        {
            this.cnp = value;
        }

        public String getName() {
            return this.nume;
        }

        public void setName(String Name) {
            this.nume= Name;
        }
        
        public String getSex() {
            return this.sex;
        }

        public void setSex(String Sex) {
            this.sex= Sex;
        }


     public static void main(String[] args) {
         
         String[] categ = {"SILVER","GOLD","PLATINIUM"};
         
         Abonat ab1 = new 
        		 Abonat(123, "Ionescu", "Gigel", "M", 
        				 Categorie.PLATINIUM);
         ab1.setCnp(456);
         
         Abonat ab2 = new Abonat(111, "Popescu", "Maria", "F", Categorie.valueOf(categ[1]));
         ab2.setName("Marilena");
         
         ab2.mananca();
         
         System.out.println("Primul abonat:"+ab1.getCnp()+" "+ab1.getName()+" "+ab1.getSex());
         System.out.println("Al doilea abonat:"+ab2.getCnp()+" "+ab2.getName()+" "+ab2.getSex());
     }

	@Override
	void mananca() {
		// TODO Auto-generated method stub
		System.out.println("Abonatul mananca!");
	}
} 
