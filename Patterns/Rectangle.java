package Patterns;
import java.util.Scanner;
public class Rectangle {

   static void print(int n){
        for (int i=0 ; i<n ; i++){
            for (int j=0; j<n;j++){
                System.out.print(" "+"*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print(n);
    }
}