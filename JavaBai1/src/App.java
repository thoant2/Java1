import Lesson3.LoopExercise;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

import Lesson2.*;
import Lesson1.*;
import Lesson3.*;
import Lesson5.*;

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

/*
        // bài tập về nhà 2.1
        System.out.println("\nBài 2.1:");
        Month month = new Month();
        month.calDays(2, 2005);
        month.calDays(2, 2004);
        month.calDays(0, 2005);

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

 */

        LoopExercise loopExercise= new LoopExercise();
           // loopExercise.menu();

        lessonArray lessonArray = new lessonArray();
            //lessonArray.showArray();
            //lessonArray.inputArr();

            lessonArray.menu();



        // Bài tập về nhà 3.1 số nguyên tố
             //loopExercise.showSoNT();
        // Bài tập về nhà 3.2 số fibonacci
            //loopExercise.showFibonacci();
        // Bài tập 3.3 tính n!
            // loopExercise.calGiaiThua();
        // Bài tập 4.1
        // viết CT tạo 1 số random, Kiểm tra số đó có phải số nguyên tố hay ko
        // tính giai thừa của số đó
            //loopExercise.randomSoNT();
        // Bài tập 5
        // cho chuỗi "You only live once, but if you do it right, once is enough"
        // In ra màn hình index của tất cả ký tự 'o' trong chuỗi
            //loopExercise.indexChuoi();

        // Bài tập 6
        // Viêt CT in ra bảng cửu chương
            //loopExercise.showBangCuuChuong();

        // Bài tập 7
        // Viêt CT nhập vào 3 cạnh, kiểm tra 3 cạnh là tam giác, tam giac vuông, cân, đều?
            //loopExercise.checkTamGiac();

        // Bài tập 8
        // Nhập vào 1 chuỗi và đếm số từ của chuỗi đó
           //loopExercise.demTu();

        // Bài tập 9
        //Viêt CT thực hiện chuẩn hóa 1 xâu ký tự nhập từ bàn phím (loại bỏ dấu cách thừa, chuyển ký tự
        // đầu mỗi từ thành chữ hoa, các ký tự khác là chữ thường)
            //loopExercise.chuanHoaChuoi();
        // Bài tập 10
        // Viêt CT tính tổng các chữ số của 1 số nguyên bất kỳ. VD: 12345 tổng là 1+2+3+4+5
            //loopExercise.tongChuSo();

        // Bài tập 11
        // Viêt CT phân tích số nguyên thành các thừa số nguyên tố, vd 28 =2*2*7
            //loopExercise.tinhTSNT();
        // Bài tập 12
        // viết CT giải pt bậc nhất ax+b = 0
            //loopExercise.giaiPTBac1();
        // Bài tập 13
        // viết Ct nhập số nguyên n, tính tổng các số %3 từ 0 đến n
            //loopExercise.tongSoChiaHetCho3();
        // Bài tập 14
        // Viết CT nhập số bất kỳ, kiểm tra nó là nguyên âm hay nguyên dương
            //loopExercise.checkSoNguyen();
        // Bài tập 15
        // cho chuỗi "You only live once, but if you do it right, once is enough"
        //  Đếm số lần ký tự 'o' trong  xh chuỗi
           // loopExercise.demKyTu();
    }

}
