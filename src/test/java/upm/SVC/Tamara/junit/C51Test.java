package upm.SVC.Tamara.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.SVC.Tamara.C51;

public class C51Test {

	private C51 c51;
	
    @Before
    public void setUp() {
    	c51 = new C51();
    }
	@Test
	public void testM1() {
		assertEquals("m1", c51.m1());
	}

	@Test
	public void testM2() {
		assertEquals("m2", c51.m2());
	}

}
