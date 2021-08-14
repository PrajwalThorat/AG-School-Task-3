import java.util.Scanner;
public class AGSchoolTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number Of Student : ");
        int noOfStudent = scanner.nextInt();


        String[] Name = new String[noOfStudent];
        String[] rollNumber = new String[noOfStudent];
        int[] Math = new int[noOfStudent];
        int[] Science = new int[noOfStudent];
        int[] English = new int[noOfStudent];
        int[] Language = new int[noOfStudent];
        int[] socialStudies = new int[noOfStudent];
        double[] totalMarks = new double[noOfStudent];
        double[] average = new double[noOfStudent];

        for(int i=0 ; i<noOfStudent ; i++){
            System.out.println("Enter the "+(i+1)+" Student Details");
            System.out.print("Enter the Name       : ");
            Name[i] = scanner.next();
            System.out.print("Enter the Roll Number : ");
            rollNumber[i] = scanner.next();
            System.out.println("Enter the Marks of the Student out of 100");
            System.out.println("Subject    Max. Marks       Marks Obtains");
            System.out.print(" Math           100                ");
            Math[i] = scanner.nextInt();
            System.out.print("Science         100                ");
            Science[i] = scanner.nextInt();
            System.out.print("English         100                ");
            English[i] = scanner.nextInt();
            System.out.print("Language        100                ");
            Language[i] = scanner.nextInt();
            System.out.print("Social Studies  100                ");
            socialStudies[i] = scanner.nextInt();
            System.out.println("--------------------------------------");
            totalMarks[i] = Math[i] + Science[i] + English[i] + Language[i] + socialStudies[i];
            System.out.println("Total           600                "+totalMarks[i]);
            average[i] = totalMarks[i]/5;
            System.out.println("Average        : "+average[i]);
        }
        for(int i=0 ; i<noOfStudent ; i++){
            if(average[i]>=95){
                System.out.println("--Student Score Card--");
                System.out.println("Name\t\t: "+Name[i]+"\nRoll Number\t: "+rollNumber[i]);
                System.out.println("Total Marks : 500\tObtained Marks\t: "+totalMarks[i]);
                System.out.println("Result\t\t: Pass\tAverage\t: "+average[i]);
                System.out.println("Grade\t\t: A");
            }
        }
        for(int i=0 ; i<noOfStudent ; i++){
            if(average[i]>=80 && average[i]<=90){
                System.out.println("--Student Score Card--");
                System.out.println("Name\t\t: "+Name[i]+"\nRoll Number\t: "+rollNumber[i]);
                System.out.println("Total Marks : 500\tObtained Marks\t: "+totalMarks[i]);
                System.out.println("Result\t\t: Pass\tAverage\t: "+average[i]);
                System.out.println("Grade\t\t: B");
            }
        }
        for(int i=0 ; i<noOfStudent ; i++){
            if(average[i]>=70 && average[i]<=80){
                System.out.println("--Student Score Card--");
                System.out.println("Name\t\t: "+Name[i]+"\nRoll Number\t: "+rollNumber[i]);
                System.out.println("Total Marks : 500\tObtained Marks\t: "+totalMarks[i]);
                System.out.println("Result\t\t: Pass\tAverage\t: "+average[i]);
                System.out.println("Grade\t\t: C");
            }
        }
        for(int i=0 ; i<noOfStudent ; i++){
            if(average[i]>=60 && average[i]<=70){
                System.out.println("--Student Score Card--");
                System.out.println("Name\t\t: "+Name[i]+"\nRoll Number\t: "+rollNumber[i]);
                System.out.println("Total Marks : 500\tObtained Marks\t: "+totalMarks[i]);
                System.out.println("Result\t\t: Pass\tAverage\t: "+average[i]);
                System.out.println("Grade\t\t: D");
            }
        }
        for(int i=0 ; i<noOfStudent ; i++){
            if(average[i]>=50 && average[i]<=60){
                System.out.println("--Student Score Card--");
                System.out.println("Name\t\t: "+Name[i]+"\nRoll Number\t: "+rollNumber[i]);
                System.out.println("Total Marks : 500\tObtained Marks\t: "+totalMarks[i]);
                System.out.println("Result\t\t: Pass\tAverage\t: "+average[i]);
                System.out.println("Grade\t\t: E");
            }
        }
        for(int i=0 ; i<noOfStudent ; i++){
            if(average[i]<50){
                System.out.println("--Student Score Card--");
                System.out.println("Name\t\t: "+Name[i]+"\nRoll Number\t: "+rollNumber[i]);
                System.out.println("Total Marks : 500\tObtained Marks\t: "+totalMarks[i]);
                System.out.println("Result\t\t: Pass\tAverage\t: "+average[i]);
                System.out.println("Grade\t\t: F");
            }
        }
    }
}