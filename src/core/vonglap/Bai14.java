package core.vonglap;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        long sum =0;
        for(int i=1;i<=n;i++){
            sum += (long) Math.pow(i,3);
        }
        System.out.println(sum);
    }
}
