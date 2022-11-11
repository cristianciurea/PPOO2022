package sample;

public class Student {

    private String nume;
    private int varsta;
    private String sex;

    public String getProgramStudii() {
        return programStudii;
    }

    public void setProgramStudii(String programStudii) {
        this.programStudii = programStudii;
    }

    private String programStudii;

    public Student(String nume, int varsta, String sex, String programStudii) {
        this.nume = nume;
        this.varsta = varsta;
        this.sex = sex;
        this.programStudii = programStudii;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", sex='" + sex + '\'' +
                ", programStudii='" + programStudii + '\'' +
                '}';
    }
}
