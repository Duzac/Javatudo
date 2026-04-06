import java.util.Scanner;

public class Quatorze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o ultimo número: ");
        int N = ler.nextInt();

        for (int i = 1; i <= N ; i++) {
            System.out.println(i);
        }
    }
}
