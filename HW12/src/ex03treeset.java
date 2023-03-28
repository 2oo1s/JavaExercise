import java.util.SortedSet;
import java.util.TreeSet;

public class ex03treeset {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		SortedSet subset;
		set.add(80);
		set.add(100);
		set.add(70);
		set.add(85);
		set.add(98);
		set.add(83);

		Integer score = 0;
		score = set.first();
		System.out.println("���� ���� ���� : " + score);
		score = set.last();
		System.out.println("���� ���� ���� : " + score);
		score = set.lower(new Integer(90));
		System.out.println("90�� �Ʒ� ���� : " + score);
		score = set.higher(new Integer(90));
		System.out.println("90�� �� ���� : " + score);
		subset = set.subSet(70, 90);
		System.out.println("70������ 90�� ���� ���� : " + subset);
		subset = set.headSet(85);
		System.out.println("85�� ������ ���� : " + subset);
		subset = set.tailSet(85);
		System.out.println("85�� �̻��� ���� : " + subset);
	}

}