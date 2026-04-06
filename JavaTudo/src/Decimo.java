import java.util.Scanner;

public class Decimo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int SenhaCerta = 1234;
        String NomeCerto = "Gabriel";

        System.out.println("Digite seu usuario:");
        String Usuario = ler.nextLine();

        System.out.println("Digite sua senha:");
        int Senha = ler.nextInt();

        if (Usuario.equals(NomeCerto)){
            System.out.println("Esta certo seu usuario pode prosseguir ");
        } else {
            System.out.println("Esta errado seu usuario");
        }

        if(Senha == SenhaCerta){
            System.out.println("Esta certo sua senha pode prosseguir ");
        } else {
            System.out.println("Esta errado sua senha");
        }
    }

}
