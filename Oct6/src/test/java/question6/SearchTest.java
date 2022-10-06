package question6;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SearchTest {
	@Test
	public void checkFindCommon() {
		Search ob1 = new Search();
		assertEquals(2,ob1.FindCommon());
		
	}
}
