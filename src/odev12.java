import java.util.Scanner;

public class odev12 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("Yazdiginiz Sayilari Kucukten Buyuge Siralar !!!\n");

        System.out.print("1. Sayiyi Giriniz : ");
        a = input.nextInt();

        System.out.print("2. Sayiyi Giriniz : ");
        b = input.nextInt();

        System.out.print("3. Sayiyi Giriniz : ");
        c = input.nextInt();

        System.out.println("\nKucukten Buyuge : ");

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println(c + " < " + b + " < " + a);
            } else {
                System.out.println(b + " < " + c + " < " + a);
            }

        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println(c + " < " + a + " < " + b);
            } else {
                System.out.println(a + " < " + c + " < " + b);
            }
        } else {
            if (a > b) {
                System.out.println(b + " < " + a + " < " + c);
            }else {
                System.out.println(a + " < " + b + " < " + c);
            }
        }

    }
}
