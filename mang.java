package ss06;
import java.util.Scanner;

public class mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("----------MENU----------");
            System.out.println("1. Them phan tu vao mang");
            System.out.println("2. Cap nhat phan tu trong mang");
            System.out.println("3. Xoa phan tu trong mang");
            System.out.println("4. Thoat chuong trinh");
            System.out.printf("Nhap do dai cua mang: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.printf("Nhap lua chon cua ban: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("Nhap gia tri muon tren vao bang: ");
                    int m = sc.nextInt();
                    System.out.printf("Nhap vi tri muon them: ");
                    int t = sc.nextInt();
                    int[] arr2 = new int[n + 1];
                    if (t < 0) {
                        System.out.println("Khong ton tai chi so " + t);
                    } else if (t < n) {
                        arr2 = new int[n + 1];
                        for (int i = 0; i < (n + 1); i++) {
                            if (i < t) {
                                arr2[i] = arr[i];
                            } else if (i == t) {
                                arr2[i] = m;
                            } else if (i > t) {
                                arr2[i] = arr[i - 1];
                            }
                        }
                    } else if (t > n) {
                        arr2 = new int[t + 1];
                        for (int i = 0; i < n; i++) {
                            arr2[i] = arr[i];
                        }
                        for (int i = 0; i < arr2.length; i++) {
                            if (i == t) {
                                arr2[i] = m;
                            }
                        }
                    }
                    for (int i = 0; i < arr2.length; i++) {
                        System.out.println(arr2[i] + " ");
                    }
                    break;
                case 2:
                    System.out.printf("Nhap gia tri phan tu muon cap nhat: ");
                    int x = sc.nextInt();
                    System.out.printf("Nhap gia tri muon cap nhat: ");
                    int y = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == x) {
                            arr[i] = y;
                        }
                    }
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i] + " ");
                    }
                    break;
                case 3:
                    System.out.println("Nhap phan tu muon xoa: ");
                    x = sc.nextInt();
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == x) {
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Phan tu khong ton tai trong mang.");
                        break;
                    }
                    int[] arr3 = new int[n - count];
                    int index = 0;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] != x) {
                            arr3[index] = arr[i];
                            index++;
                        }
                    }
                    for (int i = 0; i < arr3.length; i++) {
                        System.out.print(arr3[i] + " ");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Thoat chuong trinh");
                    break;
            }
        } while (true);
    }
}