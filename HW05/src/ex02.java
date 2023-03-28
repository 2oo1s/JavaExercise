class CurrencyConverter {
	private static double rate;

	public static double toDollar(int won) {
		return won / rate;
	}

	public static double toKW(int dollar) {
		return dollar * rate;
	}

	public static void setRate(double r) {
		rate = r;
	}

	public static double getRate() {
		return rate;
	}
}

public class ex02 {

	public static void main(String[] args) {
		CurrencyConverter.setRate(1121);
		System.out.println("ȯ�� 1�޷� : " + CurrencyConverter.getRate());
		System.out.println("�鸸���� $" + CurrencyConverter.toDollar(1000000) + "�Դϴ�.");
		System.out.println("$120�� " + CurrencyConverter.toKW(120) + "�� �Դϴ�.");
	}

}
