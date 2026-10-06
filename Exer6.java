import java.util.Scanner;

public class Exer6 {
     public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in); 

        int Num;

        System.out.println("Numero para ser verificado: ");
        Num = sc.nextInt();

        if (Num < 0 ) { 
            System.out.println("Negativo!");
        } else {
            System.out.println("Não Negativo!");
        }
  
        sc.close();
     }
}


