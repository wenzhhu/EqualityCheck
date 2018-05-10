import java.util.Random;

public class Book {
	private final long id;
	private final String title;
	private final int version;
	
	public Book(String title, int version) {
		super();
		this.id = new Random().nextLong();
		this.title = title;
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + version;
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
		Book other = (Book) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (version != other.version)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getVersion() {
		return version;
	}
	
	

}
