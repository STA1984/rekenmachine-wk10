import java.util.Scanner;

public class ToegangprijsPretpark {

    public static void main(String[] args) {

        Scanner toetsenbord = new Scanner (System.in);

        // Lees leeftijd en toegangsprijs in vanaf het toetsenbord.
        System.out.print ("Wat is je leeftijd? ");
        int leeftijd = toetsenbord.nextInt ();

        // Vang af dat een verkeerde leeftijd wordt ingevoerd.
        if (leeftijd < 0) {
            System.out.println ("Omdat je een onjuiste leeftijd invoert, kan de toegangsprijs niet worden berekend.");
        }
        else {

            System.out.print ("Wat is de toegangsprijs voor het pretpark? ");
            int toegangsprijs = toetsenbord.nextInt ();

            if ((leeftijd < 4) || (leeftijd > 65)) {
                int korting = 5;
                System.out.println ("Omdat u " + korting + " euro korting krijgt, betaalt u " + (toegangsprijs - korting) + " euro.");
            }
            else {
                toetsenbord.nextLine ();
                System.out.print ("Wilt u de nieuwsbrief ontvangen (J/N)? ");
                String antwoord = toetsenbord.nextLine ();
                boolean wilNieuwsbriefOntvangen = antwoord.toLowerCase ().equals ("j");

                if (wilNieuwsbriefOntvangen) {
                    int korting = 2;
                    System.out.println ("Omdat u " + korting + " euro korting krijgt, betaalt u " + (toegangsprijs - korting) + " euro.");
                }
                else {
                    System.out.println ("U krijgt geen korting en betaalt " + toegangsprijs + " euro.");
                }
            }
        }
    }
}