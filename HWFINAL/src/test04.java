import java.util.*;

public class test04 {
	public static void main(String[] args) {
		int size = 10;

		GQueue<String> stringQueue = new GQueue<>(size);
		stringQueue.enqueue("seoul");
		stringQueue.enqueue("busan");
		stringQueue.enqueue("LA");

		for (int i = 0; i < size; i++) {
			String str = stringQueue.dequeue();
			if (str != null)
				System.out.println(str);
		}

		GQueue<Integer> intQueue = new GQueue<>(size);
		intQueue.enqueue(1);
		intQueue.enqueue(2);
		intQueue.enqueue(3);

		for (int i = 0; i < size; i++) {
			Integer is = intQueue.dequeue();
			if (is != null)
				System.out.println(is);
		}
	}
}

class GQueue<T> {
	int head, tail;
	int size, capacity;
	Object[] myQ;

	public GQueue(int size) {
		this.size = size;
		head = 0;
		tail = 0;
		myQ = new Object[size];
		capacity = size;
	}

	public void enqueue(T item) {
		if (capacity == 0)
			return;
		myQ[tail] = item;
		if (tail == size - 1)
			tail = 0;
		else
			tail++;
		capacity--;
	}

	public T dequeue() {
		if (capacity == size)
			return null;
		if (head == size)
			head = 0;
		head++;
		capacity++;
		return (T) myQ[head - 1];
	}

	int getCapacity() {
		return capacity;
	}
}
