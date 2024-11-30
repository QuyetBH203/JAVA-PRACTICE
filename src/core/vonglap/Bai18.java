package core.vonglap;

import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 0) {
            System.out.println(0);
        } else {
            int count = 0;
            while (n != 0) {
                long res = n % 10;
                if (res == 2 || res == 3 || res == 5 || res == 7) {
                    count++;
                }
                n /= 10;
            }
            System.out.println(count);
        }

    }
}
