package Day2;

import java.util.Scanner;

public class prg7_bitwise_of_any_number {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        System.out.println("One's Complement: " + (~a));
    }

}
