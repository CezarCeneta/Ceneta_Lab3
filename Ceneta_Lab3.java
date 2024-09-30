import java.util.Scanner;

class StudentInfo {
    //Private parameters for the Student Name, Course, Course code, Number of Units, Total of Units, and Fee per Unit
    private String StudentName;
    private String Course;
    private String courseCode;
    private int TotalUnits;
    private static final int feePerUnit = 1000;

    //Setter methods for the private variables
    public void StudentInfo(String StudentName, String Course, String courseCode) {
        this.StudentName = StudentName;
        this.Course = Course;
        this.courseCode = courseCode;
        this.TotalUnits = 0;
    }

    //Getter method for the Student Name
    public String getStudentName() {
        return this.StudentName;
    }

    //Getter method for the Course
    public String getCourse() {
        return this.Course;
    }

    //Getter method for the Course Code
    public String getCourseCode() {
        return this.courseCode;
    }

    //Getter method for the Total Units
    public int getTotalUnits() {
        return this.TotalUnits;
    }

    //Method for requesting prompt from the user by units
    public void InputUnits() {
        Scanner inputUnits = new Scanner(System.in);
        System.out.print("Enter the amount of units: ");
        int unitInput = inputUnits.nextInt(); //Ask the user for the units
        this.TotalUnits = unitInput ; //The entered unit is now stored to the total units 

    }
    
    //Method for entering the Student name
    public String inputStudentName() {
        Scanner student = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String nameStudent = student.nextLine(); //Ask the user for the Student name
        return this.StudentName = nameStudent; //The entered student name is stored to the private parameter

    }

    //Method for entering the Course
    public String inputCourse() {
        Scanner course = new Scanner(System.in);
        System.out.print("Enter Course: ");
        String courseSub = course.nextLine(); //Ask the user for Course
        return this.Course = courseSub; //The entered course is stored to the private parameter

    }

    //Method for entering the Course code
    public String inputCourseCode() {
        Scanner coursecode = new Scanner(System.in);
        System.out.print("Enter Course Code: ");
        String courseCodes = coursecode.nextLine(); //Ask the user for Course code
        return this.courseCode = courseCodes; //The entered course code is stored to the private parameter

    }

    //Method for calculating the total fee per amount of unit
    public int calculateTotalFee() {
        return this.TotalUnits * feePerUnit;
    }

    //Method for displaying the Student name and totalfee
    public void displayStudentInfo() {
        System.out.println("Student Name: " + StudentName);
        System.out.println("Total Enrollment Fee: " + calculateTotalFee());
    }

    //Method for proccessing the payment for the enrollment fee
    public void processPayment() {
    Scanner inputPayment = new Scanner(System.in);
    int totalFee = calculateTotalFee();
    System.out.println("\nEnter payment amount: ");
    int paymentAmount = inputPayment.nextInt(); //Ask the user for the payment

    //Using conditionals varying the amount of payment entered by the user
    if (paymentAmount == totalFee) {
        System.out.println("Fully Paid"); //The payment is exact
    } else if (paymentAmount < totalFee) {
        System.out.println("Partial Payment. Amount Paid: " + paymentAmount); //The payment is lesser than the full payment
    } else {
        System.out.println("Overpayment. Change: " + (paymentAmount - totalFee)); //The payment is greater and hands in change of the payment
    }

    }
}

//
public class Ceneta_Lab3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    //Create Student Object
    StudentInfo student = new StudentInfo();

    //Input the Student Name
    student.inputStudentName();

    //Input the Course 
    student.inputCourse();

    //Input the Course code
    student.inputCourseCode();

    //Input units per subject
    student.InputUnits();

    //Display student iformation and total fee
    student.displayStudentInfo();

    //Procede to payment 
    student.processPayment();

}
}

