public class MainApp {
    public static void main(String[] args){
        
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi expedisi = new Ekspedisi(10, "jakarta", 10000);
        expedisi.informasi();
        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress teluxpress = new TelUExpress(100, "bandung", 50000, true);
        teluxpress.informasi();
        teluxpress.ambil("Sukabirus");
        teluxpress.antar(17777);
        teluxpress.antar(12012,12312);
        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress friExpress = new FRIExpress(30, "bojongsoang", 70000, false);
        friExpress.informasi();
        friExpress.terima(2000);
        friExpress.kirim("Lembang");
        friExpress.kirim("Braga", "Rancaekek");

    }
}
