package upm.SVC.Tamara.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import upm.SVC.Tamara.C22;

public class C22Test {

	private C22 c22;
	
	@Test
	public void testMA() {
		assertEquals("mA", c22.mA());
	}

}
