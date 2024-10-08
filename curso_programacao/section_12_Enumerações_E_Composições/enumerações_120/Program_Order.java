package enumerações_120;

import java.util.Date;

public class Program_Order {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);
		System.out.println(order.toString());
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		int pu = 33;
		int xa = 33;
		

		
		for(int i=2;i<90; i++) {
			int na = (pu + xa) * (i * i);
			System.out.println(na);
		}
		
		
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
		
		
		
	}
	
}
