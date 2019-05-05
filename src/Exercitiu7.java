public class Exercitiu7 {
    public static void main(String[] args) {
        int n = 3;
        int nrDorit = (int) (2 * Math.pow(3, n));
        System.out.println(nrDorit);

        // am nevoie de suma declarata in afar while
        int sum = 0;

        // in bucla aflu ultima cifra si apoi reinitializez nr dorit
        while (nrDorit > 0) {
            int ultimaCifra = nrDorit % 10;
            sum += ultimaCifra;
            nrDorit = nrDorit / 10;


        }

        System.out.println(sum);
        //printez suma



    }
}
