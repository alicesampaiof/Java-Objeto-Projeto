import java.util.Locale;
import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        // Entrada de dados
        System.out.print("Quantos numeros deseja verificar: ");
        int n = sc.nextInt();

        for( int i=1; i<=n; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();

            //processamento de dados
            if (b == 0) {
                System.out.println("Divisão impossivel!");
            } else {
                double divisao = a / b;

                // saida de dados
                System.out.printf("Valor: %.1f%n", divisao);
            }
        }
    sc.close();
    }
}
