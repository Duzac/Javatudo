import java.util.Scanner;

public class Nono {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        double Nota = ler.nextDouble();

        if(Nota >= 7){
            System.out.println("Aprovado");
        } else if (Nota >= 5 && Nota <= 62 ) {
            System.out.println("Recuperaçao");
        } else if (Nota >= 0 && Nota <= 4){
            System.out.println("Reprovado");
        } else {
            System.out.println("Invalido!");
        }
    }
}
