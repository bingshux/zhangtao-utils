package com.zhangtao.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testInitMonth() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DateUtil.initMonth(new Date());
		System.out.println(df.format(date));
		

		
	}

	@Test
	public void testEndMonth() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
		Date date = DateUtil.endMonth(new Date());
		System.out.println(df.format(date));
	}

	@Test
	public void testGetAgeByBirthday() {
		
	}

	@Test
	public void testRandomDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (int i = 0; i < 1000; i++) {
			Date date = DateUtil.randomDate(new Date(0), new Date());
			System.out.println(df.format(date));

		}
	}

}
