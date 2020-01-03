package com.zhangtao.util;

import java.util.Arrays;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i < 10	; i++) {
			int random = RandomUtil.random(1, 3);
			System.out.println(random);
		}
	}

	@Test
	public void testSubRandom() {
		int[] s = RandomUtil.subRandom(1, 10, 3);
			System.out.println(Arrays.toString(s));		
	}

	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testRandomString() {
		String str = RandomUtil.randomString(5);
		System.out.println(str);
	}

}
