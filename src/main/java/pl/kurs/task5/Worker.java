package pl.kurs.task5;

public class Worker extends Person implements Working{

    private double salary;

    public Worker(String name, String surname, String pesel, double salary) {
        super(name, surname, pesel);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "salary=" + salary +
                '}';
    }
}
