package Patterns;
import java.util.Scanner;
public class Pattern15 {
    static void print(int n){
        for(int i=0;i<n;i++){
            for(char c='A';c<='A'+(n-i-1);c++){
                System.out.print(c);
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
