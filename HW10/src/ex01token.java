import java.util.StringTokenizer;

public class ex01token {

	public static void main(String[] args) {
		String s1 = "���ع��� ��λ��� ������ �⵵��";
		String s2 = "2020/11/03";
		String s3 = "2020��11��03��";

		StringTokenizer st = new StringTokenizer(s1);
		System.out.println("s1 count: " + st.countTokens());
		int i = 1;
		while (st.hasMoreTokens())
			System.out.println(i++ + " : " + st.nextToken());
		System.out.println();

		st = new StringTokenizer(s2, "/");
		System.out.println("s2 count: " + st.countTokens());
		int j = 1;
		while (st.hasMoreTokens())
			System.out.println(j++ + " : " + st.nextToken());
		System.out.println();

		st = new StringTokenizer(s3, "�����");
		System.out.println("s3 count: " + st.countTokens());
		int k = 1;
		while (st.hasMoreTokens())
			System.out.println(k++ + " : " + st.nextToken());
	}

}
