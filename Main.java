package chess;

public class Main {
    public static void main(String[] args){

        Qeen queen = new Qeen();
        Position testPosition = new Position(3,10);
        if(queen.isValidMove(testPosition)){
            System.out.println("Yes, I can move there.");
        }
        else{
            System.out.println("Nope, can't do!");
        }

    }
}
