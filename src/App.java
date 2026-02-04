import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double resultado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        double n1 = sc.nextDouble();

        System.out.println("Insira um operador (+, -, x, /): ");
        String operador = sc.next();

        System.out.println("Insira outro numero: ");
        double n2 = sc.nextDouble();

        if (operador.equals("-")) {
            resultado = Calculator.subtrair(n1, n2);
            System.out.println(resultado);

        } else if (operador.equals("x")) {
            resultado = Calculator.multiplicar(n1, n2);
            System.out.println(resultado);
        } else if (operador.equals("+")) {
            resultado = Calculator.somar(n1, n2);
            System.out.println(resultado);
        } else if (operador.equals("/")) {
            resultado = Calculator.dividir(n1, n2);
            System.out.println(resultado);
        }

        sc.close();
    }
}
