package core.vonglap;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n==0){
            System.out.println(1);
        }else{
            long sum =1;
            for(int i=1;i<=n;i++){
                sum *=i;
            }
            System.out.println(sum);
        }

    }
}
