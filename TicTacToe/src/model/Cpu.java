package model;

import model.Player;

import java.util.ArrayList;
import java.util.Random;

public class Cpu implements Player {

    private final ArrayList<Integer> cpuPositions;

    public Cpu() {
        this.cpuPositions = new ArrayList<>();
    }

    public ArrayList<Integer> getCpuPositions() {
        return cpuPositions;
    }

    public void makeMove(Board board, boolean priority) {
        Random rand = new Random();
        System.out.println("Computer's Move");
        int cpuPos = rand.nextInt(9) + 1;
        while (board.getHuman().getPlayerPositions().contains(cpuPos) || cpuPositions.contains(cpuPos)) {
            cpuPos = rand.nextInt(9) + 1;
        }
        cpuPositions.add(cpuPos);
        board.placeBox(cpuPos, "Computer", priority);
    }

}