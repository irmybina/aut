import java.awt.*;
import java.util.Random;

public class Tiger {
public int tigerState = 4;
public String tigerStateString = "";

public void react(){
switch (tigerState){
    case 0:
        tigerStateString = "run from enemy";

        break;
    case 1:
        tigerStateString = "hunt rabbit";
        break;
    case 2:
        tigerStateString = "atack rabbit";
        break;
    case 3:
        tigerStateString = "run home";
        break;
    default:
        tigerStateString = "find rabbit";
    }
    System.out.println(tigerStateString);
}
public void behave() {
    switch (Main.fieldState) {
        case 0:
            tigerState = 4;
            react();
            break;
        case 1:
            tigerState = 1;
            react();
            double x = new Random().nextDouble();
            if (x > 0.5) {
                tigerState = 2;
                react();
                System.out.println("succeed");
                tigerState = 3;
                react();
            }
            else {
                System.out.println("failed");
                tigerState = 4;
                react();}
            break;
        default:
            tigerState = 0;
            react();
        }
    }
}
