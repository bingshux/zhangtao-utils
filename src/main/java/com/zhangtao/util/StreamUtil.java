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
 * @Description: 流处理类
 * @author: bings
 * @date: 2020年2月11日 下午3:27:41
 */
public class StreamUtil {
	//读取文件对象到list集合中 
	public static List<String > readFile2List(File file) throws FileNotFoundException{
			FileInputStream fileInputStream = new FileInputStream(file);
		return readFile2List(fileInputStream);
	}
	//读取文件地址，并根据编码，把内容放入list集合中
	public static List<String> readFile2List(String filename,String charset) throws FileNotFoundException{
		FileInputStream fileInputStream = new FileInputStream(filename);
		return readFile2List(fileInputStream,charset);
	}
	//读取InputStream对象，把其内容放入集合中
	public static List<String> readFile2List(InputStream in){
		return readFile2List(in,"utf-8");
	}
	//读取InputStream对象，并根据编码 把其内容放入集合中
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
	/**
	 * @Title: close   
	 * @Description: 批量关闭流   
	 * @param: @param autoCloseables      
	 * @return: void      
	 * @throws
	 */
	public static void close(AutoCloseable... autoCloseables ) {
		for(AutoCloseable autoCloseable:autoCloseables) {
			try {
				autoCloseable.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
