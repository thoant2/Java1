public class Rectangle {
    int a = 15;
    int b = 7;
    void show_perimeter_Rec()
    {
        int c = (a+b)*2;
        System.out.println("Chiều dài a = "+ a +" cm");
        System.out.println("Chiều rộng b = "+ b+" cm");
        System.out.println("Chu vi hcn = "+c+" cm");
    }
    void show_superficies_Rec()
    {
        int s= a*b;
        System.out.println("Diện tích hcn = "+s+" cm2");
    }
}
