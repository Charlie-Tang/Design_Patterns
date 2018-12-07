package Factory;

import java.util.Map;
import java.util.Properties;

public class HairFactory {
	
	public HairInterface getHair(String key)
	{
		if ("left".equals(key)) {
			return new LeftHair();
		}
		
		if ("right".equals(key)) {
			return new RightHair();
		}
		
		return null;
	}
	/*
	 *根据类的名称来生成各个工厂类
	 * 
	 */
	public HairInterface getHairByClassKey(String key)
	{
		try {
			Map<String, String> map = new PropertiesReader().getProperties();
			HairInterface hair = (HairInterface)Class.forName(map.get(key)).newInstance();
			return hair;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
}
