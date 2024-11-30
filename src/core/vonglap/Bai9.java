package core.vonglap;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        long s =1;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                s*=i;
                if(n/i !=i){
                    s *=n/i;
                }
            }
        }
        System.out.println(s);
    }
}
