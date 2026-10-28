
import java.util.Locale;
import java.util.Scanner;


// ESQUELETO BÁSICO
public class aaaa {
public static void main(String[] args) {    // Ponto de partida: o Java começa a executar aqui
        Locale.setDefault(Locale.US);       // Força usar ponto nos decimais
        Scanner sc= new Scanner(System.in); // Cria o "leitor" do teclado



// MOSTRAR INFORMAÇÕES NA TELA
        int valor = 25;
        System.out.println("Olá"); // escreve e pula linha
        System.out.print("Olá"); // escreve sem pular linha
        System.out.printf("Valor = " + valor); // mostra variável (formata)


// VARIÁVEIS E TIPOS
        int idade = 25;              // número inteiro
        double altura = 1.75;        // número decimal
        String nome = "Maria";       // texto (S maiúsculo!)
        char letra = 'A';            // um único caractere (aspas simples)

        
//PARA SAÍDA DE DADOS
        int IDADE = sc.nextInt();          // lê inteiro
        double ALTURA = sc.nextDouble();   // lê decimal
        String NOME = sc.next();           // lê uma palavra
        char LETRA = sc.next().charAt(0);  // lê a primeira letra
        sc.nextLine();                     // limpa o "enter" que sobrou 
        String frase = sc.nextLine();      // lê a linha inteira ate dar enter <- ESSE É O MAIS USADO


// OPERADORES - MATEMÁTICOS
        int soma = 5 + 3;
        int sub = 5 - 3;
        int mult = 5 * 3;
        int div = 10 / 2;
        int resto = 10 % 3;    // resto da divisão = 1



// OPERADORES - COMPARAÇÃO
        //  ==	      igual a
        //  !=	      diferente de
        //  > <       maior, menor
        //  >= <=    maior ou igual, menor ou igual

        //  x++;      soma 1 (x = x + 1)
        //  x--;      subtrai 1
        //  x += 5;   x = x + 5

        //  &&	     E (os dois precisam ser verdadeiros)
        //  ||       OU (basta um ser verdadeiro)
        //  !	     NÃO (inverte)



// IF ELSE - CONDICIONAL
        if (idade >= 18) {
                System.out.println("Maior de idade");
        } else if (idade >= 12) {
                System.out.println("Adolescente");
        } else {
                System.out.println("Criança");
        }


// FOR - LAÇO DE REPETIÇÃO
        for (int i = 0; i < 5; i++) {
                System.out.println(" Variável i + 1 = " + i);
        }

// WHILE - REPETE ENQUANTO FOR VERDADEIRA
        int n = 1;
        while (n <= 5) {
                System.out.println(n);
                n = n + 1;
        }

// DO WHILE - EXECUTA PELO MENOS UMA VEZ
        do {
                System.out.println("Digite um número positivo:");
                n = sc.nextInt();
        } while (n <= 0);

// VETOR
        int[] notas = new int[3];       // espaço para 3 números
        notas[0] = 8;                   // posições começam no 0!
        notas[1] = 7;
        notas[2] = 10;

        String[] nomes = {"Ana", "Bia", "Caio"};   // forma rápida

        System.out.println(nomes.length);   // tamanho = 3


// STRING
        String texto = "Java é legal";

        texto.length();               // quantidade de caracteres
        texto.toUpperCase();          // "JAVA É LEGAL"
        texto.toLowerCase();          // "java é legal"
        texto.charAt(0);              // 'J' (caractere na posição 0)
        texto.contains("legal");      // true
        texto.substring(0, 4);        // "Java"
        texto.replace("legal", "top");

// CLASSE MATH
        Math.sqrt(16);       // raiz quadrada = 4.0
        Math.pow(2, 3);      // 2 elevado a 3 = 8.0
        Math.abs(-5);        // valor absoluto = 5
        Math.max(3, 7);      // maior = 7
        Math.min(3, 7);      // menor = 3
        Math.round(3.6);     // arredonda = 4



        sc.close();
}
}