import java.util.Scanner;

public class fahrenheit {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter you Fahrenheit");
        double fahrenheit = scanner.nextDouble();
    double sum = fahrenheit - 32.0;
    double celsius = (5.0/9.0) * sum;
    System.out.println("Fahrenheit = " + celsius);
    }
}