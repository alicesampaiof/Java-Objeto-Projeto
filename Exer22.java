
import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.print("Qual o valor: ");
        int n = sc.nextInt();

        // PROCESSAMENTO DE DADOS
        for (int i=1; i<=n; i++) {
            //int numero = i;
            int quadrado = i * i;
            int cubo = i * i * i;
            
            // SAIDA DE DADOS
            System.out.println( i + " " + quadrado + " " + cubo);;            
            //System.out.printf("%d %d %d%n", numero, quadrado, cubo);
        }

        sc.close();
    }
}

