package core.vonglap;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean check =false;
        while (n !=0){
            int s =sc.nextInt();
            if(s==2022){
                check=true;
                break;
            }
            n--;
        }
        if(check){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
