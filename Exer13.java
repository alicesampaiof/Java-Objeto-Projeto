import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in); 

        int senha = 0;

        System.out.println("Digite a senha: ");
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido!");

        sc.close();
     }
}

