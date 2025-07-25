import java.util.Scanner;
public class Average { //หลัง clss = ชื่อไฟล์//
     public static void main (String[]args){ //ตรงนี้จะขึ้นเสมอถ้าใช้นามสกุลไฟล์ถูก//
      Scanner scanner = new Scanner(System.in);//Scanner ตัวนี้จะใช้ก็ต่อเมื่อต้องการพิมพ์//
      System.out.print("Enter you number1\n");
      int num1 = scanner.nextInt(); //scanner.nextInt() = ตัวเก็บข้อมูลแปลงเป็นตัวแปร//
      System.out.print("Enter you number2\n");
      int num2 = scanner.nextInt();
      System.out.print("Enter you number3\n");
      int num3 = scanner.nextInt();
      System.out.print("Enter you number4\n");
      int num4 = scanner.nextInt();
      System.out.print("Enter you number5\n");
      int num5 = scanner.nextInt();
      int sum = (num1+num2+num3+num4+num5)/5;
      System.out.print("Average = "+sum);

    }
}
// save ไฟล์ก่อน compile ทุกครั้ง
// javac ชื่อไฟล์.java = ใช้สำหรับ compile
// java ชื่อไฟล์ = ใช้สำหรับ run (ไม่ต้องมีสกุลไฟล์)