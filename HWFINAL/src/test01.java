public class test01 {

	public static void main(String[] args) {
		int sum = 0;
		int tot = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			tot += sum;
		}
		System.out.println("totalSum=" + tot);
	}
}