//package JAVA_PROJECT;
import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter total number of subjects: ");
        int numSubjects = sc.nextInt();

        int totalMarks =0;
        
        for(int i=1; i<= numSubjects;i++){
            System.out.println("Enter marks for subject " +i+" (out of 100)");
            int marks = sc.nextInt();

            while (marks<0 || marks >100) {
                System.out.println("Invalid marks. please enter marks between 0 to 100.");
                System.out.println("Enter marks for subject " +i+ "out of 100");
                marks = sc.nextInt();
            }
            totalMarks += marks;
        }
        System.out.println("Student Result: ");
        System.out.println("Total marks obtained in all subjects: " + totalMarks);

        int AveragePercentage = totalMarks/ numSubjects;
        System.out.println("Average persentage: "+AveragePercentage);

        if(AveragePercentage >= 90){
            System.out.println("your grade : A+");
        }
        else if(AveragePercentage >= 80){
            System.out.println("your grade : A");
        }
        else if(AveragePercentage >= 70){
            System.out.println("your grade : B+");
        }
       else if(AveragePercentage >= 60){
            System.out.println("your grade : B");
        }
      else  if(AveragePercentage >= 50){
            System.out.println("your grade : C+");
        }
      else  if(AveragePercentage >= 40){
            System.out.println("your grade : c");
        }
        else {
            System.out.println("your grade : failed");
        }
    }
}
