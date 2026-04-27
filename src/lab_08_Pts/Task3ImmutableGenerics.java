package lab_08_Pts;

final class ImmutableBox<T> {
	final private T value;

	public ImmutableBox(T value) {
		this.value = value;
	}

	// getter
	T getValue() {
		return value;
	}

	//

}

public class Task3ImmutableGenerics {
	public static void main(String args[]) {
		ImmutableBox<Integer> i1 = new ImmutableBox<>(10);
		System.out.println(i1.getValue());
		ImmutableBox<String> i2 = new ImmutableBox<>("ALI");
		System.out.println(i2.getValue());
		ImmutableBox<Book> i3 = new ImmutableBox<>(new Book("haryy potter", "jkR", 12));
		System.out.println(i3.getValue());
	}
}
