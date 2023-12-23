public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    public static final int ROWS = 5;
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    public static final int SEATS_PER_ROW = 10; 
    // TO DO: Create 2 dimensional array to store seat reservation status
    public int[][] seats = new int[ROWS][SEATS_PER_ROW];
    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
       seats[0][2] = 1;
       seats[1][5] = 1;
       seats[3][7] = 1;
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        for (int c = 0; c < 5; c ++){
            for (int r = 0; r < 10; r ++ ){
                System.out.println(seats[c][r] + "\t");
            }
            System.out.println("\n");
        }
    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if (seats[row][seat]==0) {
            seats[row][seat]=1;
            System.out.println("Kursi berhasil dipesan");
        }else{
            System.out.println("gabisa");
        }
    }
}