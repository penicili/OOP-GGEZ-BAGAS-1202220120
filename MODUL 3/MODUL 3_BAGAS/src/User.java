public class User {
   
   
   // TO DO: Create Private Attributes of User (nama, noHandphone)
   public String nama;
   public String noHandphone;
   // TO DO: Create Constructor of User
   public void setName(String nama) {
         this.nama = nama;
      }
   public void setNoHandPhone(String noHandphone) {
         this.noHandphone = noHandphone;
      }
   // TO DO: Create register Method to show information about name and phone number
   public void register(){
      System.out.println("====Silahkan Register====");
      System.out.println("Masukkan nama: "+ nama);
      System.out.println("Masukkan nomer telepon: "+ noHandphone);
      System.out.println("Nama: "+ nama +"\nNo Handphone: "+ noHandphone);
    }
   // TO DO: Create method to return name and phone number
   
   public String getName() {
     return nama;
  }

   public String getnoHandPhone() {
     return noHandphone;
  }
}






  