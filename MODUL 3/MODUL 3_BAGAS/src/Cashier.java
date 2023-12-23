public class Cashier extends Bioskop {
    // TO DO : Create a method to print ticket
    public void printTicket(User user) {
        boolean isBooked = false;
        System.out.println("Mencetak tiket...\n====================");
        for (int i = 0; i < super.seats.length; i ++){
            for (int j = 0; j < super.seats[i].length; j++){
                if (super.seats[i][j]==1){
                    isBooked = true;
                    System.out.println("=========================");
                    System.out.println("Nama: "+ user.getName());
                    System.out.println("Phone:" + user.getnoHandPhone());
                    System.out.println("=========================");
                    System.out.println("Selamat Menonton!");
                }
            }
        }
    }

    
}

