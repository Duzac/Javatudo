import java.util.Scanner;

public class Dezessete {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int contador = 0;
        double soma = 0;

        while(true){
            System.out.println("Digite um número:");
            double numero = ler.nextDouble();

            if(numero == 0){
                break;
            }


            soma += numero;
            contador++;
        }
        if(contador > 0){
            double media = soma / contador;
            System.out.println("Media " + media);
        }else {
            System.out.println("Invalido");
        }
    }
}
