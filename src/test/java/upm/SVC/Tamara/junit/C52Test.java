package upm.SVC.Tamara.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.SVC.Tamara.C52;

public class C52Test {
	private C52 c52;
	
    @Before
    public void setUp() {
    	c52 = new C52();
    }
    
	@Test
	public void testMA() {
		assertEquals("mA", c52.mA());
	}

}
