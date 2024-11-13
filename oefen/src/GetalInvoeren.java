import java.util.Scanner;

public class GetalInvoeren {

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Voer een getal in:");
        int getal = scanner.nextInt();
        System.out.println(getal);
        System.out.println("is fout. Voer een getal tussen 1 en 10 in:");
        getal = scanner.nextInt(); //hihihihar
        System.out.println(getal);
        System.out.println("Gelukt!");
    }
}
