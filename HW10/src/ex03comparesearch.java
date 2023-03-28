import java.util.Arrays;

class Circle implements Comparable {
	String title;
	int r;

	public Circle(String title, int r) {
		this.title = title;
		this.r = r;
	}

	public double getArea() {
		return (r * r * 3.14);
	}

	public String getTitle() {
		return title;
	}

	public void show() {
		System.out.println(title + " " + getArea());
	}

	public int compareTo(Object o) {
		Circle c = (Circle) o;
		return this.r - c.r;
	}
}

public class ex03comparesearch {

	public static void main(String[] args) {
		Circle[] c = { new Circle("Cup", 3), new Circle("Apple", 4), new Circle("Doughnut", 5), new Circle("Pizza", 7),
				new Circle("Ball", 2) };
		Arrays.sort(c);
		for (int i = 0; i < c.length; i++)
			c[i].show();

		int index = Arrays.binarySearch(c, new Circle("Apple", 4));
		System.out.println("Index of " + c[index].getTitle() + " : " + index);
	}

}
