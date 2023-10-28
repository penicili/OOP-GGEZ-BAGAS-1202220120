public class User {
    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    private String userName;
    private String userPhone;

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    

    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
    // Register User
    public void userRegist(){
        //register here
        System.out.println("Berhasil menambahkan user");
        System.out.println("Nama kamu adalah: "+ userName);
        System.out.println("Nomer kamu adalah: "+ userPhone);
    }
    public void userShow(){

    }
}
