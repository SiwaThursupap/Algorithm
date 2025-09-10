import java.util.Scanner;

public class Grade {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in) ;
    System.out.print("Enter Your Midterm Score : ") ;
        int midterm = scanner.nextInt() ;
    System.out.print("Enter Your Final Scroe : ") ;
        int fiNal = scanner.nextInt() ;
        int sum = midterm + fiNal ;
            if (sum >= 50) {
                System.out.println("Your total score is " + sum + "."+"The result is Ture !!");
            }
            else {
                System.out.println("Your total score is " + sum + "."+"The result is Fail !!");
            }
        }
}
