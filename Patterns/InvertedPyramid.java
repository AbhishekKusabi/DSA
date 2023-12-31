package Patterns;
import java.util.Scanner;

public class InvertedPyramid {
    static void Pyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){      // space printing
                System.out.print(" ");
            }
            for(int k=0;k<(2*n) -(2*i+1);k++){
                System.out.print("*");
            }
            for(int j=0;j<=i;j++){      // space printing
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        Pyramid(n);
    }
}
