class TV {
	String company;
	int year;
	int screen;

	public TV(String name, int num, int size) {
		company = name;
		year = num;
		screen = size;
	}

	public void show() {
		System.out.println(company + "에서 만든 " + year + "년형 " + screen + "인치TV");
	}
}

public class ex01 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
