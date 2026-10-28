import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        //double xA, xB, xC, yA, yB, yC;
        Triangle x, y;        //  declara duas variáveis do tipo Triangle (x e y)
        x = new Triangle();   //  cria o objeto do triângulo X na memória
        y = new Triangle();   //  cria o objeto do triângulo Y na memória

        System.out.println("Digite as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area(); // Chama a classe Triangle que faz a conta e retorna o valor
        double areaY = y.area(); // Chama a classe Triangle que faz a conta e retorna o valor
            
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");

        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}

