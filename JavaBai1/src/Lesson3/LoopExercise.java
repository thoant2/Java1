package Lesson3;

import javax.swing.*;
import java.util.Scanner;

public class LoopExercise {
    public void menu()
    {
        System.out.printf("\n ------------------------------");
        System.out.printf("\n Bài 1: Liệt kê n số nguyên tố.");
        System.out.printf("\n Bài 2: Liệt kê n số Fibonacci.");
        System.out.printf("\n Bài 3: Tính n!");
        System.out.printf("\n Bài 4: Kiểm tra số nguyên tố random");
        System.out.printf("\n Bài 5: In ra màn hình index của tất cả ký tự 'o' trong chuỗi.");
        System.out.printf("\n Bài 6: In bảng cửu chương");
        System.out.printf("\n Bài 7: Kiểm tra các loại tam giác.");
        System.out.printf("\n Bài 8: Đếm từ trong chuỗi");
        System.out.printf("\n Bài 9: Chuẩn hóa xâu ký tự.");
        System.out.printf("\n Bài 10: Tổng chữ số trong số nguyên bất kỳ.");
        System.out.printf("\n Bài 11: Phân tích số nguyên thành các thừa số nguyên tố");
        System.out.printf("\n Bài 12: Giải phương trình bậc nhất ax+b = 0");
        System.out.printf("\n Bài 13: Tính tổng các số chia hết cho 3");
        System.out.printf("\n Bài 14: Kiểm tra số nguyên âm/ nguyên dương");
        System.out.printf("\n Bài 15: Đếm số lần ký tự '0' xuất hiện trong chuỗi");
        System.out.printf("\n ------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n Bạn muốn xem bài nào? nhập vào đây:");
        int number = scanner.nextInt();
        switch (number)
        {
            case 1:
                showSoNT();menu();
                break;
            case 2:
                showFibonacci();menu();
                break;
            case 3:
                calGiaiThua();menu();
                break;
            case 4:
                randomSoNT();menu();
                break;
            case 5:
                indexChuoi();menu();
                break;
            case 6:
                showBangCuuChuong();menu();
                break;
            case 7:
                checkTamGiac();menu();
                break;
            case 8:
                demTu();menu();
                break;
            case 9:
                chuanHoaChuoi();menu();
                break;
            case 10:
                tongChuSo();menu();
                break;
            case 11:
                tinhTSNT();menu();
                break;
            case 12:
                giaiPTBac1();menu();
                break;
            case 13:
                tongSoChiaHetCho3();menu();
                break;
            case 14:
                checkSoNguyen();menu();
                break;
            case 15:
                demKyTu();menu();
                break;
            default:
                System.out.printf("Không có bài nào hợp lệ với số bạn chọn, mời chọn lại");
                menu();
        }


    }
    // bài tập về nhà 3.1 Viết CT thực hiện
    // Liệt kê n số nguyên tố đầu tiên
    // Liệt kê các số nguyên tố < 100
    public void showSoNT(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Bài 1: Nhập 1 số bất kỳ: ");
        int n = scanner.nextInt();
        int i =0;
        int count = 1;
        System.out.printf("\n%s số nguyên tố đầu tiên là:  ", n);
        System.out.printf("\nCách 1 while:\n ");
        while (count<=n)
        {
            if(checksoNT(i) == true ) {
                System.out.printf("\t%s", i);
                count++;
            }
            i++;
        }

        System.out.printf("\nCách 2 do while:\n ");
        i=0;
        count = 1;
        do{
            if(checksoNT(i) == true) {
                System.out.printf("\t%s", i);
                count++;
            }
            i++;
        }
        while(count<=n);

        System.out.printf("\nCách 3 for:\n ");
        count = 1;
        for(i = 0; count <=n; i++)
        {
            if(checksoNT(i) == true) {
                System.out.printf("\t%s", i);
                count++;
            }
        }

        System.out.printf("\n Dãy số nguyên tố < 100 là: ");
        for( i = 0;i<=100;i++)
        {
            if(checksoNT(i)==true)
                System.out.printf("\t%s", i);
        }

    }

    static boolean checksoNT(int number)
    {
        if(number<2)
            return false;
        for(int i=2; i<= Math.sqrt(number);i++)
        {
            if(number%i == 0)
                return false;
        }
        return true;

    }
    // bài tập 3.2
    // Liệt kê n số fibonacci đầu tiên
    // Liệt kế các số fibonacci < 100
    public void showFibonacci()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nBài 2: Nhập 1 số bất kỳ: ");
        int n = scanner.nextInt();
        int i =0;
        System.out.printf("\n%s số fibonacci đầu tiên là:  ", n);
        System.out.printf("\nCách 1 while:\n ");
        while(i<n){
            System.out.printf("\t%s",inFibonacci(i));
            i++;
        }

        System.out.printf("\nCách 2 do while:\n ");
        i=0;
        do
        {
            System.out.printf("\t%s",inFibonacci(i));
            i++;
        }
        while (i<n);

        System.out.printf("\nCách 3 for:\n ");
        for(i=0;i<n;i++)
        {
            System.out.printf("\t%s",inFibonacci(i));

        }

        System.out.printf("\n Dãy số fibonacci < 100 là: ");

        for( i = 0;i<=100;i++)
        {
            if(inFibonacci(i) <= 100)
                System.out.printf("\t%s", inFibonacci(i));
        }

    }
    // tính số fibonacci thứ n
    static int inFibonacci(int n)
    {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if(n< 0)
            return -1;
        else if(n==0 || n==1)
            return n;
        else
        {
            for (int i = 2; i<n; i++)
            {
                f0 =f1;
                f1 = fn;
                fn=f0+f1;
            }
        }
        return fn;

    }
    // Bài tập 3.3
    // Tính chương trình tính n! với n nhập từ bàn phím
    public void calGiaiThua()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nBài 3.3: Nhập 1 số bất kỳ: ");
        int n = scanner.nextInt();
        int i = 1;
        long giaithua = 1;
        System.out.printf("\n Cách 1 vòng for: ");
        for(i=1; i<=n;i++)
        {
            giaithua=giaithua*i;
        }
        System.out.printf("\nPhép tính giai thừa %s! là: %s",n,giaithua);

        giaithua=1;
        i=1;
        System.out.printf("\n Cách 2 vòng while: ");
        while (i<=n)
        {
            giaithua=giaithua*i;
            i++;
        }
        System.out.printf("\nPhép tính giai thừa %s! là: %s",n,giaithua);


        giaithua=1;
        i=1;
        System.out.printf("\n Cách 3 vòng do while: ");

        do
        {
            giaithua=giaithua*i;
            i++;
        }
        while (i<=n);

        System.out.printf("\nPhép tính giai thừa %s! là: %s",n,giaithua);
    }

    // Bài tập 4.1
    // viết CT tạo 1 số random
    // Kiểm tra số đó có phải số nguyên tố hay ko // tính giai thừa của số đó
    public void randomSoNT()
    {
        double doubleNumber = Math.random();
        doubleNumber = doubleNumber*10+1;
        int number = (int)doubleNumber;
        System.out.printf("\n Bài tập số 4: random");
        System.out.printf("\nSố random từ 1-> 100 là %s", number);
        if(checksoNT(number))
            System.out.printf("\n%s là số nguyên tố ", number);
        else
            System.out.printf("\n%s không phải là số nguyên tố", number);
        int giaithua=1;
        for (int i = 1; i<=number; i++)
        {
            giaithua=giaithua*i;
        }
        System.out.printf("\nPhép tính %s! là: %s ",number, giaithua);
    }

    // Bài tập 5
    // cho chuỗi "You only live once, but if you do it right, once is enough"
    // In ra màn hình index của tất cả ký tự 'o' trong chuỗi
    public  void indexChuoi()
    {
        System.out.printf("\n Bài tập 5 index chuỗi:");
        String str = "You only live once, but if you do it right, once is enough";
        System.out.printf("\n%s", str);
        //int countStr = str.compareToIgnoreCase("o");
        //System.out.printf("\n Tổng ký tự 'o' là %s",countStr);
        System.out.println("\n Index của ký tự 'o' là:");
        int count = 0;
        for(int i= 0; i<str.length();i++)
        {
            if(str.charAt(i) == 'o'){
                System.out.print(i+"\t");
                count++;
            }
        }
        System.out.println("\nSố lần ký tự o xuất hiện: "+count);
    }

    // Bài tập 6
    // Viêt CT in ra bảng cửu chương
    public  void showBangCuuChuong()
    {
        System.out.printf("\n Bài tập 6 in bảng cửu chương:\n");
        for(int row = 1; row<=10;row++)
        {
            for(int col =1; col<=10;col++)
            {
                System.out.printf("\t%s x %s = %s", row,col,row*col);
            }
            System.out.printf("\n");
        }
    }

    // Bài tập 7
    // Viêt CT nhập vào 3 cạnh, kiểm tra 3 cạnh là tam giác, tam giac vuông, cân, đều?
    public void checkTamGiac()
    {
        System.out.printf("\n Bài tập 7 check loại tam giác:");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n Nhập cạnh thứ 1: ");
        int number1 = scanner.nextInt();
        System.out.printf("\n Nhập cạnh thứ 2: ");
        int number2 = scanner.nextInt();
        System.out.printf("\n Nhập cạnh thứ 3: ");
        int number3 = scanner.nextInt();

        if(number1 == 0 || number2 == 0 || number3== 0)
            System.out.printf("Đây không phải là tam giác");
        else {
            if (number1 == number2 && number2 == number3)
                System.out.printf("\n Đây là tam giác đều.");
            else {
                if (number1 + number2 > number3 && number2 + number3 > number1 && number1 + number3 > number2) {
                    if ((number1 == number2) || (number2 == number3 || (number3 == number1)))
                        System.out.printf("\n Đây là tam giác cân.");
                    else if (number1 == Math.sqrt(number2 * number2 + number3 * number3) || number2 == Math.sqrt(number1 * number1 + number3 * number3) || number3 == Math.sqrt(number1 * number1 + number2 * number2))
                        System.out.printf("\n Đây là tam giác vuông");
                } else
                    System.out.printf("Đây không phải là tam giác");
            }
        }
    }

    // Bài tập 8
    // Nhập vào 1 chuỗi và đếm số từ của chuỗi đó
    public void demTu()
    {
        System.out.printf("\nBài tập 8 đếm từ trong chuỗi:");
        System.out.printf("\nNhập chuỗi: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.trim();
        int count = 0;
        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ' && str.charAt(i+1)!= ' ')
                count++;
        }
        System.out.printf("\nSố từ trong chuỗi trên là: %s", count +1);
    }

    // Bài tập 9
    //Viêt CT thực hiện chuẩn hóa 1 xâu ký tự nhập từ bàn phím (loại bỏ dấu cách thừa, chuyển ký tự
    // đầu mỗi từ thành chữ hoa, các ký tự khác là chữ thường)
    public  void chuanHoaChuoi()
    {
        System.out.printf("\nBài tập 9 chuẩn hóa xâu ký tự:");
        System.out.printf("\nNhập chuỗi: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.printf("\nChuỗi sau khi chuẩn hóa là: %s", validString(str));
    }
    public String validString(String str)
    {
        str = str.trim().toLowerCase();
        str = str.replaceAll("\\s+"," ");
        String[] arrString = str.split(" ");
        String newStr ="";

        for(int i = 0; i<arrString.length; i++)
        {
           newStr= newStr + String.valueOf(arrString[i].charAt(0)).toUpperCase() +arrString[i].substring(1) +" ";

        }
        return newStr.trim();
    }

    // Bài tập 10
    // Viêt CT tính tổng các chữ số của 1 số nguyên bất kỳ. VD: 12345 tổng là 1+2+3+4+
    public void tongChuSo()
    {
        System.out.printf("\nBài tập 10: tính tổng chữ số của 1 số nguyên:");
        System.out.printf("\nNhập số nguyên bất kỳ: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String str = String.valueOf(a);
        int tong = 0;
        for (int i = 0; i<str.length(); i++)
        {
            tong = tong + Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.printf("\nTổng các chữ số của %s là: %s",a,tong);


    }

    // Bài tập 11
    // Viêt CT phân tích số nguyên thành các thừa số nguyên tố, vd 28 =2*2*7
    public void tinhTSNT()
    {
        System.out.printf("\nBài tập 11: Phân tích số nguyên thành tích thừa số nguyên tố");
        System.out.printf("\nNhập số nguyên bất kỳ: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number1 = number;
        String thuaso ="";
        for(int i = 1;i<=number;i++)
        {
            if(checksoNT(i) && number%i== 0)
            {
                number = number/i;
                thuaso=thuaso+"*"+i;
                i=1;
            }
        }
        System.out.printf("\nTích thừa số nguyên tố của %s là: %s", number1,thuaso.substring(1));
    }

    // Bài tập 12
    // viết CT giải pt bậc nhất ax+b = 0
    public void giaiPTBac1()
    {
        System.out.printf("\nBài tập 12: Giải phương trình bậc nhất ax + b = 0");
        System.out.printf("\nNhập số a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.printf("\nNhập số b: ");
        int b = scanner.nextInt();
        if(a == 0)
            System.out.printf("\nPhương trình vô nghiệm.");
        else {
            if (b == 0)
                System.out.printf("\nPhương trình có vô số nghiệm");
            else {
                double x = -b/a;
                System.out.printf("\nPhương tình có nghiệm x = %2f", x);
            }
        }
    }
    // Bài tập 13
    // viết Ct nhập số nguyên n, tính tổng các số %3 từ 0 đến n
    public void tongSoChiaHetCho3()
    {
        System.out.printf("\nBài tập 13: Tính tổng các số chia hết cho 3 từ 0 đến n");
        System.out.printf("\nNhập số n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tong = 0;
        for(int i = 0; i<=n; i++)
        {
            if(i%3== 0)
            {
                tong = tong+i;
            }
        }
        System.out.printf("\nTổng các số chia hết cho 3 từ 0 đến %s là %s", n, tong);
    }
    // Bài tập 14
    // Viết CT nhập số bất kỳ, kiểm tra nó là nguyên âm hay nguyên dương
    public void checkSoNguyen()
    {
        System.out.printf("\nBài tập 14: Kiểm tra số nguyên âm hay dương");
        System.out.printf("\nNhập số n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n > 0)
            System.out.printf("\nĐây là số nguyên dương");
        else if(n<0)
            System.out.printf("\nĐây là só nguyên âm");
        else
            System.out.printf("\nĐây không phải số nguyên âm, không phải số nguyên dương");
    }
    // Bài tập 15
    // cho chuỗi "You only live once, but if you do it right, once is enough"
    //  Đếm số lần ký tự 'o' trong  xh chuỗi
    public  void demKyTu()
    {
        System.out.printf("\n Bài tập 15: đếm ký tự");
        String str = "You only live once, but if you do it right, once is enough";
        System.out.printf("\n%s", str);
        int count = 0;
        for(int i= 0; i<str.length();i++)
        {
            if(str.charAt(i) == 'o'){
                count++;
            }
        }
        System.out.println("\nSố lần ký tự o xuất hiện: "+count);
    }
}
