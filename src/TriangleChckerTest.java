import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleChckerTest {
	TriangleChecker1 checker = new TriangleChecker1();
	
	public void testISOSCELES1() {
		final String type=checker.check(100, 100, 1);
		assertEquals("ISOSCELES",type);
	}
	@Test
	public void testISOSCELES2() {
		final String type=checker.check(100, 100, 2);
		assertEquals("ISOSCELES",type);
	}
	@Test
	public void testEQUILATERAL1() {
		final String type=checker.check(100, 100, 100);
		assertEquals("EQUILATERAL",type);
	}
	@Test
	public void testISOSCELES3() {
		final String type=checker.check(100, 100, 199);
		assertEquals("ISOSCELES",type);
	}
	@Test
	public void testINVALID1() {
		final String type=checker.check(100, 100, 200);
		assertEquals("INVALID",type);
	}
	@Test
	public void testISOSCELES4() {
		final String type=checker.check(100, 1, 100);
		assertEquals("ISOSCELES",type);
	}
	@Test
	public void testISOSCELES5() {
		final String type=checker.check(100, 2, 100);
		assertEquals("ISOSCELES",type);
	}
	@Test
	public void testEQUILATERAL2() {
		final String type=checker.check(100, 100, 100);
		assertEquals("EQUILATERAL",type);
	}
	@Test
	public void testISOSCELES6() {
		final String type=checker.check(100, 199, 100);
		assertEquals("ISOSCELES",type);
	}
	@Test
	public void testINVALID2() {
		final String type=checker.check(100, 200, 100);
		assertEquals("INVALID",type);
	}
	@Test
	public void testISOSCELES7() {
		final String type=checker.check(1, 100, 100);
		assertEquals("ISOSCELES",type);
	}
	@Test
	public void testISOSCELES8() {
		final String type=checker.check(2, 100, 100);
		assertEquals("ISOSCELES",type);
	}
	@Test
	public void testEQUILATERAL3() {
		final String type=checker.check(100, 100, 100);
		assertEquals("EQUILATERAL",type);
	}
	@Test
	public void testISOSCELES9() {
		final String type=checker.check(199, 100, 100);
		assertEquals("ISOSCELES",type);
	}
	@Test
	public void testINVALID3() {
		final String type=checker.check(200, 100, 100);
		assertEquals("INVALID",type);
	}
	
	}
