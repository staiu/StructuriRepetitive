public class Exercitiul11 {
    public static void main(String[] args) {
        int n = 8;
       /* if(n > 0 && n < 9) {
            System.out.println(n);
        }else{
            System.out.println("Nr este gresit");
*/
       switch(n) {
           case 1:
               System.out.println("Numarul este zero");
               break;
           case 2:
               System.out.println("Numarul este unu");
               break;
           case 3:
               System.out.println("Numarul este doi");
               break;
           case 4:
               System.out.println("Numarul este trei");
               break;
           case 5:
               System.out.println("Numarul este patru");
               break;
           case 6:
               System.out.println("Numarul este cinci");
               break;
           case 7:
               System.out.println("Numarul este sase");
               break;
           case 8:
               System.out.println("Numarul este sapte");
               break;
           case 9:
               System.out.println("Numarul este opt");
               break;
           case 10:
               System.out.println("Numarul este noua");
               break;
           default:
               System.out.println("Numarul este gresit");

        }
    }
}
