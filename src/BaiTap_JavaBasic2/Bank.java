package BaiTap_JavaBasic2;

public class Bank {
    static int VAT = 12;
    static  float INTEREST_Rate = 7.5F;
    static String bankName1 = "TPbank";
    static String PHONE = "0123456789";
    static String ADDRESS = "Hà Nội";
    public static void getBankInfo(){
        System.out.println("Tên Ngân Hàng: "+bankName1);
        System.out.println("Địa chỉ ngân hàng: "+bankName1);
        System.out.println("SDT ngân hàng: "+PHONE);
        System.out.println("Lãi Suất: "+INTEREST_Rate);
        System.out.println("Thuế: "+VAT);

    }
    public static float getINTEREST_Rate(){
        return INTEREST_Rate;
    }

}
