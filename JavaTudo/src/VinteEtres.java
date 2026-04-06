import java.util.Scanner;

public class VinteEtres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vetor[] = new int[10];

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Digite até 10 números para mostrar os pares: ");
            int numero = ler.nextInt();
            vetor[i] = numero;

        }
        for (int i = 0; i < 10 ; i++) {
            if(vetor[i] %2 == 0){
                System.out.println("Os pares são: " + vetor[i]);
            }
        }
    }
}