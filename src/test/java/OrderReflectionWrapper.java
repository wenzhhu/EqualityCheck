import java.util.Objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.RecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OrderReflectionWrapper {
	private final Order order;
	
	private OrderReflectionWrapper(Order order) {
		this.order = order;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((order == null) ? 0 : order.hashCode());
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
		OrderReflectionWrapper other = (OrderReflectionWrapper) obj;
		return EqualsBuilder.reflectionEquals(order, other.order);
	}

	@Override
	public String toString() {
		final ToStringStyle toStringStyle = new RecursiveToStringStyle() {
			{
				setUseIdentityHashCode(false);
			}
		};
		
		final ReflectionToStringBuilder toStringBuilder = new ReflectionToStringBuilder(this.order, toStringStyle);
		toStringBuilder.setExcludeFieldNames("id");
		return "BookReflectionWrapper [order="
				+ toStringBuilder.toString() + "]";
	}

	public static Object wrap(Order order) {
		if (order == null) return null;
		
		return new OrderReflectionWrapper(order);
	}
	
	
}
