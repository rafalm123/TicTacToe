package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Human implements Player {

    private final ArrayList<Integer> playerPositions;

    public Human() {
        this.playerPositions = new ArrayList<>();
    }

    public ArrayList<Integer> getPlayerPositions() {
        return playerPositions;
    }

    public void makeMove(Board board, boolean priority) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("model.Player's Move");
        System.out.println("Select the box");
        int playerPos = scanner.nextInt();
        while (playerPositions.contains(playerPos) || board.getCpu().getCpuPositions().contains(playerPos)) {
            System.out.println("Position taken, try again");
            playerPos = scanner.nextInt();
        }
        playerPositions.add(playerPos);
        board.placeBox(playerPos, "model.Player", priority);
    }
}