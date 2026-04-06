import java.util.Scanner;

public class VinteEnove {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua senha:");
        String senha = ler.nextLine();

        boolean TemLetra = false;
        boolean TemNumero = false;

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);
            if(Character.isLetter(c)) {
                TemLetra = true;
            }
            if(Character.isDigit(c)) {
                TemNumero = true;
            }
        }
        if(TemLetra && TemNumero) {
            System.out.println("Senha forte!");
        } else {
            System.out.println("Senha fraca!");
        }
    }
}
