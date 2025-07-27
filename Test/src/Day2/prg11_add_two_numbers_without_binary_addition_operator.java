package Day2;

public class prg11_add_two_numbers_without_binary_addition_operator {
	public static void main(String[] args) {
        int a = 5, b = 7;
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        System.out.println("Sum: " + a);
    }


}
