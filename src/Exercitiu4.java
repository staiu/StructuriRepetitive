public class Exercitiu4 {
    public static void main(String[] args) {
        int[] nat = {2, 5, 126, 664, 5232, 3465};
        int nrPare = 0;
        int nrImpare = 0;
        for (int i = 0; i < nat.length; i++) {
            if (nat[i] % 2 == 0) {
                nrPare++;
            } else {
                nrImpare++;
            }

        }//end of for

        System.out.println("In acest sir avem " + nrPare + " numere pare");
        System.out.println("In acest sir avem " + nrImpare + " numere impare");
    }
}
