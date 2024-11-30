package core.vonglap;

import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 0) {
            System.out.println(0);
        } else {
            long sum = 0;
            while (n != 0) {
                sum += (int) (n % 10);
                n /= 10;

            }
            System.out.println(sum);

        }

    }
}
