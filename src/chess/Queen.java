package chess;

class Queen extends Piece {

    public Queen(Position position, Player owner, Game game) {
        super(position, owner, game);
    }

    @Override
    boolean move(Position newPosition) {
        return false;
    }

    @Override
    public String toString() {
        if(owner == game.white) {
            return "♕";
        } else {
            return "♛";
        }
    }
}
