
import java.util.Locale;
import java.util.Scanner;

public class Exer12 {
     public static void main(String[] args) { 
        Locale.setDefault(Locale.US); 
        Scanner sc= new Scanner(System.in); 

        Double salario, imposto;

        System.out.print("Qual o salário? ");
        salario = sc.nextDouble();

        if (salario <= 2000.00) {
            imposto = 0.00;
        }
        else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        }
        else if (salario <= 4500.00) {
            imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
        }
        else {
            imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Insento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
     }
}


