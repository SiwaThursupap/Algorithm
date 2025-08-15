import java.util.Scanner;

public class BMICalculator{
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter You Weight in kilograms");
        double weight = scanner.nextDouble();
    System.out.println ("Enter You Height in meters");
        double height = scanner.nextDouble();
        double bmi = weight/(height*height);
    System.out.println ("Your BMI for weight = "+weight+"kg and height = "+height+ "methers is :"+bmi+" bmi.");
    }
}