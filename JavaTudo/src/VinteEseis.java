import java.util.Scanner;

public class VinteEseis {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a palavra pra ver se é palíndromo: ");
        String palavra = ler.nextLine();
        boolean palindromo = true;

        for (int i = 0; i < palavra.length() / 2; i++) {

            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                palindromo = false;
                break;
            }
        }
        if (palindromo) {
            System.out.println("É palindromo!");
        } else {
            System.out.println("Não é palindromo!");
        }
    }
}


