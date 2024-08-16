package SeccionA;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Tests {
	@Test
	 public void testTodosPositvos(){
		assertEquals(6,Calculation.findMax(new int[]{5,6,1,3}));
	 }
	@Test
	 public void testTodosNegativos(){
		assertEquals(-1,Calculation.findMax(new int[]{-1,-2,-3,-4}));
	 }
	@Test
	 public void testAlternando(){
		assertEquals(4,Calculation.findMax(new int[]{-1,2,-3,4}));
	 }
}



