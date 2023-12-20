package Patterns;
import java.util.Scanner;
public class Pattern13 {
    static void print(int n){
        for(int i=0;i<n;i++){
            char count ='A';
            for(int j=0;j<i;j++){
                System.out.print(count);
                count++;
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
