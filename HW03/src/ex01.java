
public class ex01 {

	public static void main(String[] args) {

		int count8 = 0, count9 = 0;

		for (int num = 1; num <= 100; num++) {
			{
				if ((num % 8 == 0) && (num % 9 == 0))
					break;
				else if (num % 8 == 0)
					count8++;
				else if (num % 9 == 0)
					count9++;
			}
		}

		System.out.println("8�� ��� : " + count8 + "��");
		System.out.println("9�� ��� : " + count9 + "��");
	}

}
