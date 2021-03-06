package com.zhangtao.util;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	/**
	 * У�鴫��Ĳ����Ƿ�Ϊurl
	 * @param param
	 * @return
	 */
	public static boolean isHttpUrl(String param) {
		 URL url;  
		 try {  
	         url = new URL(param);
	        url.openStream();  
	         return true; 
	    } catch (Exception e1) {  
	         System.out.println("���Ӵ򲻿�!");  
	       
	    }  
		 return false;
		
	}
	

	
	/*
	* �������ܣ������������ַ�����ȡһ��ֵ�����ں�����url��ַ����ȡIDֵ��
	* �����ڡ�http://news.cnstock.com/news,yw-201908-4413224.htm���ѡ�4413224����ȡ������
	*/
	public static String getLastNumber(String url){
		
		//String regex ="(\\d+)";
		String regex ="[0-9]+(?=[^0-9]*$)";
	    //�������
		Pattern c = Pattern.compile(regex);
		//ƥ��
		Matcher m = c.matcher(url);
		if(m.find()) {
			return m.group();
		}
		return null;
		
		
		
	}
	//����1���ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)Ҳ��ûֵ (5��)
	public static boolean hasLength(String src){
		
		return src!=null&&src.length()>0;
	
	}
	//����2���ж�Դ�ַ���	
	public static boolean hasText(String src){
		return src!=null&&src.trim().length()>0;
	
	}
	//����3�����ز���1�����ĺ����ַ������ַ���������GB2312(�൱�����ļ���)��Χ�ڣ����硰��ѽ����(5��)
	public static String randomChineseString(){
		String str=null;
		int highPos,lowPos;
		Random random = new Random();
		highPos=(176+Math.abs(random.nextInt(39)));//���룬0xA0��ͷ���ӵ�16����ʼ����0xB0=11*16=176,16~55һ�����֣�56~87��������
		random=new Random();
		lowPos=161+Math.abs(random.nextInt(94));//λ�룬0xA0��ͷ����Χ��1~94��
		byte[] bArr=new byte[2];
		bArr[0]=(new Integer(highPos)).byteValue();
		bArr[1]=(new Integer(lowPos)).byteValue();
		try {
			str=new String(bArr,"GB2312");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}
	//����3�����ز���length�����ĺ����ַ������ַ���������GB2312(�൱�����ļ���)��Χ�ڣ����硰��ѽ����(5��)
	public static String randomChineseString(int length){
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(randomChineseString());
		}
		return sb.toString();
	}
	//����4������������������������ʵ�տ�ͷ���ټ����ڡ��������ټ��ա����ʹ��1-2���������(8��)���ڲ�����randomChineseString()����(3��)������ʾ��������ѽ��������ŷ����Ϊ��
	public static String generateChineseName(){
		String[] str= {"��","Ǯ","��","��","��","��","֣","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ʩ","��","��","��","��","��","��","κ","��","��","��","л","��","��","��","ˮ","�","��","��","��","��","��","��","��","��","��","³","Τ","��","��","��","��","��","��","��","��","Ԭ","��","ۺ","��","ʷ","��","��","��","�","Ѧ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ʱ","��","Ƥ","��","��","��","��","��","Ԫ","��","��","��","ƽ","��","��","��","��","��","Ҧ","��","տ","��","��","ë","��","��","��","��","��","�","��","��","��","��","̸","��","é","��","��","��","��","��","��","ף","��","��","��","��","��","��","ϯ","��","��","ǿ","��","·","¦","Σ","��","ͯ","��","��","÷","ʢ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","֧","��","��","��","¬","Ī","��","��","��","��","��","��","Ӧ","��","��","��","��","��","��","��","��","��","��","��","��","ʯ","��","��","ť","��","��","��","��","��","��","½","��","��","��","��","�","��","��","�L","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ɽ","��","��","��","�","��","ȫ","ۭ","��","��","��","��","��","��","��","��","��","��","��","б","��","��","��","��","��","��","��","ղ","��","��","Ҷ","��","˾","��","۬","��","��","��","ӡ","��","��","��","��","ۢ","��","��","��","��","��","��","׿","��","��","��","��","��","��","��","��","��","��","˫","��","ݷ","��","��","̷","��","��","��","��","��","��","��","Ƚ","��","۪","Ӻ","�S","�","ɣ","��","�","ţ","��","ͨ","��","��","��","��","ۣ","��","��","ũ","��","��","ׯ","��","��","��","��","��","Ľ","��","��","ϰ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","»","��","��","ŷ","�","��","��","ε","Խ","��","¡","ʦ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ɳ","ؿ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","Ȩ","��","��","��","��","��","��","��","��","��","��","۳","Ϳ","��","��","˧","��","��","��","��","��","��","��","Ĳ","��","٦","��","��","ī","��","��","��","��","��","��","١","��ٹ","˾��","�Ϲ�","ŷ��","�ĺ�","���","����","����","����","�ʸ�","ξ��","����","�̨","��ұ","����","���","����","����","̫��","����","����","����","��ԯ","���","����","����","����","Ľ��","����","����","˾ͽ","˾��","آ��","˾��","��","��","�ӳ�","���","��ľ","����","����","���","����","����","����","�ذ�","�й�","�׸�","����","�θ�","����","����","����","����","��","��","����","΢��","����","����","����","����","�Ϲ�"};
		//��ȡ�������
		String firstName=str[RandomUtil.random(0, str.length-1)];
		//��ȡ�������
		String lastName=randomChineseString(RandomUtil.random(1, 2));
		
		return firstName+lastName;
	
	}
	//����5 �ж�������Ƿ����ֻ���
	public static boolean isPhoneNumber(String src) {
		//���ж��Ƿ���ֵ
		if(hasText(src)) {
			//�����й��ֻ��ŵĹ���
			String reg="\\1[3|5|7|8|9]\\{9}";
			return src.matches(reg);
		}
		return false;
	}
	// ����6 �ж��Ƿ������� ��ĸ�����»��߿�ͷ @ ��ĸ�����»��� . ��ĸ���� number2000@163.com
	public static boolean isEmail(String src) {
		if(hasText(src)) {
			//��������
			String reg = "\\w+\\@+\\.+\\w+";
			return src.matches(reg);
		}
		return false;
	}
	/**
	 * @Title: isLetter   
	 * @Description: �ж��Ƿ�ȫΪ��ĸ   
	 * @param: @param str
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	public static boolean isLetter(String str) {
		if(hasText(str)) {
			return false;
		}
		str = str.toLowerCase();
		String regex = "[a-z]+";
		return str.matches(regex);
	}
	
}
