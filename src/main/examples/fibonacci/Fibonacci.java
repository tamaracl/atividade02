package examples.fibonacci;

public class Fibonacci {
    public int calculate(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Os numeros da serie Fibonnaci não podem ter indices negativos.");
        }
        if (index <= 1) {
            return 1;
        }

        return calculate(index - 1) + calculate(index - 2);
    }
}
