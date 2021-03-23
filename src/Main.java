import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Student Name
        System.out.println("Student name is ");
        String studentName = input.next();

        //English Grade
        System.out.println("English Grade = ");
        float englishGrade = input.nextFloat();

        //Math Grade
        System.out.println("Math Grade = ");
        float mathGrade = input.nextFloat();

        //AP Grade
        System.out.println("AP Grade = ");
        float apGrade = input.nextFloat();

        //Filipino Grade
        System.out.println("Filipino Grade = ");
        float filipinoGrade = input.nextFloat();

        //Science Grade
        System.out.println("Science Grade = ");
        float scienceGrade = input.nextFloat();

        //Final Grade
        double finalGrade = (englishGrade + mathGrade + apGrade + filipinoGrade + scienceGrade) / 5;
        System.out.println("The average grade of " + studentName + " is " + finalGrade);


    }
}
