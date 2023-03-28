class Circle {
	private double rad = 0;
	final double PI = 3.14;
	String name;

	public Circle(String n, double r) {
		name = n;
		setRad(r);
	}

	public void setRad(double r) {
		if (r < 0) {
			rad = 0;
			return;
		}
		rad = r;
	}

	public String getName() {
		return name;
	}

	public double getArea() {
		return (rad * rad * 3.14);
	}

	public void show() {
		System.out.println(getName() + "넓이 : " + getArea());
	}
}

public class ex04 {

	public static void main(String[] args) {
		Circle c1 = new Circle("Pizza", 0);
		Circle c2 = new Circle("donut", 0);
		Circle c3 = new Circle("hamburger", 0);

		c1.setRad(12);
		c2.setRad(-2);
		c3.setRad(7);

		Circle max;
		max = (c1.getArea() > c2.getArea()) ? c1 : c2;
		max = (max.getArea() > c3.getArea() ? max : c3);

		c1.show();
		c2.show();
		c3.show();

		System.out.println("가장 큰 면적은 " + max.getName());
	}

}
