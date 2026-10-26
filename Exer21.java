import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        // entrada de dados
        System.out.print("Qual o numero: ");
        int n = sc.nextInt();

        // processamento de dados
        for( int i=1; i<=n; i++) {

            if (n % i == 0) {
                // saida de dados
                System.out.println(i);
            }
        }
        sc.close();
    }
}

