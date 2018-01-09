package com.io;

public class EncodeDemo {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String s ="慕课ABC";
		byte[] bytes1 = s.getBytes();//转换成字节序列用的是项目默认的编码utf-8
		for(byte b:bytes1){
			//把字节（转换成了int）以16进制的方式显示
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		System.out.println();
		byte[] bytes2 = s.getBytes("gbk");
		//gbk编码中文占用2个字节，英文占用1个字节
		for(byte b:bytes2){
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		System.out.println();
		byte[] bytes3 = s.getBytes("utf-8");
		//utf-8编码中文占3个字节，英文占1个字节
		for (byte b : bytes3) {
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		
		System.out.println();
		//java是双字节编码utf-16be
		byte[] bytes4 = s.getBytes("utf-16be");
		//utf-16be 中文占2个字节，英文占2个字节
		for (byte b : bytes4) {
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		
		System.out.println();
		
		/*
		 * 当你的字节序列是某种编码时，这个时候想把字节序列变成
		 * 字符串，也需要用这种编码方式，否则就会出现乱码
		 */
		String s1 = new String(bytes4);//用项目默认的编码
		System.out.println(s1);
		String str2 = new String(bytes4,"utf-16be");
		System.out.println(str2);
		/**
		 * 文本文件，就是字节序列
		 * 可以是任意编码的字节序列
		 * 如果我们在中文机器上直接创建文本文件，那么该文本文件只认识ansi编码
		 * 联想、联这是一种巧合，他们正好符合了utf-8规则
		 */
	}

}
