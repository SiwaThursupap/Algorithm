import java.util.Scanner;
public class Areaofcircle { //หลัง clss = ชื่อไฟล์//
     public static void main (String[]args){ //ตรงนี้จะขึ้นเสมอถ้าใช้นามสกุลไฟล์ถูก//
      Scanner scanner = new Scanner(System.in);//Scanner ตัวนี้จะใช้ก็ต่อเมื่อต้องการพิมพ์//
      System.out.print("Enter you radius\n");
      int radius = scanner.nextInt(); //scanner.nextInt() = ตัวเก็บข้อมูลแปลงเป็นตัวแปร//
      double sum = 3.14*(radius*radius);
      System.out.println("Area Of Circle = "+sum);

    }
}
// javac ชื่อไฟล์.java = ใช้สำหรับ compile//
// java ชื่อไฟล์ = ใช้สำหรับ run (ไม่ต้องมีสกุลไฟล์)