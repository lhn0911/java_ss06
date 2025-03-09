package ss06;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập văn bản: ");
        String text = sc.nextLine();

        if (text.trim().length() == 0) {
            System.out.println("Không có văn bản để xử lý.");
            return;
        }

        String cleanText = "";
        String numbers = "";
        boolean space = false;
        int length = text.length();

        // Duyệt từng ký tự để lọc văn bản
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == ' ') {
                if (c == ' ') {
                    if (!space) {
                        cleanText += ' ';
                        space = true;
                    }
                } else {
                    cleanText += (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c; // Chuyển chữ hoa thành chữ thường
                    space = false;
                }
                if (c >= '0' && c <= '9') {
                    numbers += c;
                } else {
                    numbers += " ";
                }
            }
        }

        // Chuẩn hóa khoảng trắng
        cleanText = cleanText.trim();
        numbers = numbers.trim();

        System.out.println("văn bản đã chuẩn hóa: " + cleanText);
        if (numbers.length() > 0) {
            System.out.print("danh sách số: ");
            boolean inNumber = false;
            for (int i = 0; i < numbers.length(); i++) {
                char c = numbers.charAt(i);
                if (c != ' ') {
                    System.out.print(c);
                    inNumber = true;
                } else if (inNumber) {
                    System.out.print(", ");
                    inNumber = false;
                }
            }
            System.out.println();
        } else {
            System.out.println("không có số trong văn bản.");
        }
    }
}