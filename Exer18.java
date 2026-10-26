import java.util.Locale;
import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc= new Scanner(System.in);

       // entrada de dados
       System.out.print("Quantos casos de teste: ");
       int n = sc.nextInt();

       for (int i=1; i<=n; i++) {
            System.out.print("Valores " + i + ": ");

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            //processamento de dados
            double media = (a * 2 + b * 3 + c * 5) / 10;

            // saida de dados
            System.out.printf("%.1f%n", media );
       }
       sc.close();
    }
}





