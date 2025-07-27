package Day2;

public class prg9_swap_two_numbers_without_temporary_variable {
	public static void main(String[] args) {
        int a = 10, b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + ", b: " + b);
    }


}
