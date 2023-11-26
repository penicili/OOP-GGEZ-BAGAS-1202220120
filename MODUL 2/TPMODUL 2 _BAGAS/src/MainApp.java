public class MainApp {
    public static void main(String[] args){
        Mobil mobil = new Mobil("1770", 280, 4, 3);
        System.out.println("Informasi mobil\n"+ mobil.toString());
        System.out.println("\n Waktu tempuh dengan Mobil: "+ mobil.hitungWaktuTempuh(560)+" jam");
    
        Bus bus = new Bus("1771", 356, 36, 38);
        System.out.println("Informasi bus\n"+ bus.toString());
    }
}
