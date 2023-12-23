import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // TO DO : Create a Scanner object to receive input from the user
        Scanner scanner = new Scanner(System.in);
        // TO DO : Create Bioskop and Cashier objects
        Bioskop bioskop = new Bioskop();
        Cashier cashier = new Cashier();
        // TO DO : Take the name from the user, make sure it is not empty
        System.out.println("=====Silahkan Register====");
        String nama = scanner.nextLine();
        // TO DO : Take the phone number from the user, make sure it is valid
        
        // TO DO : Create a code for ticket order
        while (true) {
            System.out.println("Apakah anda ingin memesan kursi (y/n)");
            String inputBang = scanner.nextLine();
            if (inputBang == "y"){
                
            }
        }
        // TO DO : Create a exception if user enter not number

        // TO DO : Create a exception if user enter number is out of range

        // TO DO : Call the method to reserve seats in the cinema

        // TO DO : Close the Scanner object when the user is finished   
    }
}