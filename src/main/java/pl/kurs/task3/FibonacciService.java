package pl.kurs.task3;

public class FibonacciService {
    private int n = 3;

    public FibonacciService() {
    }

    public int getFibonacciIndex(int number) {
        if (number == 0)
            return 0;
        else if (number == 1)
            return 1;
        else if (fib(n) == number)
            return n;
        else if (fib(n) > number)
            return -1;
        else fib(n++);
            return getFibonacciIndex(number);
    }

    private int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }
}
