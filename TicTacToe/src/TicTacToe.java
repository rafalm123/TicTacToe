import gameLogic.Game;
import model.Board;
import model.Cpu;
import model.Human;

import java.util.*;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String repeat;

        do {
            Human human = new Human();
            Cpu cpu = new Cpu();
            Board board = new Board(human, cpu);

            Game.playGame(board, human, cpu);

            System.out.println("Do you want to play again? (Y/N)");
            repeat = scanner.next().toUpperCase();
        } while (repeat.equals("Y"));
    }
}