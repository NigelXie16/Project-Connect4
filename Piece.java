class Piece {
    // XX I'd recommend some constants here for player1 and 2.
    public String player = "";
    // public static char PLAYER2 = 'O'; //maybe only

    // Constructor to initialize the piece with a specified player
    public Piece(String player) {
        this.player = player;
    }

    // Method to represent the piece as a string
    @Override
    public String toString() {
        return String.valueOf(player);
    }
}
