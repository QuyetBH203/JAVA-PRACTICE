package core.vonglap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long s =0;
        for(int i=1;i<=n;i++){
            if(i%3==0){
                s +=i;
            }
        }
        System.out.println(s);
    }
}
