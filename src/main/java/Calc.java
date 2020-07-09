import java.util.Arrays;

public class Calc {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sumVarArgs(int... varargs) {
        return Arrays.stream(varargs).reduce(0, Integer::sum);
    }

    public int subtracting(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException();
        return a / b;
    }
}
