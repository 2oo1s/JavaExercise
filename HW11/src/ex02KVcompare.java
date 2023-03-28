class PairGen<K, V> {
	private K key;
	private V value;

	public PairGen(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

class CompareGen {
	public static <K, V> boolean compare(PairGen<K, V> c1, PairGen<K, V> c2) {
		boolean resultK, resultV;
		resultK = c1.getKey().equals(c2.getKey());
		resultV = c1.getValue().equals(c2.getValue());
		return (resultK && resultV);
	}
}

public class ex02KVcompare {

	public static void main(String[] args) {
		PairGen<String, Integer> p1 = new PairGen<>("Apple", 3);
		PairGen<String, Integer> p2 = new PairGen<>("Apple", 3);
		System.out.println(CompareGen.compare(p1, p2));

		PairGen<String, String> p3 = new PairGen<>("°´Ã¼ÁöÇâ", "Java");
		PairGen<String, String> p4 = new PairGen<>("°´Ã¼ÁöÇâ", "C++");
		System.out.println(CompareGen.compare(p3, p4));
	}
}