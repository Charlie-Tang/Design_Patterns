package ChainofResponsibility.handler;
//价格处理人，负责处理客户折扣申请
public abstract class PriceHandler {
	
	//直接后继 用于传递请求
	protected PriceHandler successor;

	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}


	//处理折扣请求
	public abstract void processDiscount(float discount);

	
	//创建PriceHandler的工厂方法
	public static PriceHandler createPriceHandler() {
		
		PriceHandler sales = new Sales();
		PriceHandler manager = new Manager();
		PriceHandler dir = new Director();
		PriceHandler vp = new VicePresident();
		PriceHandler ceo = new CEO();
		
		sales.setSuccessor(manager);
		manager.setSuccessor(dir);
		dir.setSuccessor(vp);
		vp.setSuccessor(ceo);

		return sales;
	}
	
}
