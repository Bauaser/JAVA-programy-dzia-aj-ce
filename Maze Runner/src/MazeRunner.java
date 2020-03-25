import java.util.*;

public class MazeRunner {
    public static Maze myMap = new Maze();

    public static void main(String[] args) {
        Intro();
        userMove();
    }

    public static void Intro() {
        System.out.println("Welcome to Maze Runner. Oh brave one.");
        System.out.println("Here is your current position");
        myMap.printMap();
    }

    public static void userMove() {
        int move = 0;
        while (myMap.didIWin() == false) {
            boolean correct = true;
            System.out.println(("where would you like to move? (R, L, U, D)"));
            Scanner input = new Scanner(System.in);
            String dir2 = input.next();
            String dir =dir2.toUpperCase();
            while (correct == true) {
                if (dir.equals("R") || dir.equals("L") || dir.equals("U") || dir.equals("D")) {
                    correct = false;
                } else {
                    System.out.println("where would you like to move? (R, L, U, D)");
                    dir = input.next();
                }
            }
            if (myMap.isThereAPit(dir)==true) {
                System.out.println("Watch out! There is a pit ahead, jump it?");
                String decision = input.next();
                if (decision.startsWith("y")){
                    myMap.jumpOverPit(dir);
                    myMap.printMap();
                    continue;
                }
            }
            boolean via = false;
            if (dir.equals("R")) {
                via = myMap.canIMoveRight();
            } else if (dir.equals("L")) {
                via = myMap.canIMoveLeft();
            } else if (dir.equals("U")) {
                via = myMap.canIMoveUp();
            } else {
                via = myMap.canIMoveDown();
            }
 if (via==true) {
     if (dir.equals("R")){
         myMap.moveRight();
     }
     if (dir.equals("L")){
         myMap.moveLeft();
     }
     if (dir.equals("U")){
         myMap.moveUp();
     }
     if (dir.equals("D")){
         myMap.moveDown();
     }
     myMap.printMap();
 } else {
     System.out.println("Not possible. There is a wall there.");
     myMap.printMap();
 }
 move +=1;
 moveMessage(move);
        }
        System.out.println("Congratulations, you made it out alive. " +
                "\n and you did it in " + move + " moves!");
    }
    public static void moveMessage (int move) {
        if (move == 50){
            System.out.println("Warning you have made 50 moves," +
                    "\n you have 50 remaining before the maze exit closes.");
        } else if (move == 75) {
            System.out.println("Alert! You have made 75 moves," +
                    "\n you have 25 remaining before the maze exit closes.");
        } else if (move ==90) {
            System.out.println("Danger! You have made 90 moves," +
                    "\n you have 10 remaining before the maze to escape!!");
        } else if (move ==100) {
            System.out.println("Oh no! You took too long to escape," +
                "\n and now the exit is closed forever.");
        } else if (move == 101) {
            System.out.println("Sorry, but you did not escape in time. You lose!");
        return;
        }
        }
    }