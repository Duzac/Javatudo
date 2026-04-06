import java.util.Scanner;

public class Vinte {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int Adivinha = 22;
        int N;

        while (true) {
            System.out.println("Digite um número até acerta de 0 a 30: ");
            N = ler.nextInt();

            if (N > Adivinha) {
                System.out.println("É menor");
            } else {
                System.out.println("É maior");
            }

            if (N == Adivinha) {
                System.out.println("Voce acertou!!");
                break;

            }

        }
    }
}
