import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // entrada de dados
        int x;
        System.out.print("Qual o numero? ");
        x = sc.nextInt();

        // processamento
        for (int i=1; i<=x; i++) {
            if (i % 2 != 0) {
                //resposta
                System.out.println(i);
                
            }
        }

        sc.close();

    }
}

