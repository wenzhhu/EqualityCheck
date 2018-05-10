import java.util.Objects;

public class BookManualWrapper {
	private final Book book;
	
	private BookManualWrapper(Book book) {
		this.book = book;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookManualWrapper other = (BookManualWrapper) obj;
		return Objects.equals(book, other.book);
	}

	@Override
	public String toString() {
		return "BookManualWrapper [title=" + book.getTitle() + ", version=" + book.getVersion() +"]";
	}

	public static Object wrap(Book book) {
		if (book == null) return null;
		
		return new BookManualWrapper(book);
	}
	
	
}
