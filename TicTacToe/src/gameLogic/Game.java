package gameLogic;

import model.Board;
import model.Cpu;
import model.Human;

import java.util.Random;

public class Game {

    public static void playGame(Board board, Human human, Cpu cpu) {

        WinnerLogic winnerLogic = new WinnerLogic(human, cpu);
        boolean random = startingPlayer();

        while (true) {
            if (random) {
                human.makeMove(board, true);
                String result = winnerLogic.checkWinner();
                if (result.equals("Congratulations, you won") || result.equals("Computer won") || result.equals("Tie.")) {
                    System.out.println(result);
                    break;
                }
                cpu.makeMove(board, true);
                board.printBoard();
            } else {
                cpu.makeMove(board, false);
                board.printBoard();
                String result = winnerLogic.checkWinner();
                if (result.equals("Congratulations, you won") || result.equals("Computer won") || result.equals("Tie.")) {
                    System.out.println(result);
                    break;
                }
                human.makeMove(board, false);
            }
            String result = winnerLogic.checkWinner();

            if (result.equals("Congratulations, you won") || result.equals("Computer won") || result.equals("Tie.")) {
                System.out.println(result);
                break;
            }
        }
    }

    public static boolean startingPlayer() {
        Random rand = new Random();
        boolean priority = rand.nextBoolean();

        if (priority) {
            System.out.println("model.Player starts!");
        } else {
            System.out.println("model.Cpu first!");
        }
        return priority;
    }
}