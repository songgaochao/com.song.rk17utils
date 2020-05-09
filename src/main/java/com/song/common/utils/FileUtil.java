package com.song.common.utils;

import java.io.File;

/***
 * 文件工具类
 * @author 86183
 *
 */
public class FileUtil {

	
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
	*/
	public static String getExtendName(String fileName){
		File f = new File(fileName);
		String name = f.getName();
		String substring = name.substring(name.lastIndexOf("."));		
		
		return substring;
	//TODO 实现代码
	}
	
	public static void main(String[] args) {
		String extendName = FileUtil.getExtendName("Test.txt");
		System.out.println(extendName);
	}
	
}
