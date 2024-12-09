import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Digite o valor de x: ");
        double x = sc.nextDouble();

        System.out.println("Digite o valor de y: ");
        double y = sc.nextDouble();

        double result = SumNumber.summer(x, y);
        System.out.println("O resultado da soma eh: " + String.format("%.2f", result));
    }
}
