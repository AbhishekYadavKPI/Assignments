package question7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindLastTest {
	@Test
	public void checkLastElement() {
		FindLast ob1 = new FindLast();
		assertEquals(10,ob1.LastElement());
		
	}

}
