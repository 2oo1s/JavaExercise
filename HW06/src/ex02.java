import java.util.Scanner;

class Dictionary {
	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "baby", "money", "hope" };

	public static String kor2Eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				if (i % 2 == 0)
					System.out.print(word + "�� ");
				else
					System.out.print(word + "�� ");
				return eng[i];
			}
		}
		return null;
	}
}

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while (true) {
			System.out.print("�ѱ� �ܾ�?");
			String kor = sc.next();
			if (kor.equals("�׸�"))
				break;
			String eng = Dictionary.kor2Eng(kor);
			if (eng == null)
				System.out.println(kor + "�� ���� ������ �����ϴ�.");
			else
				System.out.println(eng);
		}
	}
}
