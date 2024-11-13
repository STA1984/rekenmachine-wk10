import java.util.Scanner;

public class BooleanLeeftijd {

    public static void main(String[] args) {

        Scanner toetsenbord = new Scanner (System.in);

        // Lees de leeftijd in vanaf het toetsenbord.
        // Vergeet niet om de enter achter de leeftijd weg te lezen!
        System.out.print ("Wat is je leeftijd? ");
        int leeftijd = toetsenbord.nextInt ();
        toetsenbord.nextLine ();

        // Als de gebruiker jonger is dan 18 jaar, wordt geen alcohol verkocht.
        if (leeftijd < 18) {
            System.out.println ("Geweigerd!");
        }

        // Als de gebruiker ouder dan 18 jaar, kan hij/zij een favoriet biermerk invoeren.
        else {
            System.out.print ("Wat is je favoriete biermerk? ");
            String biermerk = toetsenbord.nextLine ();

            // Als dat 'Hertog Jan' is, wordt het bier verkocht.
            // Anders fronst de computer z'n wenkbrouwen.

            if (biermerk.toLowerCase().equals ("hertog jan")) {
                System.out.println ("Verkocht!");
            }
            else {
                System.out.println ("Zou je niet eens 'Hertog Jan' proberen?");
            }
        }
    }
}