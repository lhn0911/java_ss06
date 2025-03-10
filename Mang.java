package ss06;
import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nhập độ dài của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        while (true) {
            System.out.println("----------MENU----------");
            System.out.println("1. Thêm phần tử vào mảng");
            System.out.println("2. Cập nhật phần tử trong mảng");
            System.out.println("3. Xóa phần tử trong mảng");
            System.out.println("4. Thoát chương trình");
            System.out.printf("Nhập lựa chọn của bạn: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Nhập giá trị muốn thêm vào mảng: ");
                    int m = sc.nextInt();
                    System.out.printf("Nhập vị trí muốn thêm: ");
                    int t = sc.nextInt();

                    if (t < 0 || t > n) {
                        System.out.println("Vị trí không hợp lệ!");
                        break;
                    }

                    int[] arr2 = new int[n + 1];
                    for (int i = 0; i < t; i++) {
                        arr2[i] = arr[i];
                    }
                    arr2[t] = m;
                    for (int i = t; i < n; i++) {
                        arr2[i + 1] = arr[i];
                    }

                    arr = arr2;
                    n++;
                    System.out.print("Mảng sau khi thêm: ");
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.printf("Nhập giá trị phần tử muốn cập nhật: ");
                    int oldValue = sc.nextInt();
                    System.out.printf("Nhập giá trị thay thế: ");
                    int newValue = sc.nextInt();

                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == oldValue) {
                            arr[i] = newValue;
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Giá trị không tồn tại trong mảng.");
                    } else {
                        System.out.print("Mảng sau khi cập nhật: ");
                        for (int num : arr) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.printf("Nhập giá trị phần tử muốn xóa: ");
                    int x = sc.nextInt();

                    int count = 0;
                    for (int num : arr) {
                        if (num == x) {
                            count++;
                        }
                    }

                    if (count == 0) {
                        System.out.println("Phần tử không tồn tại trong mảng.");
                        break;
                    }

                    int[] arr3 = new int[n - count];
                    int index = 0;
                    for (int num : arr) {
                        if (num != x) {
                            arr3[index++] = num;
                        }
                    }

                    arr = arr3;
                    n -= count;
                    System.out.print("Mảng sau khi xóa: ");
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }
}
