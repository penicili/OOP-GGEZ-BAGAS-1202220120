public class Admin extends User {
    public Admin(String Name, int Id){
        super(Name, Id);
    }
    public void manageSystem(String Course){
        System.out.println(Name + " is managing " + Course);
    }
    @Override
    public String getUserDetails(){
        return super.getUserDetails() + "is admin ";
    } 
}
