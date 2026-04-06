import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n1 = ler.nextInt();

        System.out.println("Digite o segundo número");
        int n2 = ler.nextInt();

        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 / n2);
        System.out.println(n1 * n2);
    }
}
