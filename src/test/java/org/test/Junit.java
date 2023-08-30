package org.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit {
	@Test
	public void tc1() {
		System.out.println("Sariha");
	}
	
	@Test
	public void tc3() {
		System.out.println("kalai");
	}
	@Test
	public void tc2() {
		System.out.println("prana");
	}
	
	@Test
	public void tc8() {
		Assert.assertTrue(false);
		System.out.println("hari");
	}
	
	@BeforeClass
	public static void bc() {
		System.out.println("welcome");
	}
	@AfterClass
	public static void af() {
		System.out.println("bye");
	}
	@Before
	public void tc6() {
		System.out.println("hi ");
	}
	@After
	public void tc7() {
		System.out.println("hi all");
	}

}
