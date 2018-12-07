package ChainofResponsibility.Customer;

import java.util.Random;

import ChainofResponsibility.handler.PriceHandler;

public class Customer {
	
	private static PriceHandler priceHandler;
	
	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}

	public void requestDiscount(float discount) {
		priceHandler.processDiscount(discount);
	}
	
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setPriceHandler(priceHandler.createPriceHandler());
		
		Random random = new Random();
		
		for (int i = 1; i < 100; i++) {
			System.out.print(i+":");
			
			customer.requestDiscount(random.nextFloat());
		}
	}
}
