package Day2;

public class prg8_swap_two_numbers_temporary_variable {
	public static void main(String[] args) {
        int a = 10, b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + ", b: " + b);
    }
}
