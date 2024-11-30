package core.vonglap;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count ++;
            }
        }
        System.out.println(count);
        for(int j=1;j<=n;j++){
            if(n%j==0){
                System.out.print(j+" ");
            }
        }
    }
}
