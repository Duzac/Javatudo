import java.util.Scanner;

public class Sexto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int Idade = ler.nextInt();

        if(Idade >= 18){
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }

    }
}
