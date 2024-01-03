import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}

	
	@Test
	void add()
	{
		Project objAdd = new Project();
		int expected = 3;
		int actual = objAdd.add(2, 1);
		assertEquals(expected, actual);
	}
	
	
	@Test
	void mul()
	{
		Project objMull = new Project();
		int expected = 3;
		int actual = objMull.mul(3,1);
		assertEquals(expected, actual);
	}
	
	
	@Test
	void div()
	{
		Project objDiv = new Project();
		int expected = 3;
		int actual = objDiv.add(2, 1);
		assertEquals(expected, actual);
	}
}
