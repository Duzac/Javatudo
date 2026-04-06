import java.util.Scanner;

public class Quinto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celcius para Farheinheit:");
        double C = ler.nextDouble();

        double F = (C * 9/5) + 32;

        System.out.println("A temperatura em Farheinheit é : " + F );


    }
}
