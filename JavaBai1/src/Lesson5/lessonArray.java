package Lesson5;

import java.util.Scanner;

public class lessonArray {
    public void menu()
    {
        System.out.printf("\n ------------------------------");
        System.out.printf("\n Bài 1: Nhập mảng số nguyên.");
        System.out.printf("\n Bài 2: Nhập mảng chuỗi.");
        System.out.printf("\n ------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n Bạn muốn xem bài nào? nhập vào đây:");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                bai1();
                menu();
                break;
            case 2:
                bai2();
                menu();
                break;
            default:
                System.out.printf("Không có bài nào hợp lệ với số bạn chọn, mời chọn lại");
                menu();
                break;
        }
    }
    // Tạo mảng gồm n phần tử từ bàn phím
    // Nhập phần tử cho mảng, in ra màn hình
    // Tìm phần tử lớn nhất và index
    // Tìm phần tử nhỏ nhất và index
    public void bai1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n Nhập số phần tử mảng số nguyên là: ");
        int number = scanner.nextInt();
        int intArray[] = new int[number];
        int i = 0;
        for (i = 0; i<intArray.length; i++)
        {
            System.out.printf("\n Nhập phần tử thứ %s: ",i);
            intArray[i] = scanner.nextInt();
        }
        System.out.printf("\n Mảng vừa nhập là: ");
        int indexmax = 0;
        int indexmin = 0;
        int max = intArray[0];
        int min = intArray[0];
        for (i = 0; i< intArray.length; i++)
        {
            System.out.printf("\t %s", intArray[i]);
            if(intArray[i]>max) {
                max = intArray[i];
                indexmax = i;
            }
           if(min>intArray[i] )
            {
                min = intArray[i];
                indexmin = i;
            }
        }
        int max2 = intArray[0];
        int indexmax2 = 0;
        for (i = 0; i< intArray.length; i++)
        {
            if (i != indexmax && intArray[i] > max2) {
                max2 = intArray[i];
                indexmax2 = i;
            }
        }
        System.out.printf("\n Phần tử index thứ %s là lớn nhất: %s", indexmax, max);
        System.out.printf("\n Phần tử index thứ %s là lớn thứ hai: %s", indexmax2, max2);
        System.out.printf("\n Phần tử index thứ %s là bé nhất: %s", indexmin, min);
    }

    // Tạo mảng chuỗi n phần tử từ bàn phím
    // in thông tin ra màn hình
    // Đếm số lần "java" xuất hiện trong mảng
    // Nhập vào từ bàn phím chuỗi bất kỳ, kiểm tra chuỗi đó ở vị trí nào của mảng
    public void bai2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n Nhập số phần tử mảng chuỗi là: ");
        int number = scanner.nextInt();
        String strArray[] = new String[number];
        int i = 0;
        for (i = 0; i<strArray.length; i++)
        {
            System.out.printf("\n Nhập phần tử thứ %s: ",i);
            strArray[i] = scanner.next();
        }
        System.out.printf("\n Mảng vừa nhập là: ");
        int index = 0;
        String strChuoi = "";
        for (i = 0; i<strArray.length; i++)
        {
            System.out.printf("%s ",strArray[i]);
            strChuoi =strChuoi+strArray[i];
            if(strArray[i].equals("Java"))
                index++;
        }
        if(index> 0)
            System.out.printf("\n Số lần từ 'Java' lặp trong mảng là: %s", index);
        else
            System.out.printf("\n Không có từ 'Java' trong mảng");

        System.out.printf("\n Nhập chuỗi bất kỳ: ");
        String str = scanner.next();

        if(strChuoi.contains(str)) {
            System.out.printf("\n Chuỗi vừa nhập nằm ở vị trí trong mảng là: ");
            for (i = 0; i < strArray.length; i++) {
                if (strArray[i].equals(str)) {
                    System.out.printf("\t %s", i);

                }
            }
        }
        else
            System.out.printf("\n Chuỗi vừa nhập không có trong mảng.");

    }

    public void showArray()
    {
        String strArray[] = new String[5];
        String strArray1[] = {"Một", "Hai", "Ba"};
        Float floatArr[] = {1.1f, 2.5f, 3.2f, 4.55f, 6.66f};
        floatArr[0] = 1.2f;

        for(int i=0; i<floatArr.length; i++)
        {
            System.out.printf("\n Phần thử thứ %d: %.2f", i, floatArr[i]);
        }
    }
    public void inputArr()
    {
        //Scanner scanner = new Scanner(System.in);
        System.out.printf("\n Nhập số phần tử mảng là: {1, 2, 4}");
        //int number = scanner.nextInt();
        int intArray[] = {1, 2, 4};
        int i = 0;
        /*for (i = 0; i<intArray.length; i++)
        {
            System.out.printf("\n Nhập phần tử thứ %s: ",i);
            intArray[i] = scanner.nextInt();
        }
        System.out.printf("\n Mảng vừa nhập là: ");
        int tong = 0;

        for (i = 0; i< intArray.length; i++)
        {
            System.out.printf("\n Phần thử thứ %s là: %s", i, intArray[i]);
            tong = tong + intArray[i];
        }
        System.out.printf("\n Phần tử index 2 là: %s", intArray[2]);
        System.out.printf("\n Tổng các phần tử của mảng là: %s", tong);
        int tongChan = 0;
        System.out.printf("\n Các số chẵn là: ");
        for (i=0; i< intArray.length; i++)
        {
            if(intArray[i]%2 == 0)
            {
                tongChan = tongChan+ intArray[i];
                System.out.printf("\t%s", intArray[i]);
            }
        }
        System.out.printf("\n Tổng các số chẵn là %s", tongChan);

        // Sắp xếp mảng theo thứ tự tăng dần
        System.out.printf("\n Sắp xếp mảng tăng dần: ");
        int temp = 0;*/
       /* for(i = 0; i<intArray.length; i++)
        {
            if(i+1 != intArray.length) {
                if (intArray[i] > intArray[i + 1] ) {
                    temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = temp;
                    i = 0;
                }
                else
                    System.out.printf("\t %s", intArray[i]);
            }
            *//*else
                if(i+1 == intArray.length)
                {
                    if (intArray[0] > intArray[i] ) {
                        temp = intArray[0];
                        intArray[0] = intArray[i];
                        intArray[i] = temp;
                    }
                }*//*
           *//* for( int j = i+1; j< intArray.length; j++)
            {
                if(intArray[i]>intArray[j])
                {
                    temp = intArray[i];
                    intArray[i]= intArray[j];
                    intArray[j] = temp;
                }
            }*//*

        }*/
        int temp = 0;
        System.out.printf("\n Sắp xếp mảng giảm dần: ");
        for(i = 0; i<intArray.length; i++)
        {
            if(i+1 < intArray.length) {
                if (intArray[i] < intArray[i + 1] ) {

                    temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = temp;
                    i = 0;

                    System.out.printf("\t %s, %s", i,intArray[i]);
                }

            }

        }
        // Sắp xếp mảng theo thứ tự giảm dần
      /*  System.out.printf("\n Sắp xếp mảng giảm dần: ");
        temp = 0;
        for(i = 0; i<intArray.length; i++)
        {
            for( int j = i+1; j< intArray.length; j++)
            {
                if(intArray[i]<intArray[j])
                {
                    temp = intArray[i];
                    intArray[i]= intArray[j];
                    intArray[j] = temp;
                }
            }
            System.out.printf("\t %s", intArray[i]);
        }*/
    }
}
