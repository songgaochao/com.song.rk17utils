package com.song.common.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * 流处理工具类
 * @author 86183
 *
 */
public class StreamUtil {

	
	/*
	* 方法1：批量关闭流，参数能传入无限个。(10分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	@SuppressWarnings("resource")
	public static String closeAll(){
		
		Scanner scanner = new Scanner(System.in);
		String next = scanner.next();
		
		scanner.close();
		return next;
		
	//TODO 实现代码
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
	*/
	@SuppressWarnings("resource")
	public static BufferedWriter readTextFile(String src) throws Throwable{
		
		FileOutputStream stream = new FileOutputStream(src);
		
		OutputStreamWriter ouwriter = new OutputStreamWriter(stream,"utf-8");
		
		BufferedWriter writer = new BufferedWriter(ouwriter);
		
		return writer;
	//TODO 实现代码
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	@SuppressWarnings("resource")
	public static String readTextFile(File txtFile) throws Throwable{
		
		String textPath="";
		
		File file = new File(textPath);
		
		StringBuffer sb = new StringBuffer();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		boolean s;
		
		while (s =br.readLine() != null) {
			sb.append(s+"/n");
			
		}
		
		String str = sb.toString();
		br.close();
		return str;
	//TODO 实现代码
	}
}
