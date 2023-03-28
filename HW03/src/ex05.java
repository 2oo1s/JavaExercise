
public class ex05 {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++)
			System.out.println("f(" + i + ") = " + factorial(i));
	}

	public static int factorial(int n) {

		if (n == 0)
			return 1;
		else
			return 2 * factorial(n - 1) + 1;
	}
}