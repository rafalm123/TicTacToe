package gameLogic;

import model.Cpu;
import model.Human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WinnerLogic {

    private final Human human;
    private final Cpu cpu;

    public WinnerLogic(Human human, Cpu cpu) {
        this.human = human;
        this.cpu = cpu;
    }


    public String checkWinner() {

        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> midRow = Arrays.asList(4, 5, 6);
        List<Integer> bottomRow = Arrays.asList(7, 8, 9);
        List<Integer> leftCol = Arrays.asList(1, 4, 7);
        List<Integer> middleCol = Arrays.asList(2, 5, 8);
        List<Integer> rightCol = Arrays.asList(3, 6, 9);
        List<Integer> upDownCross = Arrays.asList(1, 5, 9);
        List<Integer> downUpCross = Arrays.asList(7, 5, 3);

        List<List<Integer>> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(bottomRow);
        winning.add(leftCol);
        winning.add(middleCol);
        winning.add(rightCol);
        winning.add(upDownCross);
        winning.add(downUpCross);

        for (List<Integer> l : winning) {
            if (human.getPlayerPositions().containsAll(l)) {
                return "Congratulations, you won";
            } else if (cpu.getCpuPositions().containsAll(l)) {
                return "Computer won";
            } else if (human.getPlayerPositions().size() + human.getPlayerPositions().size() == 9) {
                return "Tie.";
            }
        }
        return "";
    }

}
