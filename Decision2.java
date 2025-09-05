import java.util.Scanner;

public class Decision2 {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input you number : ");
            int number = scanner.nextInt();
                if (number>0) { // if ต้องใช้ {} เพื่อบอกให้มันทำงานเมื่ออยู่ในเงื่อนไข
                    System.out.println("จำนวนเต็มบวก");
                }
                else { // else ต้องใช้ {} เพื่อบอกให้มันทำงานเมื่ออยู่ในเงื่อนไข
                    System.out.println("ไม่เป็นจำนวนเต็มบวก");
                }
        System.out.println("จบโปรแกรม");
    }
}
