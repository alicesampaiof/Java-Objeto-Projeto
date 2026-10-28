
import java.util.Scanner;

public class ExeFor {
    public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in); 

        int N;
        int soma = 0;

        System.out.print("Quantos numeros vai digitar:");
        N = sc.nextInt();

        for (int i = 0; i < N; i ++) {

            System.out.print("Numero " + (i+1) + ": ");
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println("Soma dos numeros: " + soma);

        sc.close();
     }
}



