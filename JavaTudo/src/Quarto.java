import java.util.Scanner;

public class Quarto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = ler.nextInt();

        if(n > 0) {
            System.out.println("Numero é positivo!");
        } else if (n < 0) {
            System.out.println("Número é negativo!");
        } else {
            System.out.println("Número é zero!");
        }
    }
}



