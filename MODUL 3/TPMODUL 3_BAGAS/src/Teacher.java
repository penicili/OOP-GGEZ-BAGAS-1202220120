public class Teacher extends User {
    public Teacher (String Name, int Id){
        super(Name, Id);
    }
    public void teachClass (String Course){
        System.out.println(Name + " is teaching "+ Course);
    }
    @Override
    public String getUserDetails(){
        return super.getUserDetails() + "is teacher ";
    } 
}
