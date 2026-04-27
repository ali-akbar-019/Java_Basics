package lab_08;

public class GenericBox<T> {
	T value;

	//
	public GenericBox(T value) {
		this.value = value;
	}

	// get val
	T getVal() {
		return value;
	}

	// set val
	void setVal(T value) {
		this.value = value;
	}

	public static void main(String args[]) {
		GenericBox<Integer> b1 = new GenericBox<Integer>(10);
		System.out.println(b1.getVal());
//		
		GenericBox<ImmutableStudent> b2 = new GenericBox<ImmutableStudent>(new ImmutableStudent(1, "ali akbar"));
		System.out.println(b2.getVal());
	}
}
