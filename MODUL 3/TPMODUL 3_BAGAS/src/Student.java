import java.util.ArrayList;

public class Student extends User{
    protected ArrayList <String> enrolledCourse;
    
    public Student(String Name, int Id){
        super(Name, Id);
        enrolledCourse = new ArrayList<>();
    }
    public void enrollInCourse(String Course){
        enrolledCourse.add(Course);
    }
    
    @Override
    public String getUserDetails(){
        return "Student - Name: "+ super.getUserDetails() + "\nEnrolled Courses: "+ enrolledCourse.toString();
    }
}
