package CalcPack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class calcTest {
	CalcClass CalcObj=new CalcClass();
	@Test
	public void TestSomma() {
		assertEquals(4,CalcObj.Somma(4, 2));
	}
}
