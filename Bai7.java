package ss06;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chuỗi: ");
        String email = sc.nextLine().trim();

        // Kiểm tra có chứa '@' không
        int atIndex = -1;
        for (int j = 0; j < email.length(); j++) {
            if (email.charAt(j) == '@') {
                atIndex = j;
                break;
            }
        }

        // Nếu không có '@' hoặc ở đầu/cuối -> không hợp lệ
        if (atIndex <= 0 || atIndex >= email.length() - 1) {
            System.out.println("email không hợp lệ");
        }

        // Tách phần tên người dùng và tên miền
        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);

        // Kiểm tra tên miền hợp lệ (có dấu '.' và không phải đầu/cuối)
        int dotIndex = -1;
        for (int j = 0; j < domain.length(); j++) {
            if (domain.charAt(j) == '.') {
                dotIndex = j;
                break;
            }
        }

        // Nếu tên miền không hợp lệ -> bỏ qua
        if (dotIndex <= 0 || dotIndex >= domain.length() - 1) {
            System.out.println("email không hợp lệ");
        }

        // Kiểm tra username chỉ chứa chữ, số, '_', '.'
        boolean validUsername = true;
        for (int j = 0; j < username.length(); j++) {
            char ch = username.charAt(j);
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || ch == '.' || ch == '_')) {
                validUsername = false;
                break;
            }
        }

        if (!validUsername) {
            System.out.println("email không hợp lệ");
        }

        // Nếu qua hết các kiểm tra -> Email hợp lệ
        System.out.println("tên người dùng: " + username + ", tên miền: " + domain);

        sc.close();
    }
}