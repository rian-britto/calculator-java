package operators;

public class Divisao {
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        return a / b;
    }
}
