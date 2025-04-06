import java.util.Scanner;

public class CalcJAVA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Escreva o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("escolha o operador (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Erro! Dividido por zero!!.");
                    return;
                }
                break;
            default:
                System.out.println("Erro! operador invalido.");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f%n", num1, operator, num2, result);
    }
}