package BaiTap_JavaBasic2;

public class TinhTong_TinhTich {
    public static long tinhTong2SoNguyen(long number1, long number2) {
        return (number1 + number2);

    }
    public static double tinhTich2SoThuc(double number3, double number4){
        return (number3 * number4);
    }

    public static void main(String[] args) {
        System.out.println("Tạo hàm tính tổng 2 số nguyên: " + tinhTong2SoNguyen(50, 90));
        System.out.println("Tạo hàm tính tích 2 số thực: " + tinhTich2SoThuc(60,20));
    }
}
