package ss06;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chuỗi: ");
        String str = sc.nextLine().trim();
        String[] strs = str.split("\\s+");
        System.out.println(strs.length);
    }
}