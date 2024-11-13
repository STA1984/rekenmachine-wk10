import java.util.Scanner;

public class schaken {

    //richting van slag bepalen
    public static String richting(int lx, int ly, int sx, int sy){
        String richting = "hallo";

        if((sx>lx)&&(sy>ly)){
            richting = "NO";
        }
        else if((sx>lx)&&(sy<ly)){
            richting = "ZO";
        }
        else if((sx<lx)&&(sy<ly)){
            richting = "ZW";
        }
        else if((sx<lx)&&(sy>ly)){
            richting = "NW";
        }
        return(richting);
    }

    //kleur van de loper bepalen
    public static String kleurLoper(int lx, int ly){
        String kLoper = "zwart";
        boolean xLwit = false;
        boolean yLwit = false;

        if(lx%2==0){
            xLwit = true;
        }
        if(ly%2==0){
            yLwit = true;
        }

        if((xLwit&&!yLwit)||(!xLwit&&yLwit)){
            kLoper = "wit";
        }
        return(kLoper);
    }

    //kleur van ander stuk bepalen
    public static String kleurStuk(int sx, int sy){
        String kStuk = "zwart";
        boolean xSwit = false;
        boolean ySwit = false;

        if(sx%2==0){
            xSwit = true;
        }
        if(sy%2==0){
            ySwit = true;
        }

        if((xSwit&&!ySwit)||(!xSwit&&ySwit)){
            kStuk = "wit";
        }
        return(kStuk);
    }

    //kijken of loper binnen veld blijft
    public static boolean binnenVeld(int nextX, int nextY){
        if((nextX<=8)&&(nextX>=1)&&(nextY<=8)&&(nextY>=1)){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean tikkieLoper(int lx, int ly, int sx, int sy, int nextX, int nextY){
        nextX = lx;
        nextY = ly;

        if(kleurLoper(lx, ly).equals(kleurStuk(sx, sy))){
            while(binnenVeld(nextX, nextY)){
                if((nextX==sx)&&(nextY==sy)){
                    return true;
                }
                if(richting(lx, ly, sx, sy).equals("NO")){
                    nextX++;
                    nextY++;
                }
                else if(richting(lx, ly, sx, sy).equals("ZO")){
                    nextX++;
                    nextY--;
                }
                else if(richting(lx, ly, sx, sy).equals("ZW")){
                    nextX--;
                    nextY--;
                }
                else if(richting(lx, ly, sx, sy).equals("NW")){
                    nextX--;
                    nextY++;
                }
            }
        }
        else{
            return false;
        }
        return false;
    }

    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        int lx = scanner.nextInt ();
        int ly = scanner.nextInt ();
        int sx = scanner.nextInt ();
        int sy = scanner.nextInt ();
        int nextX = 0;
        int nextY = 0;
        System.out.println (tikkieLoper (lx, ly, sx, sy, nextX, nextY));
    }
}