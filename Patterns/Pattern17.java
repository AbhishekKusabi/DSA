package Patterns;
import java.util.Scanner;

public class Pattern17 {
    static void print(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print("  ");
            }
            char ch='A';
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch+" ");
                if(j<= (2*i+1)/2){
                    ch++;
                }
                else ch--;
                
            }
            System.out.println();
        }
            for(int i=n-2;i>=0;i--){
            for(int j=0;j<=n-i-1;j++){
                System.out.print("  ");
            }
            char ch='A';
            for(int j=1; j<=2*i+1; j++){
                System.out.print(ch+" ");
                if(j<= (2*i+1)/2){
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);

    }    
}