package com.zhangtao.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	//��ȡһ���µ��³� ��:2019-01-01 00:00:00
	public static Date initMonth(Date date) {
		//��ȡһ��������
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 1);//����Ϊ��ǰ���ڵĵ�һ��
		c.set(Calendar.HOUR_OF_DAY, 0);//����Сʱ
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	//����һ���µ���ĩ
	//˼·:���¼�1,�ڱ���³�,����ȥ1��
	public static Date endMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		//���·�+1	
		c.set(Calendar.MONTH, 1);
		//���·ݱ���³�
		Date initMonth = initMonth(c.getTime());
		c.setTime(initMonth);
		c.set(Calendar.SECOND, -1);
		return c.getTime();
	}
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: ʹ�������� ����     �����ݳ�������������
	 * @param date
	 * @return
	 * @return: int
	 */
	//2020-02-02    2000-03-03 
	public static int getAgeByBirthday(Date date) {
		//��ϵͳʱ���ȡ������
		Calendar c = Calendar.getInstance();
		//��ȡϵͳ����
		int s_year = c.get(Calendar.YEAR);
		//��ȡϵͳ����
		int s_month = c.get(Calendar.MONTH);
		//��ȡϵͳ����
		int s_day	= c.get(Calendar.DAY_OF_MONTH);
		//�ô�������ڳ�ʼ��һ��������
		c.setTime(date);
		//��ȡ�������ڵ���
		int b_year=c.get(Calendar.YEAR);
		//��ȡ�������ڵ���
		int b_month=c.get(Calendar.MONTH);
		//��ȡ�������ڵ���
		int b_day = c.get(Calendar.DAY_OF_MONTH);
		//��ϵͳ����-�������ڵ���
		int age=s_year-b_year;
		//���ϵͳ��С�ڳ����������һ
		if(s_month<b_month)
			age--;
		//���ϵͳ�ºͳ�ʼ��һ�²���ϵͳ��С�ڳ����� �����һ
		if(s_month==b_month && s_day<b_day)
			age--;
		return age;
	}
	 /**
     * 
     * @Title: randomDate 
     * @Description: �������һ����start--end ֮�������
     * @param start
     * @param end
     * @return
     * @return: Date
     */
	public static Date randomDate(Date start,Date end) {
		//��ȡ��ʼ���ڵĺ�����
		long t1 = start.getTime();
		//��ȡ�������ڵĺ�����
		long t2 = end.getTime();
		
		long t =(long) ((Math.random() * (t2-t1)+1) +t1);
		
		return new Date(t);
	}
}
