import java.util.Scanner;

public class oefen {

    public static void cijfers () {
        int gezakt = 0;
        int geslaagd = 0;

        while(true){
            Scanner scanner = new Scanner (System.in);

            System.out.println("Geef de naam van de kandidaat:");
            String naam  = scanner.nextLine();
            if(naam.equals("stop")){
                break;
            }
            System.out.println("Geef cijfer 1:");
            int c1 = scanner.nextInt();
            System.out.println("Geef cijfer 2:");
            int c2 = scanner.nextInt();
            System.out.println("Geef cijfer 3:");
            int c3 = scanner.nextInt();
            System.out.println("Geef cijfer 4:");
            int c4 = scanner.nextInt();
            scanner.nextLine(); //is nodig om volgende naam te kunnen lezen in stepik
            int gem = ((c1+c2+c3+c4)/4);

            if(c1>=4 && c2>=4 && c3>=4 && c4>=4 && gem >=6){
                System.out.println("Gefeliciteerd "+naam+", je gemiddelde is "+gem+" GESLAAGD");
                geslaagd++;
            }
            else{
                System.out.println("Helaas "+naam+", je bent gezakt");
                gezakt++;
            }
        }
        System.out.println("Aantal geslaagden: "+geslaagd);
        System.out.println("Aantal gezakten: "+gezakt);
    }

    public static void main (String [] args) {
        cijfers ();
    }
}