package sample;

import java.util.Arrays;

public class Registration {

    private String name;
    private String sex;
    private boolean taxPaid;
    private String[] sectionsAllocated;
    private String studies;
    private String location;

    public Registration(String name, String sex, boolean taxPaid, String[] sectionsAllocated, String studies, String location) {
        this.name = name;
        this.sex = sex;
        this.taxPaid = taxPaid;
        this.sectionsAllocated = sectionsAllocated;
        this.studies = studies;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isTaxPaid() {
        return taxPaid;
    }

    public void setTaxPaid(boolean taxPaid) {
        this.taxPaid = taxPaid;
    }

    public String[] getSectionsAllocated() {
        return sectionsAllocated;
    }

    public void setSectionsAllocated(String[] sectionsAllocated) {
        this.sectionsAllocated = sectionsAllocated;
    }

    public String getStudies() {
        return studies;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", taxPaid=" + taxPaid +
                ", sectionsAllocated=" + Arrays.toString(sectionsAllocated) +
                ", studies='" + studies + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
