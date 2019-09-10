public class Qeen extends Piece {
    Position position;

    Qeen(int cl, int rw) {
        this.position.GetColum();
        this.position.GetColum();
    }

    boolean isValidMove(Position newPosition) {
        if (newPosition.GetColum() == this.position.GetColum() || newPosition.GetRow() == this.position.GetRow() && Math.abs(newPosition.GetColum() - this.position.GetColum()) == Math.abs(newPosition.GetRow() - this.position.GetRow())) {
            return true;
        } else {
            return false;
        }


    }
}