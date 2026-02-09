import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            try {

                System.out.println("1 - Somar");
                System.out.println("2 - Subtrair");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");
                System.out.println("0 - Sair");

                int option = Integer.parseInt(sc.nextLine());

                if (option == 0)
                    break;

                if (option < 1 || option > 4) {
                    System.out.println("Opção inválida");
                    continue;
                }

                System.out.println("Insira um numero: ");
                double n1 = readDouble(sc);

                System.out.println("Insira outro numero: ");
                double n2 = readDouble(sc);

                double resultado = switch (option) {
                    case 1 -> Calculator.somar(n1, n2);
                    case 2 -> Calculator.subtrair(n1, n2);
                    case 3 -> Calculator.multiplicar(n1, n2);
                    case 4 -> Calculator.dividir(n1, n2);
                    default -> throw new IllegalArgumentException("Opção inválida");
                };

                System.out.println("Resultado: " + resultado);
            } catch (InputMismatchException e) {
                System.out.println("Erro: entrada inválida.");
                sc.nextLine();

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        sc.close();
    }

    private static double readDouble(Scanner sc) {
        while (true) {
            try {
                String input = sc.nextLine().replace(",", ".").trim();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Número inválido, tente novamente: ");
            }
        }
    }
}
