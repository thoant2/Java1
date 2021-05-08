public class Circle {
    int r = 8;
    void show_perimeter_Cir()
    {
        double c = 2*r*3.14;
        System.out.println("Bán kính r = "+ r +" cm");       
        System.out.println("Chu vi ht = "+c+" cm");
    }
    void show_superficies_Cir()
    {
        double s= r*r*3.14;
        System.out.println("Diện tích ht = "+s+" cm2");
    }
}
