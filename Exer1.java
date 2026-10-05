import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {   // ponto de partida do programa

        Scanner sc = new Scanner(System.in);   // cria o leitor de dados do teclado

        int a, b, soma;                        // declara 3 variáveis inteiras

        a = sc.nextInt();                      // lê o primeiro número digitado
        b = sc.nextInt();                      // lê o segundo número digitado

        soma = a + b;                          // soma os dois valores

        System.out.printf("SOMA = %d%n", soma); // %d = inteiro, %n = quebra de linha

        sc.close();                            // fecha o leitor
    } 
} 

