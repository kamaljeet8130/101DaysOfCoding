package coding101days.day33;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter :: ");
        int n = scanner.nextInt();
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
