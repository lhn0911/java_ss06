package ss06;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số điện thoại: ");
        String phone = sc.nextLine().trim();

        // Loại bỏ các dấu phân tách (-, ., khoảng trắng)
        String cleanPhone = "";
        for (int i = 0; i < phone.length(); i++) {
            char ch = phone.charAt(i);
            if (ch != ' ' && ch != '-' && ch != '.') {
                cleanPhone += ch;
            }
        }

        // Kiểm tra số điện thoại hợp lệ và chuẩn hóa
        if (cleanPhone.length() == 10 && cleanPhone.charAt(0) == '0') {
            // Chuyển đầu 0 thành +84
            String formattedPhone = "+84 " + cleanPhone.substring(1, 4) + " " + cleanPhone.substring(4, 7) + " " + cleanPhone.substring(7);
            System.out.println(formattedPhone);
        } else if (cleanPhone.length() == 12 && cleanPhone.startsWith("+84")) {
            // Định dạng lại số điện thoại có mã quốc gia
            String formattedPhone = "+84 " + cleanPhone.substring(3, 6) + " " + cleanPhone.substring(6, 9) + " " + cleanPhone.substring(9);
            System.out.println(formattedPhone);
        } else {
            System.out.println("số điện thoại không hợp lệ");
        }
        sc.close();
    }
}