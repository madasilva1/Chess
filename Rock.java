
public class Rock extends Piece{
    Position position;
       Rock(int cl,int rw) {
          //int myRock = position.GetColum();
           this.position.GetColum();//GetColum has replaced colum becouse a made colum private in Pisition class
                                   // now a had to use GetClum method to acess it, samething in GetRow
           this.position.GetRow();
       }
    boolean isValidMove(Position newPosition) {
        if (newPosition.GetColum() == this.position.GetColum() || newPosition.GetRow() == this.position.GetRow() ) {
            return true;
        } else {
            return false;
        }
    }

}
