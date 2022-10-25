package ro.ase.course7.designpatterns.factory;

public class TestSimpleFactory {
    public static void main(String[] args) {

        Student studentLicenta1 = FactoryStudent.getStudent("gigel", TipStudent.LICENTA);
        studentLicenta1.afisareStudent();
        Student studentLicenta2 = FactoryStudent.getStudent("dorel", TipStudent.LICENTA);
        studentLicenta2.afisareStudent();
        Student studentMaster = FactoryStudent.getStudent("maria", TipStudent.MASTER);
        studentMaster.afisareStudent();
    }
}
