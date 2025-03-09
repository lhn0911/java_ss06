package ss06;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chuỗi: ");
        String str = sc.nextLine().trim();
        String replacedString = str.replaceAll("\\d", "*");
        System.out.println(replacedString);
        sc.close();
    }
}