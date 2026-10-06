import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in); 

        int A, B;

        System.out.println("Qual o valor de A: ");
        A = sc.nextInt();
        System.out.println("Qual o valor de B: ");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São Multiplos!");
        } else {
            System.out.println("Não São Multiplos");
        }

        sc.close();
     }
}





