import java.util.Scanner;

public class Treze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número:");
        int N = ler.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " * " + i + " = " + (N * i));
        }
    }
}

