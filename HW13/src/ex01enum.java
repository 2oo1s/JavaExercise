enum Company {
	AMAZON(170), APPLE(165), GOOGLE(136), FACEBOOK(101), MICROSOFT(91);

	private int value;

	private Company(int value) {
		this.value = value;
	}

	public String toString() {
		return (this.ordinal() + 1) + "�� " + this.name() + " �����ġ " + this.value + "��";
	}
}

public class ex01enum {

	public static void main(String[] args) {
		showAll("FACEBOOK");
		showAll("APPLE", "MICROSOFT");
		showAll("AMAZON", "APPLE", "GOOGLE");
	}

	public static void showAll(String... top5) {
		Company com;
		for (int i = 0; i < top5.length; i++) {
			com = Company.valueOf(top5[i]);
			System.out.println(com);
		}
		System.out.println("���� �����ġ Top5 �߿��� " + top5.length + "���� ����� �ֽ��ϴ�.\n");
	}
}