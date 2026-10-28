
import java.util.Scanner;

public class Strinqs {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        String original = "abcde FGHIJ ABC abc DEFG   ";          // texto de teste (tem 3 espaços no final)
        String s01 = original.toLowerCase();                      // tudo em minúsculas
        String s02 = original.toUpperCase();                      // tudo em MAIÚSCULAS
        String s03 = original.trim();                             // tira os espaços do começo e do fim
        String s04 = original.substring(2);                       // corta do índice 2 até o fim
        String s05 = original.substring(2, 9);                    // corta do índice 2 até o 8 (o 9 não entra)
        String s06 = original.replace('a', 'x');                  // troca cada letra 'a' por 'x'
        String s07 = original.replace("abc", "xy");               // troca cada trecho "abc" por "xy"
        int i = original.indexOf("bc");                           // posição da 1ª vez que "bc" aparece
        int j = original.lastIndexOf("bc");                       // posição da última vez que "bc" aparece

        System.out.println("Original: -" + original + "-");                      // mostra o texto original
        System.out.println("toLowerCase: -" + s01 + "-");                        // mostra em minúsculas
        System.out.println("toUpperCase: -" + s02 + "-");                        // mostra em MAIÚSCULAS
        System.out.println("trim: -" + s03 + "-");                               // mostra sem espaços nas pontas
        System.out.println("substring(2): -" + s04 + "-");                       // mostra o corte a partir do 2
        System.out.println("substring(2, 9): -" + s05 + "-");                    // mostra o corte entre 2 e 9
        System.out.println("replace('a', 'x'): -" + s06 + "-");                  // mostra com 'a' trocado por 'x'
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");               // mostra com "abc" trocado por "xy"
        System.out.println("Index of 'bc': " + i);                               // mostra a posição do 1º "bc"
        System.out.println("Last index of 'bc': " + j);                          // mostra a posição do último "bc"


        sc.close();
    }
}
