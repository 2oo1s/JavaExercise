interface Shape {
	final double PI = 3.14;

	void draw();

	double getArea();
}

class Circle implements Shape {
	int r;

	public Circle(int r) {
		this.r = r;
	}

	public double getArea() {
		return (r * r * 3.14);
	}

	public void draw() {
		System.out.println("반지름이 " + r + "인 원입니다.");
	}
}

class Oval implements Shape {
	int a, b;

	public Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void draw() {
		System.out.println(a + "x" + b + "에 내접하는 타원입니다.");
	}

	public double getArea() {
		return PI * a * b;
	}
}

class Rect implements Shape {
	int x, y;

	public Rect(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void draw() {
		System.out.println(x + "x" + y + "크기의 사각형입니다.");
	}

	public double getArea() {
		return x * y;
	}
}

public class test03 {

	public static void main(String[] args) {
		Shape[] list = { new Circle(20), new Oval(20, 30), new Rect(20, 30) };
		for (Shape a : list)
			a.draw();
		for (Shape a : list)
			System.out.println("면적은 " + a.getArea());

	}

}
