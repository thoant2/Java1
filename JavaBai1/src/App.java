import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import Lesson2.*;
import Lesson1.*;

public class App {
    int a = 5;

    public static void main(String[] args) throws Exception {
       

        // Khai báo 1 object class app để gọi phương thức trong đối tượng
        //App app_object = new App();
        //app_object.show();

        // gọi phương thức static - ko cần khai báo đối tượng
        //show_static();

        // gọi lớp Calculator - function sum()
        /*Calculator calc = new Calculator();
        calc.sum();
        System.out.println("Chia b/a = "+ calc.chia());*/

/*
        String str1 ="   Xin chào Tôi    ";
        String str2 = str1.toUpperCase();
        System.out.println("Chuỗi đã uppercase: "+str1.toUpperCase());
        System.out.println("Chuỗi đã lowercase: "+str1.toLowerCase());
        System.out.println("Kích thước chuỗi = "+ str1.length());
        System.out.println("Kích thước chuỗi khi trim() = "+ str1.trim().length());
        System.out.println("str1 = "+ str1);
        System.out.println("str2 = "+ str2);
        System.out.println("so sánh tuyệt đối str1 và str2: "+str1.equals(str2));
        System.out.println("So sánh tương đối str1 và str2: "+str1.equalsIgnoreCase(str2));
        System.out.println(str1==str2);

        String strTen ="nguyễn thị thoa";
        System.out.println("Tên đã upper: "+strTen.toUpperCase());
        System.out.println("Kích thước tên = "+strTen.length());
        System.out.println("Vị trí của chữ T: "+strTen.indexOf("T"));
        System.out.println("Vị trí của chữ t: "+strTen.indexOf("t"));
        System.out.println("Vị trí ký tự thứ 7: "+ strTen.charAt(7));
        System.out.println("Thay thế space = - là: "+ strTen.toUpperCase().replace(" ", "-") );
        System.out.println("Sub string tên: "+ strTen.substring(11));
        System.out.println("Vị trí của chữ T thứ 2: "+ strTen.indexOf("t", 8));
        System.out.println("Tên Thoa: "+ strTen.substring(strTen.indexOf("t", 8)));
        System.out.println("Số lượng ký tự t: "+ strTen.compareToIgnoreCase("t"));
*/

        // bài tập tính BMI

        /*BMI bmi = new BMI();
        System.out.println("1. Check BMI của Zozo: ");
        bmi.calBMI(35,1.4);
        System.out.println("\n2. Check BMI của Thoa: ");
        bmi.calBMI(52,1.60);
        System.out.println("\n3. Check BMI của Diên: ");
        bmi.calBMI(66,1.65);
*/
        // bài tập switch case
        //bmi.calSwitchCase(1);

        // bài tập về nhà 1.1
       /*
        System.out.println("1: Tính chu vi và diện tích hình chữ nhật");
        Rectangle rec = new Rectangle();
        int a = 15;
        int b = 7; 
        int p1 = rec.show_perimeter_Rec(a, b);
        int s1 = rec.show_superficies_Rec(a, b);
        System.out.println("Chiều dài a = "+ a +" cm");
        System.out.println("Chiều rộng b = "+ b+" cm");
        System.out.println("Chu vi hcn = "+p1+" cm");
        System.out.println("Diện tích hcn = "+s1+" cm2");

     
        // bài tập về nhà 1.2
       
        System.out.println();
        System.out.println("2: Tính chu vi và diện tích hình tròn");
        Circle cir = new Circle();
        int r = 8;
        double p2 = cir.show_perimeter_Cir(r);
        double s2 = cir.show_superficies_Cir(r);
        System.out.println("Bán kính r = "+ r +" cm");       
        System.out.println("Chu vi ht = "+p2+" cm");
        System.out.println("Diện tích ht = "+s2+" cm2");
        */


        // bài tập về nhà 2.1
        System.out.println("\nBài 2.1:");
        Month month = new Month();
        month.calDays(2, 2005);
        month.calDays(2, 2004);
        month.calDays(11, 2005);

        // bài tập về nhà 2.2 giải phương trình
        System.out.println("\nBài 2.2:");
        Calculator cal = new Calculator();
        int a = 2;
        int b = 3;
        int c = 1;
        System.out.println("Tìm nghiệm của phương  trình bậc 2: "+ a+"x2 + "+b+"x + "+c+" = 0");
        cal.calCalculation(a,b,c);

        // bài tập về nhà 2.3 check 3 cạnh của tam giác
        System.out.println("\nBài 2.3:");
        cal.checkRectangle(a,b,c);
    }
   
}
