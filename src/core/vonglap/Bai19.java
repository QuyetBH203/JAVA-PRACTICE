package core.vonglap;

import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(0);
        } else {
            int bia = n / 28;
            int vo = bia;
            while (vo >= 3) {
                int doiDuoc = vo /3;
                bia += doiDuoc;
                vo = vo%3+doiDuoc;
            }
            System.out.println(bia);

        }

    }
}
