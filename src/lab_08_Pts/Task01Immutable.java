package lab_08_Pts;

final class Book {
	final private String title;
	final private String author;
	final private int isbn;

	public Book(String title, String author, int isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	//
	// getters
	String getTitle() {
		return title;
	}

	String getAuthor() {
		return author;
	}

	int getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		return "title: " + title + " author: " + author + " isbn: " + isbn;
	}
}

public class Task01Immutable {
	public static void main(String args[]) {
		Book b1 = new Book("Harry potter", "Jk rowling", 123);
		System.out.println(b1);
	}
}
