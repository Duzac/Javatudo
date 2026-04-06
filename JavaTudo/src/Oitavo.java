import java.util.Scanner;

public class Oitavo {
    public static void main(String[] args) {
        Scanner ler =new Scanner(System.in);

        System.out.println("Digite um número:");
        int N = ler.nextInt();

        if(N % 3 == 0){
            System.out.println( N + " é multiplo de 3:");
        } else if (N % 5 == 0) {
            System.out.println(N + " é multiplo de 5");
        } else {
            System.out.println("Não é multiplo de 3 e de 5:");
        }
    }
}
