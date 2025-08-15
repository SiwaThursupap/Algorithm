import java.util.Scanner;

public class BodySurfaceArea{
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter You width of body");
        float width = scanner.nextFloat();
    System.out.println("Enter You length of body");
        float length = scanner.nextFloat();
        float area = (width*length)/360 ;
    System.out.println("Body surface area = "+area);
    }
}