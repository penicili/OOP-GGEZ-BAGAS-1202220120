import java.util.List;
import java.util.ArrayList;

public class Database {

    // TODO: Create List of Konser Object to Store Konser from Konser Class
    
    ArrayList <Konser> konsers = new ArrayList<>();
    
    // TODO: Create Method to insert Konser to Database
    public void input(Konser konser) {
    konsers.add(konser);
}

    // TODO: Create Method to Show Konser from Database
    public void showAll(){
        for (Konser xKonser : konsers){
            System.out.println("Nama konser: "+ Konser.getBandName());
            System.out.println("Tanggal konser: "+ Konser.getDate());
            System.out.println("Lokasi konser: "+ Konser.getLocation());
            System.out.println("Harga tiket konser: "+ Konser.getTixPrice());
        }
    }

    // TODO: Create Method to Buy Ticket and Show the Total Price
    public void buyTix(int buyAmount) {

        
    } {
    //membeli tiket coy

}
}
