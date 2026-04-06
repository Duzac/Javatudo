import java.util.Scanner;

public class Quinze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número:");
        int N = ler.nextInt();
        int Resultado = 1;

        for (int i = 1; i <= N ; i++) {
           Resultado = Resultado * i;

        }
        System.out.println("Fatorial: " + Resultado);
    }
}
