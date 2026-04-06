
import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String Nome = ler.nextLine();

        System.out.println("Digite a sua idade:");
        int Idade = ler.nextInt();

        System.out.println("Ola " + Nome + " e sua idade é " + Idade);


    }
}
