package upm.SVC.Tamara.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.SVC.Tamara.C21;

public class C21Test {

	private C21 c21;
	
    @Before
    public void setUp() {
        c21 = new C21();
    }
	
	@Test
	public void testM1() {
		assertEquals("m1", c21.m1());
	}

	@Test
	public void testM2() {
		assertEquals("m2", c21.m2());
	}

}
