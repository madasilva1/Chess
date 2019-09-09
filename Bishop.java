public class Bishop extends Piece {
       Position position = new Position(3,8);
    boolean isValidMove(Position newPosition){
      if(Math.abs(newPosition.GetColum() - this.position.GetColum()) == Math.abs(newPosition.GetRow()-this.position.GetRow()))
        {
          return true;
        }
      else {
          return  false;
      }
    }
}
