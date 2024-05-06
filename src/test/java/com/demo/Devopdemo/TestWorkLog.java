package com.demo.Devopdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWorkLog {

WorkLog w1 = new WorkLog();
	
	@Test
    public void testAddLog1() {
		assertEquals("Added Log For Abishek", w1.addToLog("Abishek") );
	}
	
	@Test
    public void testAddLog2() {
		assertEquals("Added Log For Abinaya", w1.addToLog("Abinaya") );
	}
	
	@Test
    public void testAddLogins1() {
		assertEquals("Added Login For Ram", w1.addLogins("Ram") );
	}
	
	@Test
    public void testAddLogins2() {
		assertEquals("Added Login For Raju", w1.addLogins("Raju") );
	}

}
