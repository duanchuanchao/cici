package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//了解构造函数的情况，查帮助
		File file = new File("D:\\javaio\\imooc");
//		File file1 = new File("d:"+File.separator);
//		System.out.println(file.exists());
		if(!file.exists())
			file.mkdir();//file.mkdirs();创建多级目录
		else
			file.delete();
		//是否是一个目录 如果是目录返回true,如果不是目录or目录不存在返回的false
		System.out.println(file.isDirectory());
		//是否是一个文件
		System.out.println(file.isFile());
		
//		File file2 = new File("d:\\javaio\\日记1.txt");
		File file2 = new File("d:\\javaio","日记1.txt");
		if(!file2.exists())
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			file2.delete();
		//常用的File对象的API
		System.out.println(file);//file.toString的内容
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file2.getName());
		System.out.println(file.getParent());
		System.out.println(file2.getParent());
		System.out.println(file.getParentFile().getAbsolutePath());
	}

}
