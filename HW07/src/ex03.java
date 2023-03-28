class Shape {
	private String name;

	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getArea() {
		return 0;
	}
}

class Circle extends Shape {

	private int r;

	public Circle(String name, int r) {
		super(name);
		this.r = r;
	}

	public double getArea() {
		return (r * r * 3.14);
	}
}

class Rectangle extends Shape {
	private int x, y;

	public Rectangle(String name, int x, int y) {
		super(name);
		this.x = x;
		this.y = y;
	}

	public double getArea() {
		return (x * y);
	}
}

class Triangle extends Shape {
	private int x, y;

	public Triangle(String name, int x, int y) {
		super(name);
		this.x = x;
		this.y = y;
	}

	public double getArea() {
		return ((x * y) / 2.0);
	}
}

public class ex03 {

	public static void main(String[] args) {
		Shape[] arr = { new Circle("Circle", 5), new Rectangle("Rectangle", 3, 4), new Triangle("Triangle", 5, 5) };
		double sum = 0;
		for (Shape a : arr) {
			System.out.println(a.getName() + " 면적 : " + a.getArea());
			sum += a.getArea();
		}
		System.out.println("면적의 합 : " + sum);
	}

}
