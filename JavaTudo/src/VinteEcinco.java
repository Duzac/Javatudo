import java.util.Scanner;

public class VinteEcinco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.println("Digite uma palavra:");
        String palavra = ler.nextLine();

        palavra.length();
        int quantidade = palavra.length();

        System.out.println("A sua palavra tem " + quantidade + " Letras.");
    }
}
