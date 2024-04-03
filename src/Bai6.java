import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhập tháng bạn muốn biết số ngày");
        int month = ip.nextInt();
        String daysInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày " );
                break;
            case 4:
            case 6:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày ");
                break;
            case 2:
                if (month == 2) {
                    System.out.println(" vui lòng nhập số năm ");
                    int year = ip.nextInt();
                    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        System.out.println(" Tháng 2 có 29 ngày ( năm nhuận )");
                    }
                    else {
                        System.out.println(" Tháng 2 có 28 ngày");
                    }
                }
                break;
            default:
                System.out.println(" Không có tháng này trong năm vui lòng nhập lại tháng của bạn");
        }
    }
    }



