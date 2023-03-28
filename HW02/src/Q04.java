
public class Q04 {

	public static void main(String[] args) {

		int money = 65367;

		int m50000 = money / 50000;
		int m10000 = money % 50000 / 10000;
		int m5000 = money % 10000 / 5000;
		int m1000 = money % 5000 / 1000;
		int m500 = money % 1000 / 500;
		int m100 = money % 500 / 100;
		int m50 = money % 100 / 50;
		int m10 = money % 50 / 10;
		int m1 = money % 10;

		System.out.println("오만원\t:" + m50000);
		System.out.println("만원\t:" + m10000);
		System.out.println("오천원\t:" + m5000);
		System.out.println("만원\t:" + m1000);
		System.out.println("오백원\t:" + m500);
		System.out.println("백원\t:" + m100);
		System.out.println("오십원\t:" + m50);
		System.out.println("십원\t:" + m10);
		System.out.println("일원\t:" + m1);
	}

}
