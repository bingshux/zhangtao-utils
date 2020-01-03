package com.zhangtao.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	//获取一个月的月初 如:2019-01-01 00:00:00
	public static Date initMonth(Date date) {
		//获取一个日期类
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 1);//设置为当前日期的第一题
		c.set(Calendar.HOUR_OF_DAY, 0);//设置小时
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	//返回一个月的月末
	//思路:让月加1,在编程月初,最后减去1秒
	public static Date endMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		//让月份+1	
		c.set(Calendar.MONTH, 1);
		//让月份变成月初
		Date initMonth = initMonth(c.getTime());
		c.setTime(initMonth);
		c.set(Calendar.SECOND, -1);
		return c.getTime();
	}
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: 使用日历类 计算     ：根据出生日期算年龄
	 * @param date
	 * @return
	 * @return: int
	 */
	//2020-02-02    2000-03-03 
	public static int getAgeByBirthday(Date date) {
		//从系统时间获取日历类
		Calendar c = Calendar.getInstance();
		//获取系统的年
		int s_year = c.get(Calendar.YEAR);
		//获取系统的月
		int s_month = c.get(Calendar.MONTH);
		//获取系统的日
		int s_day	= c.get(Calendar.DAY_OF_MONTH);
		//用传入的日期初始化一个日期类
		c.setTime(date);
		//获取出生日期的年
		int b_year=c.get(Calendar.YEAR);
		//获取出生日期的月
		int b_month=c.get(Calendar.MONTH);
		//获取出生日期的日
		int b_day = c.get(Calendar.DAY_OF_MONTH);
		//用系统的年-出生日期的年
		int age=s_year-b_year;
		//如果系统月小于出生月年龄减一
		if(s_month<b_month)
			age--;
		//如果系统月和初始月一致并且系统日小于出生日 年龄减一
		if(s_month==b_month && s_day<b_day)
			age--;
		return age;
	}
	 /**
     * 
     * @Title: randomDate 
     * @Description: 随机返回一个在start--end 之间的日期
     * @param start
     * @param end
     * @return
     * @return: Date
     */
	public static Date randomDate(Date start,Date end) {
		//获取开始日期的毫秒数
		long t1 = start.getTime();
		//获取结束日期的毫秒数
		long t2 = end.getTime();
		
		long t =(long) ((Math.random() * (t2-t1)+1) +t1);
		
		return new Date(t);
	}
}
