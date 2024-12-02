package core.vonglap;

import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int count =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++ ){
                count ++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            int x=i;
            for(int j=1;j<=n;j++){
                System.out.print(x+" ");
                x+=1;
            }
            System.out.println();

        }
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("~");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            int x=i;
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                x += n-j;

            }
            System.out.println();
        }
    }
}
