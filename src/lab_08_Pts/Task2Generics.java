package lab_08_Pts;

class Pair<K, V> {
	K key;
	V value;

	Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	// geters

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	//
	void display() {
		System.out.println("key: " + key + " value: " + value);
	}

}

public class Task2Generics {
	public static void main(String args[]) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "one");
		p1.display();
		Pair<String, String> p2 = new Pair<String, String>("ALI KA NUMBER", "one");
		p2.display();
		Pair<String, Book> p3 = new Pair<String, Book>("Ali's Book", new Book("Harry potter", "Jk Rowling", 123));
		p3.display();
	}
}
