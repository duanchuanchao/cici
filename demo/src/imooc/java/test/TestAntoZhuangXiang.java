package imooc.java.test;

import java.util.ArrayList;
import java.util.List;

public class TestAntoZhuangXiang {
	public static void main(String[] args) {
		long t = System.currentTimeMillis();
//		Long sum = 0L;
		long sum = 0l;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println("total："+sum);
		System.out.println("processing time:"+(System.currentTimeMillis()-t)+"ms");
		/*
		 * 自动装箱和自动拆箱
		 * java中变量分为两种：基本数据类型和引用数据类型，java中有8钟基本数据类型和与每一种基础数据类型相对应的8种引用数据类型（包装类）
		 */
		List<Long> longList = new ArrayList<Long>();
		long j = 4;
		longList.add(j);//autoboxing
		long s = longList.get(0);//unboxing
	}
}
