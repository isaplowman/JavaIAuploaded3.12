public class Computer extends Player {


    public Computer(String token){
        super("Bit Bucket", token);
    }


//algorithm that makes a move
    public int[] determineMove(){
        int col = (int )(Math.random() * 8);

        int[] move =  {col};

        return move;

    }
}
