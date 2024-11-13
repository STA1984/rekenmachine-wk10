import java.util.Scanner;

public class modulo {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoeveel bezoekers wilt u toegang geven?");
        int bezoekers = scanner.nextInt();
        System.out.println("Wat is de capaciteit van de zaal?");
        int capaciteit = scanner.nextInt();
        int overig = (bezoekers%capaciteit);
        int procent = (100*overig/bezoekers);
        System.out.println("Op basis van de ingevoerde gegevens is er geen plek voor "+overig+" bezoekers.");
        System.out.println("    Het probleem heeft een omvang van "+procent+"% ("+overig+" t.o.v. "+bezoekers+").");
    }
}
