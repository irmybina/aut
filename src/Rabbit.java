import java.util.Random;

public class Rabbit {
    double runawayChances;

    public double throwDice(){
        runawayChances = new Random().nextDouble();
        return runawayChances;
    }
}
