public class Exercitiu3 {
    public static void main(String[] args) {
        int[] multime = {12, 6, 3, 55, 7, 104};
        int max = -1;
        for (int i = 0; i < multime.length; i++) {
            int numarCurent = multime[i]; //nrcurent = 3 55 7

            if (numarCurent % 2 == 0) {
                continue;
            }
            if (numarCurent > max) {
                max = numarCurent;

            }
        }
        if (max > 0) {
            System.out.println(max);
        } else {
            System.out.println("no");
        }

    }

}
