import java.util.Scanner;

public class DecisionOddEven {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input you number : ");
            int num = scanner.nextInt();
                if (num % 2 == 0) { // if ต้องใช้ {} เพื่อบอกให้มันทำงานเมื่ออยู่ในเงื่อนไข
                    System.out.println("The number "+ num + " is Even");
                }
                else { // else ต้องใช้ {} เพื่อบอกให้มันทำงานเมื่ออยู่ในเงื่อนไข
                    System.out.println("The number "+ num + " is Odd");
                }
    }
}
