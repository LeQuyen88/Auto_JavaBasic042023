package BaiTap_JavaBasic3.ToanTu;

public class ToanTuBit {
    public static void main(String[] args) {
        int a=10;
        int b= 20;
        System.out.println((a>1)& (b<2));
        System.out.println((a>1) & (b>2));
        //tạo biến trung gian có kiểu dữ liệu tương ứng để lưu 1 phép toán
             // Toán tử AND
        boolean checkValue =(a>1)& (b<2);
        boolean checkValue1 = (a>1) & (b>2);
        System.out.println(checkValue);
        System.out.println(checkValue1);
        // Toán tử OR
        boolean checkValue3 = (a>1) || (b<2); // kết quả này vẫn ra true vì chỉ cần 1 trong 2 value có kết quả đùng
        boolean checkValue4 = (a>1) || (b>2);
        System.out.println(checkValue3);
        System.out.println(checkValue4);
        // ví dụ so sánh bằng
        String expectedText = "Selenium java"; // value cứng lấy từ file excel
        String actualText = "Selenium"; // value lấy bằng auto với selenium // driver.findElement(headerHomePage).gettext()
        System.out.println(expectedText == actualText);
        // ví dụ Toán tử và AND
        String expecetedColor = "#76589";
        String actualColor = "76589";
        System.out.println((expectedText==actualText) && (expecetedColor ==actualColor));

    }
}
