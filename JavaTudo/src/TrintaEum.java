import java.util.Scanner;

public class TrintaEum {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = ler.nextInt();

        if(epar(n)){
            System.out.println("é par!");
        } else {
            System.out.println("é impar!");
        }
    }
    public static boolean epar(int valor){
        return valor %2 == 0;
    }
}
