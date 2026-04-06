public class VinteEum {
    public static void main(String[] args) {

        int [] N = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 };
        double maior = N[0];
        double menor = N[0];

        for (int i = 0; i < N.length; i++) {
            System.out.println("Os números são: " + N[i]);

            if (N[i] > maior) {
                maior = N[i];
            }

            if (N[i] < menor) {
                menor = N[i];
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
