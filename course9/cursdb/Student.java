package ro.ase.course9.cursdb;

public class Student {

	private int cod;
	private String nume;
	private int varsta;
	private int inaltime;
	private String cnp;
	private String sex;
	private String forma;

	/**
	 * @param cod
	 * @param nume
	 * @param varsta
	 * @param inaltime
	 * @param cnp
	 * @param sex
	 * @param forma
	 */
	public Student(int cod, String nume, int varsta, int inaltime, String cnp,
                   String sex, String forma) {
		super();
		this.cod = cod;
		this.nume = nume;
		this.varsta = varsta;
		this.inaltime = inaltime;
		this.cnp = cnp;
		this.sex = sex;
		this.forma = forma;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getInaltime() {
		return inaltime;
	}

	public void setInaltime(int inaltime) {
		this.inaltime = inaltime;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Student [cod=" + cod + ", nume=" + nume + ", varsta=" + varsta
				+ ", inaltime=" + inaltime + ", cnp=" + cnp + ", sex=" + sex
				+ ", forma=" + forma + "]";
	}
}
