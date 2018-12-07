package Factory;

/*
 *人物的实现接口
 * */
public interface PersonFactory {
	
	public Boy getBoy();
	
	public Girl getGirl();
}
