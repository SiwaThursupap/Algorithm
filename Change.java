import java.util.Scanner;

public class Change{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Enter amount to pay : ") ;
            int price = scanner.nextInt() ;
        System.out.print("Enter quantity of Product : ");
            int quantity = scanner.nextInt() ;
            int sum = price * quantity ;
            if (sum > 1000) {
                System.out.println("Not enough money!!");
            }
            else {
                int change = 1000 - sum ;
                System.out.println("Change is : "+ change +" bhat");
                int fiveHundred = change / 500 ;
                System.out.println("Five-hundred note : "+ fiveHundred +" note (s)");
                change = change % 500 ; //บรรทัดนี้ไม่จำเป็นเขียน int เพราะเราประกาศไว้แล้วจากบรรทัดแรก
                int hundred = change / 100 ;
                System.out.println("Hundred note : "+ hundred +" note (s)");
                change = change % 100 ;
                int fifty = change / 50 ;
                System.out.println("Fifty note : "+ fifty +" note (s)");
                change = change % 50 ;
                int twenty = change / 20 ;
                System.out.println("twenty note : "+ twenty +" note (s)");
                change = change % 20 ;
                int tenCoin = change / 10 ;
                System.out.println("Ten Coin : "+ tenCoin +" coin (s)");
                change = change % 10 ;
                int fiveCoin = change / 5 ;
                System.out.println("Five Coin : "+ fiveCoin +" coin (s)");
                change = change % 5 ;
                int twoCoin = change / 2 ;
                System.out.println("Two Coin : "+ twoCoin +" coin(s)");
                change = change % 2 ;
                System.out.println("One Coin : "+ change +" coin(s)");
            }
    }
}