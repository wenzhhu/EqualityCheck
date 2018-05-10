

import static org.junit.Assert.*;
import org.junit.Test;


public class BasicTest {
	private final static String A_CUSTOMER = "Mr. Java Beginner";
	private final static Book EFFECTIVE_JAVA_1ST = new Book("Effective Java", 1);
	private final static Book EFFECTIVE_JAVA_2ND = new Book("Effective Java", 2);
	
	private final static Book CORE_JAVA_9TH = new Book("CORE Java", 2);
	
	private final static Book ANOTHER_EFFECTIVE_JAVA_1ST = new Book("Effective Java", 1);
	
	private final static Order ORDER_OF_EFFECTIVE_JAVA_1ST = new Order(A_CUSTOMER, EFFECTIVE_JAVA_1ST);
	private final static Order ORDER_OF_EFFECTIVE_JAVA_2ND = new Order(A_CUSTOMER, EFFECTIVE_JAVA_2ND);

	@Test
	public void totallyDifferentBooks() {
		assertEquals(EFFECTIVE_JAVA_1ST, CORE_JAVA_9TH);
	}
	
	@Test
	public void differntWithoutCorrectDebugInfo() {
		assertEquals(EFFECTIVE_JAVA_1ST, EFFECTIVE_JAVA_2ND);
	}
	
	@Test
	public void differentWithManualWrapper() {
		Object wrappedEffeciveJava1st = BookManualWrapper.wrap(EFFECTIVE_JAVA_1ST);
		Object wrappedEffeciveJava2nd = BookManualWrapper.wrap(EFFECTIVE_JAVA_2ND);
		
		assertEquals(wrappedEffeciveJava1st, wrappedEffeciveJava2nd);
	}
	
	@Test
	public void equalWithManualWrapper() {
		Object wrappedEffeciveJava1st = BookManualWrapper.wrap(EFFECTIVE_JAVA_1ST);
		Object wrappedAnotherEffeciveJava1st = BookManualWrapper.wrap(ANOTHER_EFFECTIVE_JAVA_1ST);
		
		assertEquals(wrappedEffeciveJava1st, wrappedAnotherEffeciveJava1st);
	}
	
	@Test
	public void differentWithReflectionlWrapper() {
		Object wrappedEffeciveJava1st = BookReflectionWrapper.wrap(EFFECTIVE_JAVA_1ST);
		Object wrappedEffeciveJava2nd = BookReflectionWrapper.wrap(EFFECTIVE_JAVA_2ND);
		
		assertEquals(wrappedEffeciveJava1st, wrappedEffeciveJava2nd);
	}
	
	
	@Test
	public void orderWithBooksWithDifferentVersionOnly() {
		assertEquals(ORDER_OF_EFFECTIVE_JAVA_1ST, ORDER_OF_EFFECTIVE_JAVA_2ND);
	}
	
	@Test
	public void orderWithBooksWithDifferentVersionOnlyWithReflectionlWrapper() {
		Object wrappedOrderOfEffeciveJava1st = OrderReflectionWrapper.wrap(ORDER_OF_EFFECTIVE_JAVA_1ST);
		Object wrappedOrderOfEffeciveJava2nd = OrderReflectionWrapper.wrap(ORDER_OF_EFFECTIVE_JAVA_2ND);
		
		assertEquals(wrappedOrderOfEffeciveJava1st, wrappedOrderOfEffeciveJava2nd);
	}
	
	
	
	


}
