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
        

        // bài tập về nhà 1.1
       
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
        
    }
   
}
