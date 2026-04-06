import java.util.Scanner;

public class VinteEquatro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vetor[] = new int[5];
        int temp;
        int ultimo = vetor.length - 1;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite 5 numeros em ordem e inverteremos: ");
            int numero = ler.nextInt();
            vetor[i] = numero;

        }
        for (int i = 0; i < vetor.length / 2; i++) {
            temp = vetor[i];
            vetor[i] = vetor[ultimo - i];
            vetor[ultimo - i] = temp;
        }
        System.out.println("Vetor invertido:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}

