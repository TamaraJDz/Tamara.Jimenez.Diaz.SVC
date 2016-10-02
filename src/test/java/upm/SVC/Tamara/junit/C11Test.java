package upm.SVC.Tamara.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.SVC.Tamara.C11;

public class C11Test {

	private C11 c11;
	
	@Before
    public void setUp() {
        c11 = new C11();
    } 
	
	@Test
	public void testM1() {
		assertEquals("m1",c11.m1());
	}

	@Test
	public void testM2() {
		assertEquals("m2",c11.m2());
	}

}
