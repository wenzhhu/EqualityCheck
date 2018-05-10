import java.util.Random;

public class Order {
	private final long id;
	private final String customer;
	private final Book book;
	
	public Order(String customer, Book book) {
		this.id = new Random().nextLong();
		this.customer = customer;
		this.book = book;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Order other = (Order) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", book=" + book + "]";
	}
	
	

}
