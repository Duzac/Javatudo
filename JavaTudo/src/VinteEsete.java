import java.util.Scanner;

public class VinteEsete {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma palvra: ");
        String palavra = ler.nextLine();
        boolean vogal = true;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' ||letra == 'e' ||letra == 'i' ||letra == 'o' ||letra == 'u' ||letra == 'A' ||letra == 'E' ||letra == 'I' ||letra == 'O' ||letra == 'U'){
                System.out.println("As vogais são: " + letra);
            }
        }
    }
}
