

public class Main {
    public static void main(String[] args){

        Rock rock = new Rock(3,9);
        Position testPosition = new Position(3,10);
        if(rock.isValidMove(testPosition)){
            System.out.println("Yes, I can move there.");
        }
        else{
            System.out.println("Nope, can't do!");
        }

    }
}
