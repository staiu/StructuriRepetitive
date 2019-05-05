public class Exercitiu6 {
    public static void main(String[] args) {
        int n = 10;
        int counter = 0;

        int numarDeInteres = 0;
        int sum = 0;
        while (counter < n) {

            if (numarDeInteres % 2 == 1) {
                counter++;
                System.out.println("Al " + counter + "-lea numar impar este: " + numarDeInteres);
                sum += numarDeInteres;
            }
            numarDeInteres++;
        }
        System.out.println("suma numerelor impare este: " + sum);
    }
}
