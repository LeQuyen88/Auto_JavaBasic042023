package BaiTap_JavaBasic3.ToanTu;

public class ToanTuDieuKien {
    public static void main(String[] args) {
        int a = 20;
        int b = 3;
        String s = (a % b == 0) ? "a chia hết cho b" : "a không chia hết cho b";
        System.out.println(s);

        String expectedText = "Selenium java"; // value cứng lấy từ file excel
        String actualText = "Selenium"; // value lấy bằng auto với selenium // driver.findElement(headerHomePage).gettext()
        String s1 = (expectedText == actualText) ? "test case Pass" : "test case fail";
        System.out.println(s1);
        // ví dụ khai báo biến và gán gia trị đồng loạt
        int a1,a2,a3;
        a1=a2=a3 = 30;

    }
}
