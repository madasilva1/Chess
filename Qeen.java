public class Qeen extends Piece {
    Queen queen = new Queen(3,9);
        Position testPosition = new Position(3,9);
        if(queen.isValidMove(testPosition)){
            System.out.println("Yes, I can move there.");
        }
        else{
            System.out.println("Nope, can't do!");
        }

}
