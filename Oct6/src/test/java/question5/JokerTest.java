package question5;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JokerTest {
	@Test
	public void check() {
		Joker ob = new Joker("Kathak");
		Joker ob2 = new Joker("Bhangra");
		Joker ob3 = new Joker();
		
		assertEquals("Kathak",ob.Dance_form);
		assertEquals("Bhangra",ob2.Dance_form);
		assertEquals(null,ob3.Dance_form);
	}

}
