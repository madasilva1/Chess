public class Piece {

//GetRow have replaced row and colum to have acess on both from Position class
    boolean isValidMove(Position newPosition) {
        if (newPosition.GetRow() > 0 && newPosition.GetColum() > 0 && newPosition.GetRow() < 8 && newPosition.GetColum() < 8) {
            return true;
        } else {
            return false;
        }
    }
}
