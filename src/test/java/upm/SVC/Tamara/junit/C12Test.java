package upm.SVC.Tamara.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.SVC.Tamara.C12;

public class C12Test {

	private C12 c12;
	
	@Before
    public void setUp() {
        c12 = new C12();
    } 
	
	@Test
	public void testMA() {
		assertEquals("mA",c12.mA());
	}

}
