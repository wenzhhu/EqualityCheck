import java.util.Objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.RecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BookReflectionWrapper {
	private final Book book;
	
	private BookReflectionWrapper(Book book) {
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
		BookReflectionWrapper other = (BookReflectionWrapper) obj;
		return EqualsBuilder.reflectionEquals(book, other.book);
	}

	@Override
	public String toString() {
		final ToStringStyle toStringStyle = new RecursiveToStringStyle() {
			{
				setUseIdentityHashCode(false);
			}
		};
		
		final ReflectionToStringBuilder toStringBuilder = new ReflectionToStringBuilder(this.book, toStringStyle);
		toStringBuilder.setExcludeFieldNames("id");
		return "BookReflectionWrapper [book="
				+ toStringBuilder.toString() + "]";
	}

	public static Object wrap(Book book) {
		if (book == null) return null;
		
		return new BookReflectionWrapper(book);
	}
	
	
}
