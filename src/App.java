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

                System.out.print("Escolha uma opção: ");
                int option = readOption(sc);

                if (option == 0) {
                    System.out.println("Encerrando...");
                    break;
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

    private static int readOption(Scanner sc) {
        while (true) {
            String input = sc.nextLine().trim();
            try {
                int option = Integer.parseInt(input);
                if (option >= 0 && option <= 4) {
                    return option;
                }
            } catch (NumberFormatException ignored) {
            }

            System.out.println("Opção inválida. Digite um número entre 0 e 4:");
        }
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
