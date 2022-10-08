package pl.kurs.task5;

public class Student extends Person implements Learning{

    private double scholarship;

    public Student(String name, String surname, String pesel, double scholarship) {
        super(name, surname, pesel);
        this.scholarship = scholarship;
    }

    @Override
    public double getScholarship() {
        return scholarship;
    }


    @Override
    public String toString() {
        return "Student{" +
                "scholarship=" + scholarship +
                '}';
    }
}
