import java.util.Locale; // importa a classe do Locale
import java.util.Scanner; // entrada de dados 


public class EprimeiroContato {
    
    public static void main(String[] args) { // declarar a função main no java (sintaxe básica)

        Locale.setDefault(Locale.US); // faz o Java usar o padrão dos EUA, ou seja, ponto (3.50) em vez de vírgula (3,50) nos números decimais
        Scanner sc= new Scanner(System.in); // necessário para entrada de dados
        
        double x = 12.345;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.print("Olá meu mundo!"); // escreve o texto e não pula linha. O próximo texto sai colado.
        System.out.println("Bom dia!"); // escreve o texto e pula linha no final (o ln vem de line).
        System.out.printf("%.2f%n", x); // escreve um texto formatado, usando máscaras como %.2f.
        // "%.2f" - padrão de mascara de formatação para delimitar casas decimais
        // "%n ou \n" - para colocar uma quebra de linha, mas o %n é mais seguro, porque se adapta ao sistema operacional (Windows, Linux, Mac).

        //Para concatenar vários elementos em um mesmo comando de escrita
        System.out.println("RESULTADO = " + x + " METROS"); // Para print e println
        System.out.printf("RESULTADO = %.2f metros%n", x); // Para printf
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); //Para printf

        sc.close(); 

    }
}






