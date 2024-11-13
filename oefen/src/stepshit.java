import java.util.Scanner;

public class stepshit {

    public static boolean checkLelijk (String woord) {
        return woord.equals("poepkoning")
                ||
                woord.equals("kalekop")
                ||
                woord.equals("zuremat")
                ||
                woord.equals("kipcurry")
                ||
                woord.equals("programmeur");
    }

    public static int telLelijk (){
        int swoord = 0;
        Scanner scanner = new Scanner (System.in);

        while(true){
            String woord = scanner.nextLine();
            if(woord.equals("0")){
                break;
            }
            if(checkLelijk(woord)){
                swoord++;
            }
        }
        return(swoord);
    }

    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println (telLelijk ());
    }
}