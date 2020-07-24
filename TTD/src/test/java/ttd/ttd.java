package ttd;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class ttd {
	project p;
	@Before
	public void setup()
	{
		p=new project();
	}
	@Test
	public void test() {
		assertEquals("BCD",p.input("ABCD"));
	}
	@Test
	public void test1() {
		assertEquals("CD",p.input("AACD"));
	}
	@Test
	public void test2() {
		assertEquals("BCD",p.input("BACD"));
	}
	@Test
	public void test3() {
		assertEquals("BBAA",p.input("BBAA"));
	}
	@Test
	public void test4() {
		assertEquals("BAA",p.input("AABAA"));
	}
}
