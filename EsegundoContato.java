import java.util.Locale;

public class EsegundoContato {
    public static void main(String[] args) {

        String produto1 = "Computer";
        String produto2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products");
        System.out.printf("%s, which price is $ %.2f%n", produto1, price1);
        System.out.printf("%s, White price is $ %.2f%n", produto2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println();
        System.out.printf("Medida com 8 casa decimais: %.8f%n", measure);
        System.out.printf("Arredondando (3 casas decimais): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal americano: %.3f%n", measure);
    }
}



