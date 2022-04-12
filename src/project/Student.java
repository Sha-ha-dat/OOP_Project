
package project;


import java.util.Scanner;

public class Student {

    public String firstName;
    public String lastName;
    public int semester;
    public String studentID;
    public String courses ="" ;
    private static int costOfCourse = 5000;
    public int tutionfee;
    public int patTution;
    public int id =1000;
    public int f = 0;

    public void add_info(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student's first name: ");
        this.firstName = input.next();

        System.out.println("Enter Student's last name: ");
        this.lastName = input.next();

        System.out.println("Enter Student's Semester : ");
        this.semester = input.nextInt();
        
        System.out.println("Enter Student's ID : ");
        this.id = input.nextInt();
    }

//    public void setId() {
//       id++;
//       this.studentID = semester + "" + id;
//    }

    public void courses() {
        System.out.println("Enter courses you want to Enroll in:  (Q to quit ): ");
        do {
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            
            if (!course.equals("Q")) {
                f++;
                this.courses = courses + " \n" + course;
                this.tutionfee = tutionfee + costOfCourse;
            } else {
                break;
            }
        } while (true);

    }

    public void tuitionFee() {
        System.out.println("You have taken"+ f + " courses");
        System.out.println("\n\n\n Your Fees due : " + this.tutionfee);
    }

    public void payment() {
        
        System.out.println("Enter your Payment Amount:");
        Scanner input = new Scanner(System.in);
        int payTution = input.nextInt();
        tutionfee = tutionfee - payTution;

        System.out.println(payTution + " Taka paid Successfully");
        System.out.println("Fees Due: " + tutionfee );

    }

    public static void show_info(Student[] students, int a) {
    	for(int i = 0; i < a; i++) {
    		System.out.println("Name: " + students[i].firstName + " " + students[i].lastName +
                "\nSemester: " + students[i].semester + 
                "\nStudent ID: " + students[i].id + 
                "\nyour courses : " + students[i].courses + 
                "\nBalance: " + students[i].tutionfee);
    	}
    }

}

