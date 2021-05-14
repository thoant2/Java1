package Lesson3;

import java.util.Scanner;

public class LoopExercise {
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
}
