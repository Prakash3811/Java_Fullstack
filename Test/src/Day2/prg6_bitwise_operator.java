package Day2;

import java.util.Scanner;

public class prg6_bitwise_operator {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two integers: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        System.out.println("AND: " + (a & b));
	        System.out.println("OR: " + (a | b));
	        System.out.println("XOR: " + (a ^ b));
	        System.out.println("Left shift a by 1: " + (a << 1));
	        System.out.println("Right shift a by 1: " + (a >> 1));
	    }
}
