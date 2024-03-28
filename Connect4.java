/*
 * Connect4 Class
 * Connect4(): make a Connect4 game of default size
 * Connect4(size): make a game of specified size
 * winner(): Return the player (or none) who wins at this time
 * toString(): print out the game board to the terminal
 * gameOver(): Is the game over (there must be a winner, or no winner is possible)
 * move(player,column): The player would like to put a Piece in the column, thereby making a move.  Probably communicates with Board.
 * 
 */
public class Connect4 {
    private Board board;

    public Connect4() {
        this.board = new Board();
    }

    public Connect4(int size) {
        this.board = new Board(size);
    }

    public char winner() {
        // Implement logic to check if there's a winner
        // check if four in a row horizontally, vertically, or diagonally
        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; j < board.getSize(); j++) {
                if (board.B[i][j] != null) {
                    if (i + 3 < board.getSize() && board.B[i][j].player == board.B[i + 1][j].player
                            && board.B[i][j].player == board.B[i + 2][j].player
                            && board.B[i][j].player == board.B[i + 3][j].player) {
                        return board.B[i][j].player;
                    }
                    if (j + 3 < board.getSize() && board.B[i][j].player == board.B[i][j + 1].player
                            && board.B[i][j].player == board.B[i][j + 2].player
                            && board.B[i][j].player == board.B[i][j + 3].player) {
                        return board.B[i][j].player;
                    }
                    if (i + 3 < board.getSize() && j + 3 < board.getSize()
                            && board.B[i][j].player == board.B[i + 1][j + 1].player
                            && board.B[i][j].player == board.B[i + 2][j + 2].player
                            && board.B[i][j].player == board.B[i + 3][j + 3].player) {
                        return board.B[i][j].player;
                    }
                    if (i + 3 < board.getSize() && j - 3 >= 0
                            && board.B[i][j].player == board.B[i + 1][j - 1].player
                            && board.B[i][j].player == board.B[i + 2][j - 2].player
                            && board.B[i][j].player == board.B[i + 3][j - 3].player) {
                        return board.B[i][j].player;
                    }
                }
            }
        }
        return 'N';
    }

    @Override
    public String toString() {
        return this.board.toString();
    }

    public boolean gameOver() {
        // Implement logic to check if the game is over
        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; j < board.getSize(); j++) {
                if (board.B[i][j] == null) {
                    return false;
                }
            }
        }
        if (winner()== 'N') {
            return false;
        }
        return true;
    }

    public void move(int player, int column) {
        // Implement logic to make a move
        if (player == 1) {
            board.add(new Piece('X'), column);
        } else {
            board.add(new Piece('O'), column);
        }
    }

    public static void main(String[] args) {
        Connect4 game = new Connect4(5);
        System.out.println(game);
        game.move(1, 0);
        game.move(2, 1);
        game.move(1, 0);
        game.move(2, 1);
        game.move(1, 0);
        game.move(2, 1);
        game.move(2, 1);
        System.out.println(game);
        System.out.println(game.winner());
    }
}
