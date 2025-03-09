package ss06;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập URL: ");
        String url = sc.nextLine().trim();
        String protocol = "", domain = "", path = "";
        int length = url.length();

        // Kiểm tra URL bắt đầu bằng http:// hoặc https://
        if (length < 8 || (!url.startsWith("http://") && !url.startsWith("https://"))) {
            System.out.println("URL không hợp lệ");
            return;
        }

        // Xác định giao thức (protocol)
        int index = 0;
        while (index < length && url.charAt(index) != ':') {
            protocol += url.charAt(index);
            index++;
        }
        index += 3; // Bỏ qua "://"

        // Xác định tên miền (domain)
        while (index < length && url.charAt(index) != '/' && url.charAt(index) != ' ') {
            domain += url.charAt(index);
            index++;
        }

        // Xác định đường dẫn (path) nếu có
        while (index < length) {
            path += url.charAt(index);
            index++;
        }

        // Kiểm tra nếu domain rỗng
        if (domain.length() == 0) {
            System.out.println("URL không hợp lệ");
            return;
        }

        System.out.println("Giao thức: " + protocol);
        System.out.println("Tên miền: " + domain);
        if (path.length() > 0) {
            System.out.println("Đường dẫn: " + path);
        } else {
            System.out.println("Đường dẫn: không có đường dẫn");
        }
    }
}