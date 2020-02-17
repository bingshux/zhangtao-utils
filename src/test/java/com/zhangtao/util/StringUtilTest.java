package com.zhangtao.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {
	
	@Test
	public void testIsHttpUrl() {
		String url="abc";
		//String url="http://www.baidu.com";
		System.out.println(StringUtil.isHttpUrl(url));
	}

	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength("123456");
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText(".");
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString();
		System.out.println(string);
	}
	@Test
	public void testRandomChineseString1() {
		String string = StringUtil.randomChineseString(1000);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}
	@Test
	public void testIsPhoneNumber() {
		boolean b = StringUtil.isPhoneNumber("13133334444");
		System.out.println(b);
	}

	@Test
	public void testIsEmail() {
		fail("Not yet implemented");
	}


}
