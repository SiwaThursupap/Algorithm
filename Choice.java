import java.util.Scanner;

public class Choice {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter you number : ");
        int number = scanner.nextInt();
            if (number == 1) { // if ต้องใช้ {} เพื่อบอกให้มันทำงานเมื่ออยู่ในเงื่อนไข
                    System.out.print("Enter you base of the triangle\n");
                        int base = scanner.nextInt(); // scanner.nextInt() = ตัวเก็บข้อมูลแปลงเป็นตัวแปร//
                    System.out.print("Enter you height of the triangle\n");
                        int height = scanner.nextInt();
                        double Triangle = 0.5 * (base * height);
                    System.out.println("Base = " + base);
                    System.out.println("Height = " + height);
                    System.out.println("Area of Triangle = " + Triangle + " unit");
            }
            else {
                if (number == 2) { // else ต้องใช้ {} เพื่อบอกให้มันทำงานเมื่ออยู่ในเงื่อนไข
                System.out.println("Enter You Weight in kilograms");
                    double weight = scanner.nextDouble();
                System.out.println ("Enter You Height in meters");
                    double height = scanner.nextDouble();
                double bmi = weight/(height*height);
                System.out.println ("Your BMI for weight = "+weight+"kg and height = "+height+ "methers is :"+bmi+" bmi.");
                }
                else {
                    System.out.println("Error");
                }
            }
    }
}
