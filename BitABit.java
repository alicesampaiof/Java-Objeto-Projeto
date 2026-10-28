
import java.util.Scanner;

public class BitABit {
    public static void main(String[] args) {    // Ponto de partida: o Java começa a executar aqui
        Scanner sc= new Scanner(System.in);
    
    int n1 = 89;
    int n2 = 60;
    System.out.println(n1& n2);
    System.out.println(n1| n2);
    System.out.println(n1^ n2);

    sc.close();
    }

}
