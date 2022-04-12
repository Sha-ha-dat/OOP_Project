
package project;


import java.util.Scanner;

public class StudentTest {

    public String firstName;
    public String lastName;
    public int semester;
    public String studentID;
    public String courses ="" ;
    private static int costOfCourse = 5000;
    public int tutionfee;
    public int patTution;
    private static int id =1000;
    public int f = 0;
    
    
    public void add_info(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student's first name: ");
        this.firstName = input.next();

        System.out.println("Enter Student's last name: ");
        this.lastName = input.next();

        System.out.println("Enter Student's Semester : ");
        this.semester = input.nextInt();      
    }

    public void setId() {
        id++;
       this.studentID = semester + "" + id;
    }

    public void courses() {
        System.out.println("Enter courses you want to Enroll in:  (Q to quit ): ");
        int f = 0;
        do {
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            
            if (!course.equals("Q")) {
                f++;
                courses = courses + " \n" + course;
                tutionfee = tutionfee + costOfCourse;
            } else {
                break;
            }
        } while (1 != 2);

    }

    public void tuitionFee() {
        System.out.println("You have taken"+ f + " courses");
        System.out.println("\n\n\n Your Fees due : " + tutionfee);
    }

    public void payment() {
        
        System.out.println("Enter your Payment Amount:");
        Scanner input = new Scanner(System.in);
        int payTution = input.nextInt();
        tutionfee = tutionfee - payTution;

        System.out.println(payTution + " Taka paid Successfully");
        System.out.println("Fees Due: " + tutionfee );

    }

    public String show_info() {
        return "Name: " + firstName + " " + lastName +
                "\nSemester: " + semester + 
                "\n Student ID: " + studentID + 
                " your courses : " + courses + 
                "\nBalance: " + tutionfee;
    }

}

