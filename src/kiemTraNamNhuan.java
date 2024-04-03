import java.util.Scanner;

public class kiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(" Năm nhuận ok ");
        } else {
            System.out.println(" Năm không nhuận ");
        }
    }
}
//        Scanner ip = new Scanner(System.in);
//        int year;
//        System.out.println("Nhập số năm cần kiểm tra");
//        year = ip.nextInt();
//        boolean isLeapYear = false;
//        boolean isBy4 = year % 4 == 0;
//        if(isBy4) {
//            boolean isBy100 = year % 100 == 0;
//            if (isBy100) {
//                boolean isBy400 = year % 400 == 0;
//                if (isBy400) {
//                    isLeapYear = true;
//                }
//            }
//            else {
//                isLeapYear = true;
//            }
//        }
//        if (isLeapYear) {
//            System.out.println( year + " là năm nhuận");
//        }
//        else {
//            System.out.println(year + " không phải là năm nhuận ");
//        }
//
//
//    }
//}
