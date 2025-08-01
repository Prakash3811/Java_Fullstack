package Day6;

import java.util.Scanner;

public class ALTERNATE_ADD_SUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter N (1 to 10000): ");
        int N = sc.nextInt();

        System.out.print("Enter opt (1 or 2): ");
        int opt = sc.nextInt();

        int result = 0;

        if (opt == 1) {
            // Start with +N, then - (N-1), + (N-2), ...
            for (int i = N; i >= 1; i--) {
                if ((N - i) % 2 == 0) {
                    result += i;
                } else {
                    result -= i;
                }
            }
        } else if (opt == 2) {
            // Start with +N, then + (N-1), - (N-2), ...
            for (int i = N; i >= 1; i--) {
                if ((N - i) % 2 == 0 || i == N) {
                    result += i;
                } else {
                    result -= i;
                }
            }
        } else {
            System.out.println("Invalid option. Please enter 1 or 2.");
            return;
        }

        // Output
        System.out.println("Result = " + result);
    }
}
