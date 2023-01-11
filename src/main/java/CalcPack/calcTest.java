package CalcPack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class calcTest {
	CalcClass CalcObj=new CalcClass();
	@Test
	public void TestSomma()
	{
		assertEquals(4,CalcObj.Somma(4, 2));
	}

	@Test
	public void TestDifferenza()
	{
		assertEquals(4,CalcObj.Differenza(4, 2));
	}
	@Test
	public void TestProdotto()
	{
		assertEquals(4,CalcObj.Prodotto(4, 2));
	}
	@Test
	public void TestDivisione()
	{
		assertEquals(4,CalcObj.Divisione(4, 2));
	}
	@Test
	public void TestPotenza()
	{
		assertEquals(4,CalcObj.Potenza(4, 2));
	}
	@Test
	public void TestMedia()
	{
		assertEquals(4,CalcObj.Media(4, 2));
	}

}
