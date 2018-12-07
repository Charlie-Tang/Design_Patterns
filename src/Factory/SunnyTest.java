package Factory;

public class SunnyTest {
	public static void main(String[] args) {
		
		
//		HairInterface left = new LeftHair();
//		left.draw();
		
//		HairFactory factory = new HairFactory();
//		HairInterface left = factory.getHair("left");
//		left.draw();
		
		
//		HairInterface left = factory.getHairByClass("com.sunny.project.LeftHair");
		
//		HairInterface hair = factory.getHairByClassKey("in");
//		hair.draw();
		
		PersonFactory factory = new MCFactory();
		Girl girl = factory.getGirl();
		girl.drawWomen();
		
		PersonFactory factory2 = new HNFactory();
		Boy boy = factory2.getBoy();
		boy.drawMan();
	}
}
