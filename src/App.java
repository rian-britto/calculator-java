import java.util.Scanner;
import operators.Subtrair;
import operators.Multiplicacao;
import operators.Adicao;
import operators.Divisao;

public class App {
    public static void main(String[] args) {

        double n1 = 8;
        double n2 = 2;
        double resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um operador (+, -, x, /): ");
        String operador = sc.next();

        if (operador.equals("-")) {
            resultado = Subtrair.subtrair(n1, n2);
            System.out.println(resultado);

        } else if (operador.equals("x")) {
            resultado = Multiplicacao.multiplicar(n1, n2);
            System.out.println(resultado);
        } else if (operador.equals("+")) {
            resultado = Adicao.somar(n1, n2);
            System.out.println(resultado);
        } else if (operador.equals("/")) {
            resultado = Divisao.dividir(n1, n2);
            System.out.println(resultado);
        }

        sc.close();
    }
}
