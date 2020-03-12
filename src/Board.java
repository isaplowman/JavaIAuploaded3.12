public class Board {

    String[][] grid = new String[8][8];



//initialized entire grid with 0 outputs for each slot
    public Board(){
        for(int row=0; row< 8; row++){

            for(int col =0; col<8; col++){

                grid[row][col] = "-";
            }
        }
    }


//This will display the board on the console
    public void displayBoard(){

        System.out.println("Board has been updated!");

        for(int row=0; row<8; row++){

            for(int col=0; col<8; col++){

                System.out.print(grid[row][col]);
            }
            System.out.print("-");
        }
    }


//this enters either the player or computer move onto the board\
    public boolean makeMove(int col, String token){
        for(int i = 7; i>=0; i--){
            if(grid[i][col].equals("-")){
                grid[i][col] = token;
                return true;
            }
        }
        return false;

    }



//checks if a player has won
    public boolean winCheck(){

        for(int i= 0; i< 8; i++){
            if(grid[i][i].equals(grid[i][i+1].equals(grid[i][i+2].equals(grid[i][i+3])))) {
                return true;
            }
            if(grid[i][i].equals(grid[i+1][i].equals(grid[i+2][i].equals(grid[i+3][i])))){
                return true;
            }
        }
        return false;


    }


}
