import java.util.Scanner;

public class gradeCal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter You Name : ");
        String name = scanner.nextLine();
        System.out.print("Enter You Score : ");
        int score = scanner.nextInt();
        System.out.println("Name : "+ name);
        System.out.println("Score : "+ score);
        if (score >= 80) {
            System.out.println("Grade : A ");
        }
        else if (score >= 70) {
            System.out.println("Grade : B ");
        }
        else if (score >= 60) {
            System.out.println("Grade : C ");
        }
        else if (score >= 50) {
            System.out.println("Grade : D ");
        }
        else {
            System.out.println("Grade : E ");
        }
    }
}
