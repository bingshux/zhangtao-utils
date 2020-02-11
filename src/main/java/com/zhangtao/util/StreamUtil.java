package com.zhangtao.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @ClassName: StreamUtil 
 * @Description: ��������
 * @author: bings
 * @date: 2020��2��11�� ����3:27:41
 */
public class StreamUtil {
	//��ȡ�ļ�����list������
	public static List<String > readFile2List(File file) throws FileNotFoundException{
			FileInputStream fileInputStream = new FileInputStream(file);
		return readFile2List(fileInputStream);
	}
	//��ȡ�ļ���ַ�������ݱ��룬�����ݷ���list������
	public static List<String> readFile2List(String filename,String charset) throws FileNotFoundException{
		FileInputStream fileInputStream = new FileInputStream(filename);
		return readFile2List(fileInputStream,charset);
	}
	//��ȡInputStream���󣬰������ݷ��뼯����
	public static List<String> readFile2List(InputStream in){
		return readFile2List(in,"utf-8");
	}
	//��ȡInputStream���󣬲����ݱ��� �������ݷ��뼯����
	public static List<String> readFile2List(InputStream inputStream,String charset){
		List<String> list= new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		String str=null;
		try {
			while((str=reader.readLine())!=null) {
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
