

public class Player {


    //super class for Human/Computer
    //"protected" means available to sub-classes but nowhere else
    protected Board b = new Board();
    protected String name;
    protected String token;


    public Player(String name, String token) {
        this.name = name;
        this.token = token;
    }

    //display board with nice text intro
    public void display() {
        System.out.println(name + "'s board:");
        b.displayBoard();
    }

    //win check routine with basic "algorithm" for now
    //any move at 0,0 ends game
    public boolean checkWin() {

        if(b.grid[0][0] != "0") {
            return true;
        }

        return false;

    }
}
