public class Exercitiul10 {
    public static void main(String[] args) {
        int[] sir = {2, 6, 13, 34, 55, 80, 111, 201, 250};
        int primelePare = 2;
        int suma = 0;
        int counter = 0;

        for(int i = 0; i<sir.length; i++) {

            if (counter < primelePare) {
                break;
            }
            // vreau sa verifica sunt pare si daca  sunt pare creste counterul si suma
            int nrCurent = sir[i];
            if(nrCurent % 2 == 0) {
                suma += nrCurent;
                counter++;

            }

        }
        System.out.println("Suma primelor " + counter + " nr pare din " + primelePare + " cerute este: " + suma);
    }
}
