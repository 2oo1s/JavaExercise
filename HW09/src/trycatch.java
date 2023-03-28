import java.util.Scanner;
import java.util.InputMismatchException;

public class trycatch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("x값 : ");
			int x = s.nextInt();
			System.out.print("y값 : ");
			int y = s.nextInt();

			System.out.println("x * y = " + mul(x, y));
			System.out.println("x / y = " + div(x, y));
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램을 종료합니다.");
		}
	}

	static int mul(int a, int b) {
		return a * b;
	}

	static int div(int a, int b) {
		return a / b;
	}
}
