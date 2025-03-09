package ss06;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập mật khẩu: ");
        String password = sc.nextLine().trim();
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
        String specialChars = "!@#$%^&*()-+";
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (ch >= 'A' && ch <= 'Z') {
                    hasUpper = true;
                } else if (ch >= 'a' && ch <= 'z') {
                    hasLower = true;
                } else if (ch >= '0' && ch <= '9') {
                    hasDigit = true;
                } else if (specialChars.indexOf(ch) != -1) {
                    hasSpecial = true;
                }
            }

            if (hasUpper && hasLower && hasDigit && hasSpecial) {
                System.out.println("Mật khẩu hợp lệ");
            } else {
                System.out.println("Mật khẩu không hợp lệ");
            }
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }
        sc.close();
    }
}