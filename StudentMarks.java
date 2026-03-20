package assignment3;

import java.util.Scanner;

class MarksOutOfBoundException extends Exception {
 public MarksOutOfBoundException(String message) {
     super(message);
 }
}
public class StudentMarks {

 static void checkMarks(int marks) throws MarksOutOfBoundException {
     if (marks < 0 || marks > 100) {
         throw new MarksOutOfBoundException("Marks out of Bound");
     }
 }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         System.out.print("Enter Roll Number: ");
         int rollNo = sc.nextInt();

         System.out.print("Enter Marks: ");
         int marks = sc.nextInt();

         checkMarks(marks);

         System.out.println("Roll No: " + rollNo);
         System.out.println("Marks: " + marks);

     } catch (MarksOutOfBoundException e) {
         System.out.println("Exception: " + e.getMessage());
     }
     sc.close();
 }
}