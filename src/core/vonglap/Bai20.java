package core.vonglap;

import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        if(n==1){
            System.out.println(-1);
        }else{
            if(n%2==0){
                System.out.println(n/2);
                while (n !=0){
                    System.out.print(2+" ");
                    n -=2;
                }
            }else{
                if(n==3){
                    System.out.println(1);
                    System.out.println(3);
                }else{
                    System.out.println((n-3)/2+1);
                    for(int i=1;i<=(n-3)/2;i++){
                        System.out.print(2+" ");
                    }
                    System.out.println(3);
                }
            }
        }
    }
}
