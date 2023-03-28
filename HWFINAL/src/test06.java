import java.util.*;
import java.util.function.*;

public class test06 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, -1, 2, 4, -1, 1, 2));
		System.out.println(list);

		Predicate<Integer> Pred = i -> i < 0;
		list.removeIf(Pred);
		System.out.println(list);

		Consumer<Integer> con = s -> {
			for (int i = 0; i < s; i++)
				System.out.print("*");
			System.out.println();
		};
		printNum(con, list);
	}

	static void printNum(Consumer<Integer> c, List<Integer> list) {
		for (Integer s : list)
			c.accept(s);
	}
}