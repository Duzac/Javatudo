import java.util.Scanner;

public class Dezenove {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n;

        while(true){
            System.out.println("Digite um número: ");
            n = ler.nextInt();

            if (n == 0) {
                break;
            }

            if (n <= 1) {
                System.out.println("Não é primo");
            } else {
                int divisores = 0;

                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        divisores++;
                    }
                }

                if (divisores == 2) {
                    System.out.println("É primo");
                } else {
                    System.out.println("Não é primo");
                }
            }
        }
    }
}

