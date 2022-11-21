package ChibuzorAssignment.tictac;

import java.util.Arrays;

public class TicTacToe {

    private final Player[] players = new Player[2];
    private Player currentPlayer;

    private final String[][] board = new String[3][3];
    private int playingCount;

    public TicTacToe(Player player1, Player player2) {
        this.players[0] = player1;
        this.players[1] = player2;
        currentPlayer = player1;
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i]," ");
        }
        playingCount = 0;
    }

    public void printTable() {
        System.out.printf(
                """
                
                *==================*
                |  %s  |  %s  |  %s  |
                *------------------*
                |  %s  |  %s  |  %s  |
                *------------------*
                |  %s  |  %s  |  %s  |
                *==================*
                
                """,
                board[0][0], board[0][1], board[0][2],
                board[1][0], board[1][1], board[1][2],
                board[2][0], board[2][1], board[2][2]
                );
    }

    public String getPlayers() {
        return String.format("%s and %s", players[0].getName(), players[1].getName());
    }

    public boolean canPlay() {
        boolean playOn = false;
        for (String[] row : board) {
            for (String cell : row) {
                if (cell.equals(" ")) {
                    playOn = true;
                    break;
                }
            }
        }
        return playOn;
    }

    public String play(int position) {
        int[] positionIndex = getPosition(position);
        if (canPlayPosition(positionIndex)) {
            board[positionIndex[0]][positionIndex[1]] = currentPlayer.getCharacter();
            playingCount++;
            currentPlayer.addPosition(position);
            printTable();
            if (players[0].equals(currentPlayer)) {
                currentPlayer = players[1];
            } else if (players[1].equals(currentPlayer)) {
                currentPlayer = players[0];
            }
            return "1";
        }
        else {
            System.out.println("Position already played. Pick another position");
            return "0";
        }
    }

    private int[] getPosition(int position) {
        int a = 0;
        int b = 0;
        if (position > 0 && position < 10) {
            switch (position) {
                case 1 -> {
                }
                case 2 -> {
                    b = 1;
                }
                case 3 -> {
                    b = 2;
                }
                case 4 -> {
                    a = 1;
                }
                case 5 -> {
                    a = 1;
                    b = 1;
                }
                case 6 -> {
                    a = 1;
                    b = 2;
                }
                case 7 -> {
                    a = 2;
                }
                case 8 -> {
                    a = 2;
                    b = 1;
                }
                case 9 -> {
                    a = 2;
                    b = 2;
                }
            }
        }
        return new int[] {a, b};
    }

    private boolean canPlayPosition(int[] positionIndex) {
        boolean canPlay = false;
        if (board[positionIndex[0]][positionIndex[1]].equals(" ")) {

        }
        return canPlay;
    }

    public String getNextPlayerName() {
        return currentPlayer.getName();
    }

    public Player checkWinner() {
        return players[0];
    }
}
