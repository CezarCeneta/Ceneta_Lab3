import java.util.Scanner;

class StudentInfo {
    //Private parameters for the Student Name, Course, Course code, Number of Units, Total of Units, and Fee per Unit
    private String StudentName;
    private String Course;
    private String courseCode;
    private int[] NumOfUnits;
    private int TotalUnits;
    private static final int feePerUnit = 1000;

    //Setter methods for the private variables
    public void StudentInfo(String StudentName, String Course, String courseCode) {
        this.StudentName = StudentName;
        this.Course = Course;
        this.courseCode = courseCode;
        this.NumOfUnits = new int[10]; //The maximum number of units is 10
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

    public void InputUnits() {
        Scanner inputUnits = new Scanner(System.in);
        System.out.print("Enter the amount of units: ");
        int unitInput = inputUnits.nextInt();
        this.TotalUnits = unitInput ; 

    }
    
    public String inputStudentName() {
        Scanner student = new Scanner(System.in);
        System.out.print("\nEnter Student Name: ");
        String nameStudent = student.nextLine();
        return this.StudentName = nameStudent;

    }

    public int calculateTotalFee() {
        return this.TotalUnits * feePerUnit;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + StudentName);
        System.out.println("Total Enrollment Fee: " + calculateTotalFee());
    }
    public void processPayment() {
    Scanner inputPayment = new Scanner(System.in);
    int totalFee = calculateTotalFee();
    System.out.println("\nEnter payment amount: ");
    int paymentAmount = inputPayment.nextInt();

    if (paymentAmount == totalFee) {
        System.out.println("Fully Paid");
    } else if (paymentAmount < totalFee) {
        System.out.println("Partial Payment. Amount Paid: " + paymentAmount);
    } else {
        System.out.println("Overpayment. Change: " + (paymentAmount - totalFee));
    }

    }
}

public class Ceneta_Lab3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    //Create Student Object
    StudentInfo student = new StudentInfo();

    //Input the Student Name
    student.inputStudentName();

    System.out.print("Enter the Course: ");
    String Course = in.nextLine();

    System.out.print("Enter the Course code: ");
    String courseCode = in.nextLine();

    //Input units per subject
    student.InputUnits();

    //Display student iformation and total fee
    student.displayStudentInfo();

    //Procede to payment 
    student.processPayment();

}
}

