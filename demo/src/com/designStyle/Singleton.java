package com.designStyle;
/** 
 * 懒加载模式，但是却存在致命的问题。当有多个线程并行调用 getInstance() 的时候，就会创建多个实例。也就是说在多线程下不能正常工作。
 * @author  duanchuanchao1
 * @date 创建时间：2017-7-13 下午5:17:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Singleton {
	
	private static Singleton instance;

	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}

}
