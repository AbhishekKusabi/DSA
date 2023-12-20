package Patterns;

import java.util.Scanner;

public class Diamond {
    static void print1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j =0; j<2*i+1;j++){
                System.out.print("*");
            }
             for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

        static void print2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){      // space printing
                System.out.print(" ");
            }
            for(int k=0;k<(2*n) -(2*i+1);k++){
                System.out.print("*");
            }
            for(int k=0;k<i;k++){      // space printing
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print1(n);
        print2(n);
    }
}
