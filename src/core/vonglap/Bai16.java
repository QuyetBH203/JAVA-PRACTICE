package core.vonglap;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 0) {
            System.out.println(1);
        } else {
            int count = 0;
            while (n != 0) {
                count++;
                n /= 10;
            }
            System.out.println(count);

        }


    }
}
