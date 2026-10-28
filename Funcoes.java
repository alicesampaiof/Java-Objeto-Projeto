
import java.util.Scanner;                                    // permite ler o que o usuário digita

public class Funcoes {
    
    public static void main(String[] args) {                 // o programa começa a rodar por aqui
            Scanner sc = new Scanner(System.in);                 // cria o leitor de teclado

            System.out.println("Enter three numbers:");          // pede os três números
            int a = sc.nextInt();                                // lê o 1º número e guarda em a
            int b = sc.nextInt();                                // lê o 2º número e guarda em b
            int c = sc.nextInt();                                // lê o 3º número e guarda em c

            int higher = max(a, b, c);                           // chama o método max e guarda o maior em higher
            showResult(higher);                                  // chama o método que mostra o resultado

            sc.close();                                         
        }

        public static int max(int x, int y, int z) {             // método que recebe 3 números e devolve o maior
            int aux;                                             // caixinha para guardar o maior valor
            if (x > y && x > z) {                             
                aux = x;                                        
            } else if (y > z) {                              
                aux = y;                                       
            } else {                                             
                aux = z;                                         
            }
            return aux;                                          // devolve o maior para quem chamou o método
        }

        public static void showResult(int value) {               // método que recebe um número e só mostra (void = não devolve nada)
            System.out.println("Higher = " + value);             
        }
    }                                                            

        

