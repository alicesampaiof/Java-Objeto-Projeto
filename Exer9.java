import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in); 

        int HoraInicial, HoraFinal, duracao;

        System.out.print("Hora inicial: ");
        HoraInicial = sc.nextInt();
        System.out.print("Hora Final: ");
        HoraFinal = sc.nextInt();

        if (HoraInicial < HoraFinal) {
            duracao =  HoraFinal - HoraInicial;            
        } else {
            duracao = 24 - HoraInicial + HoraFinal;
        }

        System.out.printf("O JOGO DUROU " + duracao + " HORA(S).");
    
        sc.close();
     }
}
