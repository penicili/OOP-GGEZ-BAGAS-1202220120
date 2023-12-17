import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // membuat arraylist
        ArrayList<String> hahalist = new ArrayList<>();
        hahalist.add("Course ID: 101,\nCourse Name: Statistika Industri\n - Student: Haris\n - Student: Metta");
        hahalist.add("Course ID: 102,\nCOurse Name: Desjarkom\n - Student: Wendy\n - Student: Emilia");
        
        //membuat objek student, teacher dan atmin
            //Objek student
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();
        System.out.println("Enter student ID:");
        int studentId = scanner.nextInt();
        Student student = new Student(studentName, studentId);
        scanner.nextLine();
        System.out.println("Enter course to enroll in (separated by commas)");
        String enrollcourse = scanner.nextLine();
        student.enrollInCourse(enrollcourse);
        System.out.println("\n");
        scanner.close();

        //objek teacher
        Teacher teacher = new Teacher("Pak Yoga Raditya", 1771200);
        //objek atmin
        Admin admin = new Admin("Hudza", 120120120);


        //Sout courses
        System.out.println(hahalist.get(0)+"\n");
        
        System.out.println(hahalist.get(1)+"\n");

        //getuserdetails student baru
        System.out.println(student.getUserDetails()+"\n");

        //teachClass sama manageSystem
        teacher.teachClass("Math");
        admin.manageSystem("the university system");
    }
}
