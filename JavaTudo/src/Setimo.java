import java.util.Scanner;

public class Setimo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = ler.nextInt();

        System.out.println("Digite um numero: ");
        int n2 = ler.nextInt();

        System.out.println("Digite um numero: ");
        int n3 = ler.nextInt();

        int maior;

        if(n1 >= n2 && n1 >= n3){
           maior = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        System.out.println("O maior número é: " + maior);
    }
}
