package BaiTap.DaoNguocVanBan;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocVanBan {
    public static void main(String[] args) {
        Stack<String> stacks = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng từ cần nhập : ");
        int numOfWords = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numOfWords; i++) {
            System.out.println("Nhập từ thứ " + (i + 1) + " : ");
            stacks.push(scanner.nextLine());
        }
        System.out.println("Văn bản đảo ngược là : ");
        for (int i = 0; i < numOfWords; i++) {
            System.out.print(stacks.pop() + " ");
        }
    }
}
