package upm.SVC.Tamara.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.SVC.Tamara.C32;

public class C32Test {

	private C32 c32;
	
    @Before
    public void setUp() {
        c32 = new C32();
    }
	
	@Test
	public void testMA() {
		assertEquals("mA", c32.mA());
	}

}
