package Patterns;
import java.util.Scanner;
public class RightAngled {

    static void print(int n){
        for (int i =0;i<n;i++){
            for (int j =0; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print(n);
    }
}
