
public class Q05 {

	public static void main(String[] args) {

		int dec = 12;
		int oct = 012;
		int hex = 0x12;

		System.out.println("10진수 12\t: " + dec);
		System.out.println("8진수 12\t: " + oct);
		System.out.println("16진수 12\t: " + hex);
		System.out.println("Sum\t: " + (dec + oct + hex));
		System.out.println("Average\t: " + (dec + oct + hex) / 3);

	}

}
