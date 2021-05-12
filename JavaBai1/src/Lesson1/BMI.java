package Lesson1;
public class BMI {
    int weight = 52;
    double height = 1.60;
    public void calBMI(int weight, double height)
    {
        double bmi = weight/(height*height);
        System.out.println("Cân nặng: "+ weight);
        System.out.println("Chiều cao: "+ height);
        System.out.println("Vậy BMI của bạn là: "+bmi);
        System.out.printf("BMI làm tròn: %.2f\n",bmi);

        if(bmi<18.5)
            System.out.println("Oh, bạn hơi thiếu cân 1 tí, cần ăn nhiều hơn nhé");
        else if(bmi>= 18.5 && bmi <= 24.9)
            System.out.println("Chúc mừng bạn, thân hình quá lý tưởng!");
        else
            System.out.println("Oh, bạn đang thừa cân, cần chế độ ăn uống hợp lý hơn nhé");
    }
    public void calSwitchCase(int number)
    {
        switch (number)
        {
            case 1:
                System.out.println("một");
                //break;
            case 2:
                System.out.println("hai");
                //break;
            default:
                System.out.println("ko có số này");
                break;
        }
    }


}
