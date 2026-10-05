import java.util.Locale;
import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) { 

        Locale.setDefault(Locale.US); 
        Scanner sc= new Scanner(System.in); 

        int codigo1, numero1;
        int codigo2, numero2;
        double valorUni1, valorUni2, total;

        System.out.print("Numero do código 1: ");
        codigo1 = sc.nextInt();
        System.out.print("Numero de pecas 1: ");
        numero1 = sc.nextInt();
        System.out.print("Valor unitário da peca 1: ");
        valorUni1 = sc.nextDouble();

        System.out.print("Numero do código 2: ");
        codigo2 = sc.nextInt();
        System.out.print("Numero de pecas 2: ");
        numero2 = sc.nextInt();
        System.out.print("Valor unitário da peca 2: ");
        valorUni2 = sc.nextDouble();

        total = numero1 * valorUni1 + numero2 * valorUni2;
        System.out.printf("VALOR A PAGAR = R$ %.2f%n", total);
        sc.close();

     }
}


