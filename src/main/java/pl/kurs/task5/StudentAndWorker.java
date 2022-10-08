package pl.kurs.task5;

public class StudentAndWorker extends Person implements LearningAndWorking {

    private double salay;
    private double scholarship;

    public StudentAndWorker(String name, String surname, String pesel, double salay, double scholarship) {
        super(name, surname, pesel);
        this.salay = salay;
        this.scholarship = scholarship;
    }

    @Override
    public double getScholarship() {
        return scholarship;
    }


    @Override
    public double getSalary() {
        return salay;
    }
}
