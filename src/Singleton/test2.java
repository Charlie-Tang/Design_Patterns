package Singleton;

import java.util.HashMap;
import java.util.Map;

public class test2 {
	
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String,String>();
		map.put("tom", "alone");
		map.put("mary", "noalone");
		
		test2 test2 = new test2();
		test2.testLambda(map);
	}
	
	public void testLambda(Map<String, String> map) {
        map.forEach((key, value) -> {
            System.out.println("key: "+ key + "  value: " + value );
        });
	
	}	
}