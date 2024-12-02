package core.vonglap;

import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=n;i>=1;i--){
            for(int j=i;j >=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            // In khoảng trắng trước các dấu *
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // In dấu *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Xuống dòng sau mỗi dòng
            System.out.println();
        }
        System.out.println();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==1 || i== n || j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
