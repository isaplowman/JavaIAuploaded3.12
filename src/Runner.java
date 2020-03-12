import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        //make instances
        Board b = new Board();
        Human h = new Human("Alby", "X");
        Computer c = new Computer("Z");
        Scanner sc =  new Scanner(System.in);

        //game loop - alternate moves
        while(!h.checkWin() && !c.checkWin()) {

            //set up vars
            boolean legalCol = false;

            int moveCol = -1;

            //human move: validate input and move
            while(!legalCol) {

                //col move
                System.out.println("Enter col to move:");
                //hasNextInt will return true if user input is an int
                if(sc.hasNextInt()) {
                    moveCol = sc.nextInt();
                    legalCol = true;
                }
                else {
                    System.out.println("Enter a legal col!");
                    sc.next();  //very important, resets the input from the "bad" one
                }

                if(legalCol) {
                    b.makeMove(moveCol,h.token);
                }
            }

            //computer move
            int[] cMove = c.determineMove();
            b.makeMove(cMove,c.token);

            //all done moving, display and repeat
            h.display();
            c.display();

        }

        System.out.print("Game Over!");

    }

}