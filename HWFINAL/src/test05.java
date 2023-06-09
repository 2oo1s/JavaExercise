import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mp3File implements Comparable<Mp3File> {
	private String title;
	private String singer;

	public Mp3File(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	String getTitle() {
		return title;
	}

	String getSinger() {
		return singer;
	}

	public String toString() {
		return singer + " : " + title;
	}

	public int compareTo(Mp3File f) {
		return singer.compareTo(f.getSinger());
	}
}

public class test05 {
	public static void main(String[] args) {
		ArrayList<Mp3File> list = new ArrayList<>();
		list.add(new Mp3File("Santa Tell Me", "Ariana Grande"));
		list.add(new Mp3File("Last Christmas", "Wham"));
		list.add(new Mp3File("Snowman", "Sia"));
		Collections.sort(list);

		System.out.println("- ���� 1");
		for (Mp3File s : list)
			System.out.println(s);

		System.out.println("- ���� 2");
		Collections.sort(list, (s1, s2) -> s1.getTitle().compareTo(s2.getTitle()));
		for (Mp3File s : list)
			System.out.println(s);
	}
}
