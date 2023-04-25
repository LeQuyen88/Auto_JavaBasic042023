package BaiTap_JavaBasic2.PhuongThuc;

import BaiTap_JavaBasic2.Bank;

public class PhuongThucBank {
    public static void main(String[] args) {
        Bank.getBankInfo();
        double tongTien = (Bank.getINTEREST_Rate()*100000000)/100;
        System.out.println("Tổng Tiền Lãi: "+tongTien);
    }
}
