package ss06;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chuỗi: ");
        String str = sc.nextLine().trim();
        System.out.print("nhập từ cần tìm: ");
        String keyword = sc.nextLine().trim();
        int position = str.indexOf(keyword);
        if (position  != -1) {
            System.out.println("từ " + keyword + " xuất hiện tại vị trí " + position);
        } else {
            System.out.println("không tìm thấy " + keyword +" trong chuỗi");
        }
        sc.close();
    }
}