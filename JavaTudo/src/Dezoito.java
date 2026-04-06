import java.util.Scanner;

public class Dezoito {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n;

        System.out.println("Digite um número");
        n = ler.nextInt();


        if(n == 0) {
            System.out.println("Nenhum número digitado:");
            return;
        }

        int maior = n;

        while(true){
            System.out.println("Digite um número:");
            n = ler.nextInt();

            if(n == 0){
                break;
            }

            if(n > maior){
              maior = n;
            }

            System.out.println("Maior número é: " + maior);
        }
    }
}
