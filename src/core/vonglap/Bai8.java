package core.vonglap;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n= sc.nextLong();
        for(long i=1;i*i <=n;i++){
            System.out.print(i*i+" ");
        }
    }
}
