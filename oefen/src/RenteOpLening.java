import java.util.Scanner;

public class RenteOpLening {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int teBetalenRente = 0;

        // We voeren een startbedrag, een rentepercentage en
        // een doorlooptijd in.
        System.out.print ("Hoeveel heeft u geleend? ");
        int lening = scanner.nextInt ();
        int totaalbedrag = lening;
        System.out.print ("Hoeveel rentepercentage betaalt u per jaar over deze lening? ");
        int rentepercentage = scanner.nextInt ();
        System.out.print ("Hoelang leent u dit geld? ");
        int doorlooptijd = scanner.nextInt ();

        // Daarna gaan we het aantal keren door een loop heen als
        // dat de doorlooptijd jaren telt

        while (doorlooptijd > 0) {
            // We tellen elk jaar rente over rente op het basisbedrag.
            totaalbedrag = totaalbedrag * (100 + rentepercentage) / 100;
            doorlooptijd--;
        }

        // We tonen de te betalen rente op het scherm.
        System.out.println ("Naast de aflossing van € " + lening + " moet € " +
                (totaalbedrag - lening) + " rente worden betaald.");
    }
}
