package core.vonglap;

import java.util.Scanner;

public class Bai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum =0;
        for(int i=1;i<=n;i++){
            int res= sc.nextInt();
            if(res % 2==0){
                sum += (long) res;
            }
        }
        System.out.println(sum);
    }
}
