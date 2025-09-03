import java.util.Scanner;

public class Recipe {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter you Product #1 Name : ");
            String productName1 = scanner.nextLine();
        System.out.print("Enter you Product #1 Price : ");
            double productPrice1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter you Product #2 Name : ");
            String productName2 = scanner.nextLine();
        System.out.print("Enter you Product #2 Price : ");
            double productPrice2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter you Product #3 Name : ");
            String productName3 = scanner.nextLine();
        System.out.print("Enter you Product #3 Price : ");
            double productPrice3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter you Money : ");
            double money = scanner.nextDouble();
        double sum = productPrice1 + productPrice2 + productPrice3 ;
        double vat = sum*0.07 ;
        double net = sum + vat ;
        double change = money - net ;
        System.out.println("----- Recipe -----");
        System.out.println(productName1 + " : " + productPrice1 );
        System.out.println(productName2 + " : " + productPrice2 );
        System.out.println(productName3 + " : " + productPrice3 );
        System.out.println("Total Price before Tax : "+ sum);
        System.out.println("Net Price : "+ net);
        System.out.println("Total Paid : "+ money);
        System.out.println("Change : "+ change);
    }
}
