package Lesson8;

import java.util.Scanner;

public class ArrayMutils {
    public void menu()
    {
        System.out.printf("\n ------------------------------");
        System.out.printf("\n Bài 1: Nhập mảng A vuông. Tìm phần tử đường chéo");
        System.out.printf("\n Bài 2: Nhập mảng B 1 chiều. Tìm phần tử là số nguyên tố.");
        System.out.printf("\n ------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n Bạn muốn xem bài nào? nhập vào đây:");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                Homework1();
                menu();
                break;
            case 2:
                Homework2();
                menu();
                break;
            default:
                System.out.printf("Không có bài nào hợp lệ với số bạn chọn, mời chọn lại");
                menu();
                break;
        }
    }
    public void MangDaChieu()
    {
        // Viết CT nhập 2 ma trận A, B, in ra màn hình
        // Thực hiện cộng 2 ma trận
        // Tìm ma trận chuyển vị của 2 ma trận đó

        System.out.printf("\n Nhập số phần tử matrix: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int matrixA[][]= new int [n][n];
        int matrixB[][]= new int [n][n];
        System.out.printf("\n Nhập ma trận A: ");
        matrixA = inputArray(n,n);
        System.out.printf("\n Nhập ma trận B: ");
        matrixB = inputArray(n,n);

        // in ra màn hình
        System.out.printf("\n Ma trận A vừa nhập là:\n ");
        showArray(matrixA,n,n);
        System.out.printf("\n Ma trận B vừa nhập là:\n ");
        showArray(matrixB, n,n);

        // Cộng 2 ma trận A, B
        System.out.printf("\n Ma trận A + Ma trận B:\n ");
        sumArray(matrixA,matrixB);

        // Chuyển vị ma trận A và B
        System.out.printf("\n Chuyển vị Ma trận A:\n ");
        chuyenViArray(matrixA);
        System.out.printf("\n Chuyển vị Ma trận B:\n ");
        chuyenViArray(matrixB);

    }
    static int[][] inputArray(int n, int m)
    {
        int matrix[][]= new int [n][m];
        int row;
        int col;
        Scanner scanner = new Scanner(System.in);
        // Nhập ma trận vuôn n  phần tử
        for (row = 0; row<n;row++)
        {
            for(col = 0; col<m; col ++) {
                System.out.printf("\n Phần tử [%s][%s] là: ", row, col);
                matrix[row][col] = scanner.nextInt();
            }
        }
        return matrix;
    }
    static void showArray(int[][] matrix, int n, int m)
    {
        int row;
        int col;
        // in ra màn hình

        for (row = 0; row<n;row++)
        {
            for(col = 0; col<m; col ++) {
                System.out.printf("\t %s ", matrix[row][col]);
            }
            System.out.printf("\n");
        }
    }
    static void sumArray(int[][] matrixA, int[][] matrixB)
    {
        int row;
        int col;
        for (row = 0; row<matrixA.length;row++)
        {
            for(col = 0; col<matrixA.length; col ++)
            {
                System.out.printf("\t%s", matrixA[row][col] + matrixB[row][col]);
            }
            System.out.printf("\n");
        }
    }
    static void chuyenViArray(int[][] matrix)
    {
        int row;
        int col;
        int temp = 0;
        int [][] newArray = new int[matrix.length][matrix.length];
        for (row = 0; row<matrix.length;row++)
        {
            for(col = 0; col<matrix.length; col ++)
            {
                newArray[row][col] = matrix[col][row];
                System.out.printf("\t%s", newArray[row][col]);
               /* temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
                System.out.printf("\t%s", matrix[row][col]);*/
            }
            System.out.printf("\n");
        }
    }
    public void ArrayBai2()
    {
        // Viet CT nhập vào mảng đa chiều, in ra màn hình
        // Tính tổng các phần tử chia hết cho 5 trong mảng
        System.out.printf("\n Nhập số row matrix: ");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        System.out.printf("\n Nhập số column matrix: ");
        int col = scanner.nextInt();
        int matrix[][]= new int [row][col];
       // Nhập ma trận
        System.out.printf("\n Nhập ma trận đa chiều");
        matrix = inputArray(row, col);
        // in ma trận
        System.out.printf("\n ----------------------");
        System.out.printf("\n In ma trận đa chiều:\n");
        showArray(matrix,row,col);
        System.out.printf("\n ----------------------");

        // tính tổng matrix %5
        int tong = 0;
        int index = 0;
        for(int i = 0; i<row; i++)
        {
            for(int j = 0; j<col; j++)
            {
                if(matrix[i][j]%5 ==0) {
                    tong = tong + matrix[i][j];
                    index++;
                }
            }
        }
        System.out.printf("\n Ma trận có %d phần tử chia hết cho 5", index);
        System.out.printf("\n Tổng các phần tử chia hết cho 5 là: %d", tong);
    }

    // Homework
    public void Homework1()
    {
        // Viết CT nhập vào 1 ma trận vuông A, in ra màn hình
        System.out.printf("\n Nhập số phần tử matrix: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int matrixA[][]= new int [n][n];

        System.out.printf("\n Nhập ma trận A: ");
        matrixA = inputArray(n,n);

        // in ra màn hình
        System.out.printf("\n Ma trận A vừa nhập là:\n ");
        showArray(matrixA,n,n);
        System.out.printf("\n ------------------------ ");
        // Liệt kê các phần tử trên đường chéo chính
        // Tính tổng các phần tử đường chéo
        int tong = 0;
        System.out.printf("\n Các phần tử đường chéo là:\n ");
        int i, j;
        int m = n;
        for(i = 0; i<n; i++)
        {
            System.out.printf("\t%d",matrixA[i][i]);
            tong= tong+matrixA[i][i];
            if(m==0)
            {
                System.out.printf("\t%d", matrixA[i][0]);
                tong = tong + matrixA[i][0];
                break;
            }
            m--;
            if(i!=m) {
                System.out.printf("\t%d", matrixA[i][m]);
                tong = tong + matrixA[i][m];
            }
        }
        System.out.printf("\n Tổng các phần tử đường chéo là: %d ",tong);
        System.out.printf("\n ------------------------ ");
        System.out.printf("\n Ma trận sx lại hàng 2 tăng dần là: \n");
        // sắp xếp hàng 2 trong mảng tăng dần
        int temp = 0;
        for(i = 0; i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(matrixA[1][i]>matrixA[1][j])
                {
                    temp = matrixA[1][i];
                    matrixA[1][i]=matrixA[1][j];
                    matrixA[1][j]= temp;
                }
            }
        }
        showArray(matrixA,n,n);

    }
    public  void Homework2()
    {
        // Viết CT nhập 1 mảng số nguyên 1 chiều gồm n phần tử
        System.out.printf("\n Nhập số phần tử ma trận: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int matrixB[]= new int [n];
        int i = 0;
        System.out.printf("\n Nhập ma trận B: ");

        for (i = 0; i<n;i++)
        {
            System.out.printf("\n Phần tử [%s] là: ", i);
            matrixB[i] = scanner.nextInt();
        }
        System.out.printf("\n ------------------------ ");
        System.out.printf("\n Ma trận B vừa nhập là:\n ");

        for (i = 0; i<n;i++)
        {
            System.out.printf("\t%d", matrixB[i]);
        }
        System.out.printf("\n ------------------------ ");
        System.out.printf("\n Các phần tử số nguyên tố là: ");
        // Liệt kê các phần tử là số nguyên tố, tính tổng các phần tử đó
        int tong = 0;
        int index = 0;
        for (i = 0; i<n;i++)
        {
            if(checksoNT(matrixB[i])) {
                System.out.printf("\t%d", matrixB[i]);
                index++;
                tong = tong + matrixB[i];
            }
        }
        if(index> 0)
            System.out.printf("\n Tổng các phần tử số nguyên tố là: %d",tong);
        else
            System.out.printf("\t không có");
        System.out.printf("\n ------------------------ ");
        // Nhập vị trí k và sửa phần tử tại vị trí đó
        System.out.printf("\n Vị trí muốn sửa là:");
        int k = scanner.nextInt();
        if(k<n-1)
        {
            System.out.printf("\n Sửa lại là:");
            matrixB[k]=scanner.nextInt();
            System.out.printf("\n Ma trận B vừa sửa là:\n ");
            for (i = 0; i<n;i++)
            {
                System.out.printf("\t%d", matrixB[i]);
            }
        }
        else
            System.out.printf("\n Không có vị trí này trong ma trận B");
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
}
