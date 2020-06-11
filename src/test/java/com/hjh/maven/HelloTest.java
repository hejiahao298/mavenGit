package com.hjh.maven;

import org.junit.Test;

public class HelloTest {
    
	@Test
	public void testHello() {
		testMaven test = new testMaven();
		String maven = test.Hello("Maven");
		System.out.println(maven);
		
	}
}
