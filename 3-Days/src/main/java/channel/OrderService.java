package channel;

public class OrderService {

	public void newOrder( Order order ) {
		OrderMessage message = new OrderMessage(order);
		MessageChannel.put(message);
	}
	
}
