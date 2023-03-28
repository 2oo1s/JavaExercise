import java.util.Random;

public class ex02rand {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] num = new int[100];
		int[] count = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = rand.nextInt(10);
			System.out.print(num[i]);
			if (i % 20 == 19)
				System.out.println();
		}
		System.out.println();
		for (int i = 0; i < num.length; i++)
			count[num[i]]++;
		graph(count);
	}

	public static void graph(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + "°³¼ö:");
			for (int j = 0; j < a[i]; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
