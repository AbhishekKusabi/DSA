package Patterns;
import java.util.Scanner;

public class NumberedRightAngledTriangle {

    static void print1(int n ){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    static void print2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    print2(n);
    
 }   
}