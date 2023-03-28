
public class Q06 {

	public static void main(String[] args) {

		byte n1 = 47; // 00101111
		byte n2 = 21; // 00010101

		byte r1 = (byte) (n1 & n2);
		byte r2 = (byte) (n1 | n2);

		System.out.println("& 결과\t: " + r1);
		System.out.println("| 결과\t: " + r2);
	}

}
