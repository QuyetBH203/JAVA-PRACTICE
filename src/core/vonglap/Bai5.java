package core.vonglap;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double s=0;
        for(int i=1;i<=n;i++){
            s += (double) 1.0/(2*i);
        }
        System.out.printf("%.5f%n",s);
    }
}