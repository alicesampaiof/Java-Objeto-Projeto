
import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // entrada de dados
        System.out.println("Qual o numero: ");
        int n = sc.nextInt();

        //processamento de dados
        int fatorial = 1;
        for (int i=1; i<=n; i++) {
            fatorial = fatorial * i;
        }

        //saida de dados
        System.out.println("Fatorial: " + fatorial);

        sc.close();
    }
}

