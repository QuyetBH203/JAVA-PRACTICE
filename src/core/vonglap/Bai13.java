package core.vonglap;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Ap dung cong thuc tinh cap so cong
        // S = n*u1 +n*(n-1)*d/2
        int n= sc.nextInt();
        System.out.println((long) n + (long) n*(n-1));
    }
}
