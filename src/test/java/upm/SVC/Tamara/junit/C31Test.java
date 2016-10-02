package upm.SVC.Tamara.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.SVC.Tamara.C31;

public class C31Test {

	private C31 c31;
	
    @Before
    public void setUp() {
        c31 = new C31();
    }
	
	@Test
	public void testM1() {
		assertEquals("m1", c31.m1());
	}

	@Test
	public void testM2() {
		assertEquals("m2", c31.m2());
	}

}
