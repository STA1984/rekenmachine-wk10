import java.util.Scanner;

public class optellen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int getal1;
        int getal2;
        System.out.print ("Voer een getal in: ");
        getal1 = scanner.nextInt ();
        System.out.print ("Voer een tweede getal in: ");
        getal2 = scanner.nextInt ();
        System.out.print (getal1 + " + " + getal2 + " = " + (getal1 + getal2));
    }
}
