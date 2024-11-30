package core.vonglap;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n* 2L + (long)n*(n-1));
    }
}
