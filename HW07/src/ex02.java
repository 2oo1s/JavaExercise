class Point3D extends Point {

	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public void moveUp() {
		z++;
	}

	public void moveDown() {
		z--;
	}

	public void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}

	public String toString() {
		String s = "(" + getX() + "," + getY() + "," + z + ")�� ��";
		return s;
	}

}

public class ex02 {
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString() + "�Դϴ�.");

		p.moveUp();
		System.out.println(p.toString() + "�Դϴ�.");

		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "�Դϴ�.");

		p.move(100, 100, 100);
		System.out.println(p.toString() + "�Դϴ�.");
	}
}
