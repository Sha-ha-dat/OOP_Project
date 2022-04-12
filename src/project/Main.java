package project;

import java.util.Scanner;
import project.Student;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfStudents = 10000;
        Student[] students = new Student[numOfStudents];
        System.out.println("\t\t\t\t Student Management System");
        System.out.println("\n\n\n");
//      	System.out.println("1. ADD INFO \n2.SHOW INFO \n3.ENROLL COURSE\n4.TUTION FEES\n5.MAKE PAYMENT");
        int n, flag = 0, a = 0;
        while (true) {
            System.out.println("\t\t\t\t<==Student Management System Category==>\n");
            System.out.println("\t\t\t-------------------------------------------------------\n\n");
            System.out.println("\t\t\t\t1. Add Info:\n");
            System.out.println("\t\t\t\t2. Show Info:\n");
            System.out.println("\t\t\t\t3. Enroll course:\n");
            System.out.println("\t\t\t\t4. Tution fee:\n");
            System.out.println("\t\t\t\t5. Make payment:\n");
            System.out.println("\t\t\t\t6. Exit\n");
            System.out.println("\t\t\t\tPlease Enter Your Choice: ");
            n = input.nextInt();

            switch (n) {

                case 1:
                	students[a] = new Student();
                    students[a].add_info();
                    a++;
                    break;

                case 2:
                    Student.show_info(students, a);
                    break;

                case 3:
                	System.out.print("Enter ID of the student: ");
                	int c_id = input.nextInt();
                	for(int i = 0; i < numOfStudents; i++) {
                		if(students[i].id == c_id) {
                			students[i].courses();
                			break;
                		}
                	}
                    break;

                case 4:
                	System.out.print("Enter ID of the student: ");
                	int t_id = input.nextInt();
                	for(int i = 0; i < numOfStudents; i++) {
                		if(students[i].id == t_id) {
                			students[i].tuitionFee();
                		}
                	}
                    break;

                case 5:
                	System.out.print("Enter ID of the student: ");
                	int f_id = input.nextInt();
                	for(int i = 0; i < numOfStudents; i++) {
                		if(students[i].id == f_id) {
                			students[i].payment();
                			break;
                		}
                	}
                    break;
                case 6:
                    flag++;
                    break;
                default:
                    System.out.println("\t\t\t\tInvalid Choice!\n");

            }
            if (flag == 1) {
                flag = 0;
                break;
            }

            System.out.println("\n\npress Enter to continue....");
            input.nextLine();

        }

    }

//    	Student[] students = new Student[numOfStudents];
//    	for (int i = 0; i< numOfStudents ;   i  ++) {
//            students[i] = new Student();
//            students[i].setId();
//        	students[i].enrollCourses();
//        	students[i].payTuition();
//    	}
//    	for (int i = 0; i<numOfStudents; i++){
//    		System.out.println(students[i].toString());
//    	}
	}

