import java.util.Scanner;

public class Trinta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = ler.nextInt();

       int resultado = somaTudo(n1,n2);
        System.out.println("O resultado da soma é: " + resultado);
    }
    public static int somaTudo(int A, int B) {
      return A + B;
    }
}
