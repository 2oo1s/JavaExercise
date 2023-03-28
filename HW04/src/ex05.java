class Calc {
	int n1;
	int n2;
	char sign;

	public void setValue(int num1, int num2, char s) {
		n1 = num1;
		n2 = num2;
		sign = s;
	}

	int add() {
		return (n1 + n2);
	}

	int sub() {
		return (n1 - n2);
	}

	int mul() {
		return (n1 * n2);
	}

	int div() {
		if (n2 == 0) {
			System.out.print("0���� ���� �� �����ϴ�!");
			return 0;
		}
		return (n1 / n2);
	}

	void result() {
		int res;

		switch (sign) {
		case '+':
			res = add();
			break;
		case '-':
			res = sub();
			break;
		case '*':
			res = mul();
			break;
		case '/':
			res = div();
			break;
		default:
			System.out.println("�߸��� �������Դϴ�.");
			return;
		}
		System.out.println("result = " + res);
	}
}

public class ex05 {

	public static void main(String[] args) {
		Calc c = new Calc();
		c.setValue(2, 5, '+');
		c.result();
		c.setValue(2, 5, '$');
		c.result();
		c.setValue(2, 5, '-');
		c.result();
		c.setValue(2, 5, '*');
		c.result();
		c.setValue(2, 5, '/');
		c.result();
	}

}
