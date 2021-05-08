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
        rec.show_perimeter_Rec();
        rec.show_superficies_Rec();
        // bài tập về nhà 1.2
        System.out.println();
        System.out.println("2: Tính chu vi và diện tích hình tròn");
        Circle cir = new Circle();
        cir.show_perimeter_Cir();
        cir.show_superficies_Cir();

        
    }
    void show()
    {
        float b = 2.5f;
        boolean c = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static void show_static()
    {
        char d = 'a';
        String c = "phương thức static";
        System.out.println(c);
    }
}
