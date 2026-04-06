import java.util.Scanner;

public class VinteEdois {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double soma = 0;
        double vetor[] = new double[10];

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Digite 10 numeros para fazer a media: ");
            double numero = ler.nextDouble();
            vetor[i] = numero;
            soma = soma + vetor[i];
        }

        System.out.println("A media é " + (soma / vetor.length));
    }
}
