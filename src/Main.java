import javax.swing.*;
import java.util.Random;

import static java.lang.Thread.sleep;

public class Main {
    public static int fieldState = new Random().nextInt(3);
    private static String fieldStateString;
    static Tiger tiger = new Tiger();
    public static void main(String[] args) throws InterruptedException {
        while (tiger.tigerState != 3){
            switch(fieldState){
                case 0:
                    fieldStateString = "NO RABBIT";
                    break;
                case 1:
                    fieldStateString = "RABBIT";
                    break;
                default:
                    fieldStateString = "ENEMY";

            }
            System.out.println("\n" + fieldStateString);
            tiger.behave();
            sleep(2000);
            fieldState = new Random().nextInt(3);
        }
    }
}
