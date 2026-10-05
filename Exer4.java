import java.util.Locale;
import java.util.Scanner;

public class Exer4 {
     public static void main(String[] args) { 

        Locale.setDefault(Locale.US); 
        Scanner sc= new Scanner(System.in); 

        int numero, hora;
        double valorHora, salario;

        numero = sc.nextInt();
        hora = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = hora * valorHora;
        
        System.out.println("NUMERO = " + numero);
        System.out.printf("SALARIO = U$ %.2f%n", salario);

        sc.close();

     }
    
}


