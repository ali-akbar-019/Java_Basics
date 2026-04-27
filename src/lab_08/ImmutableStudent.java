package lab_08;

public final class ImmutableStudent {
	private final int id;
	private final String name;

	//
	public ImmutableStudent(int id, String name) {
		this.name = name;
		this.id = id;

	}

	// getters no setter bcz it is a immutbale file
	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	//
	@Override
	public String toString() {
		return "Student{name: " + name + ", id: " + id + "}";
	}

	public static void main(String args[]) {
		ImmutableStudent st1 = new ImmutableStudent(1, "ali");
		System.out.println(st1);
	}
}
