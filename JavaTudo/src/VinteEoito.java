import java.util.Scanner;

public class VinteEoito {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma palvra em letra minuscula: ");
        String palavra = ler.nextLine();

        String nova = "";

        for (int i = 0; i <palavra.length() ; i++) {
            char letra = palavra.charAt(i);
            if(letra == 'a' ||letra == 'b' ||letra == 'c' ||letra == 'g' ||letra == 'e' ||letra == 'i'){
                nova = nova + "*";
            } else {
                nova = nova + letra;
            }
        }
        System.out.println("Nova palavra é: " + nova);
    }
}
