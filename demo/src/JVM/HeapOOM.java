package JVM;

import java.util.ArrayList;
import java.util.List;

/**
 * @Described：堆内存溢出探究
 * VM Args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError  -XX:+PrintGCDetails
 * @author duanchuanchao1
 *
 */
public class HeapOOM {

	static class OOMObject{
		
	}
	
	public static void main(String[] args){
		List<OOMObject> list = new ArrayList<OOMObject>();
		
		while (true) {
			list.add(new OOMObject());
			
		}
	}
}
