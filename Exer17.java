
import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // entrada de dados
        int n, x;
        int in = 0;
        int out = 0;

        System.out.print("Quantos numeros vai verificar? ");
        n = sc.nextInt();

        // processamento de dados
        for (int i=1; i<=n; i++) {
            System.out.print("Qual o valor " + i + ": ");
            x = sc.nextInt();

            if ( x >= 10 && x <= 20 ) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }

        // saida de dados
        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}


