import java.util.Scanner;

public class Dezesseis {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int positivo = 0;
        int negativo = 0;

        while(true) {
            System.out.println("Digite um número:");
            int numero = ler.nextInt();

            if(numero > 0){
                positivo++;
            } else if(numero < 0) {
                negativo++;
            }

            if( numero == 0){
                break;
            }

            System.out.println("Positivos " + positivo);
            System.out.println("Negativos " + negativo);
        }
    }
}
