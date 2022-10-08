package pl.kurs.task5;

public class Runner {
    public static void main(String[] args) {

        Student st1 = new Student("Pawel", "Nowak", "11234421421", 1234);
        Worker w1 = new Worker("Andrzej", "Duda", "988124125213" , 9999);
        StudentAndWorker saw = new StudentAndWorker("Pawel", "Kowalski", "123412135423", 544235, 23);


        System.out.println("Student scholarship " + st1.getScholarship());
        System.out.println("Worker salary " + w1.getSalary());
        System.out.println("StudentAndWorker salary " + saw.getSalary());
        System.out.println("StudentAndWorker scholarship " + saw.getScholarship());

        System.out.println("Wielodziedziczenie nie istnieje w jave, trzeba je obchodzic inaczej StudentAndWorker nie moze rozszerzac Studen i Worker");
        System.out.println("Jak widac wielodziedziczenie mozna uzyskac za pomoca inrefejsow poniewaz interfejsy moga rozszerzac wiele interfejsow ");
        System.out.println("Student kozysta z interfejsu Learning ,Worker z Working a StudentAndWorker koazysta z inrefejsu ktory rozszerza te oba interfejsy");


    }
}
