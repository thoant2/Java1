package Lesson2;
public class Calculator {
    // bài 2.2 giải phương trình bậc 2 có dạng ax2 + bx + c = 0 (a!0)
    public void calCalculation(int a, int b, int c)
    {
        double delta =b*b-4*a*c;
        double x1;
        double x2;

       if(delta > 0)
       {
            x1 = (-b+ Math.sqrt(delta))/2*a;
            x2 = (-b- Math.sqrt(delta))/2*a;
           System.out.println("Phương trình có 2 nghiệm: ");
           System.out.println("\nx1 = "+x1);
           System.out.println("\nx2 = "+x2);
       }
       else if(delta == 0)
       {
           x1 = -b/2*a;
           System.out.println("Phương trình có nghiệm kép x = "+ x1);
       }
       else
           System.out.println("Phương trình vô nghiêm!");
    }

    // bài 2.3 Nhập vào 3 số, kiểm tra xem 3 số  này có phải cạnh của 1 tam giác ko?
    // tổng 2 cạnh phải lớn hơn cạnh còn lại

    public void checkRectangle(int a, int b, int c)
    {
        if((a+b) > c && (a+c)> b && (c+b)>a)
            System.out.println("3 cạnh có độ dài "+ a+", "+b+", "+ c+" là các cạnh của 1 tam giác");
        else
            System.out.println("3 cạnh có độ dài "+ a+", "+b+", "+ c+" không phải là các cạnh của 1 tam giác");
    }


}
