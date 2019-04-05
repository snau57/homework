package mailbox;

import java.util.Scanner;

public class BoxTester {

    public static void main(String[] args) {
        float length;
        float width;
        int height;

        System.out.println("歡迎使用郵局便利箱");
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入想寄送物品的長度(cm)：");
        length = scanner.nextFloat();
        System.out.print("請輸入想寄送物品的寬度(cm)：");
        width = scanner.nextFloat();
        System.out.print("請輸入想寄送物品的高度(cm)：");
        height = scanner.nextInt();

        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        if (box3.validate(length, width, height)) {
            System.out.println("請使用Box3便利箱");
        } else if (box5.validate(length, width, height)) {
            System.out.println("請使用Box5便利箱");
        } else {
            System.out.println("請使用其他便利箱");
        }
    }

}