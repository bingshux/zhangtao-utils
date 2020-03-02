package com.zhangtao.util;

import java.util.Date;
import static org.junit.Assert.*;
import org.junit.Test;



public class DateUtilTest {

		@Test
		public void myTest() {
			for (int i = 0; i < 10; i++) {
				 Date date = DateUtils.getRandomDate(DateUtils.parse("1949-1-1", "yyyy-MM-dd"), DateUtils.parse("2002-12-31", "yyyy-MM-dd"));
					System.out.println(DateUtils.format(date, "yyyy-MM-dd"));
			}
			
		}
}
