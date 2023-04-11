package model;

import model.Cpu;
import model.Human;

public class Board {

    private final char[][] board;
    private final Human human;
    private final Cpu cpu;

    public Board(Human human, Cpu cpu) {
        this.human = human;
        this.cpu = cpu;
        this.board = new char[][] {{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};
    }

    public void printBoard() {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void placeBox(int position, String user, boolean priority) {

        char symbol = ' ';

        if (priority) {
            if (user.equals("Player")) {
                symbol = 'O';
                human.getPlayerPositions().add(position);
            } else if (user.equals("Computer")) {
                symbol = 'X';
                cpu.getCpuPositions().add(position);
            }
        } else {
            if (user.equals("Player")) {
                symbol = 'X';
                human.getPlayerPositions().add(position);
            } else if (user.equals("Computer")) {
                symbol = 'O';
                cpu.getCpuPositions().add(position);
            }
        }
        switch (position) {
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][1] = symbol;
                break;
            case 3:
                board[0][2] = symbol;
                break;
            case 4:
                board[1][0] = symbol;
                break;
            case 5:
                board[1][1] = symbol;
                break;
            case 6:
                board[1][2] = symbol;
                break;
            case 7:
                board[2][0] = symbol;
                break;
            case 8:
                board[2][1] = symbol;
                break;
            case 9:
                board[2][2] = symbol;
                break;
        }
    }

    public char[][] getBoard() {
        return board;
    }

    public Human getHuman() {
        return human;
    }

    public Cpu getCpu() {
        return cpu;
    }
}