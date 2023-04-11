package gameLogic;

import java.util.Random;

public class Priority {

    private boolean priority;

    public boolean startingPlayer() {
        Random rand = new Random();
        priority = rand.nextBoolean();

        if (priority) {
            System.out.println("model.Player starts!");
        } else {
            System.out.println("model.Cpu first!");
        }
        return priority;
    }

    public boolean isPriority() {
        return priority;
    }
}
