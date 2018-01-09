package com.io;

import java.io.File;
import java.io.IOException;

//列出File的一些常用操作比如过滤、遍历等操作
public class FileUtils {

	/**
	 * 列出指定目录下（包括其子目录）的所有文件
	 * @throws IOExcepton
	 */
	public static void listDirectory(File dir) throws IOException{
		if(!dir.exists()){
			throw new IllegalArgumentException("目录："+dir+"不存在.");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"不是目录");
		}
		String[] filenames = dir.list();//返回的字符串数组 直接子的名称，不包含子目录下的内容
		for (String string : filenames) {
			System.out.println(dir+"\\"+string);
		}
	}
}
