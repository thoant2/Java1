package Lesson2;
public class Month {
    // Nhập vào tháng bất kỳ, in ra màn hình thông tin tháng đó có bao nhiêu ngày
    public void calDays(int month, int year)
    {
        switch (month)
        {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Tháng "+ month+" năm "+ year +" có 31 ngày");
                break;
            case 4, 6, 9, 11:
                System.out.println("Tháng "+month +" năm "+ year +" có 30 ngày");
                break;
            default:
            {
                if(year %4==0)
                    System.out.println("Tháng "+ month +" năm "+ year +" có 29 ngày");
                else
                    System.out.println("Tháng "+ month +" năm "+ year +" có 28 ngày");
                break;
            }
        }
    }
}
