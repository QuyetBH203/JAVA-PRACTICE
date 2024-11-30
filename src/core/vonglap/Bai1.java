package core.vonglap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s=0;
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            s +=i;
        }
        System.out.println(s);

    }
}
