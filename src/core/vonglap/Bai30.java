package core.vonglap;

import java.util.Scanner;

public class Bai30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t !=0){
            int n = sc.nextInt();
            if(n%2==0){
                System.out.println("EVEN");
            }else{
                System.out.println("ODD");
            }
            t -=1;

        }
    }
}
