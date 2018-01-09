package MainTest;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	
	public static void main(String[] args){
		Map<Long,Object> newMap = new HashMap<Long,Object>();
		newMap.put(1l,"你好！");
		newMap.put(1l,"haha");
		System.out.println(newMap.get(1l));
	}
	
}
