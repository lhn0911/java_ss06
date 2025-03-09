package ss06;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chuỗi: ");
        String str = sc.nextLine().trim();
        String[] words = str.split("\\s+");
        int count = 0;
        String specialWords = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches(".*[^a-zA-Z0-9].*")) {
                count++;
                specialWords += words[i] + " ";
            }
        }
        if (count > 0) {
            System.out.println(count);
            System.out.println("( " + specialWords + " )");
        } else {
            System.out.println(count);
            System.out.println("không có ký tự đặc biệt");
        }
        sc.close();
    }
}