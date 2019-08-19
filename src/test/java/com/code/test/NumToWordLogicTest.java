package com.code.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumToWordLogicTest {
	
	@Test
	public void testNumToWordConverterScenario1(){
		NumToWordLogic numObj = new NumToWordLogic();
		assertEquals("Three Hundred and FortyFive".trim().toLowerCase(), numObj.numToWordConverter("345").trim().toLowerCase());
		
	}
	
	@Test
	public void testNumToWordConverterScenario2(){
		NumToWordLogic numObj = new NumToWordLogic();
		assertEquals("Two Hundred and SeventyFive Thousand".trim().toLowerCase(), numObj.numToWordConverter("275000").trim().toLowerCase());
		
	}
	
	@Test
	public void testNumToWordConverterScenario3(){
		NumToWordLogic numObj = new NumToWordLogic();
		assertEquals("One Hundred and Eleven Million Two Hundred and Fifteen Thousand Seven Hundred and EightyNine".trim().toLowerCase(), numObj.numToWordConverter("111215789").trim().toLowerCase());
		
	}
	
	@Test
	public void testNumToWordConverterScenario4(){
		NumToWordLogic numObj = new NumToWordLogic();
		assertEquals("Two Hundred and Three".trim().toLowerCase(), numObj.numToWordConverter("203").trim().toLowerCase());
		
	}
	
	@Test
	public void testNumToWordConverterScenario5(){
		NumToWordLogic numObj = new NumToWordLogic();
		assertEquals("Three".trim().toLowerCase(), numObj.numToWordConverter("003").trim().toLowerCase());
		
	}

}
