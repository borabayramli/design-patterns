package channel;

public class OrderMessage {
	
	private Order order;

	
	public Order getOrder() {
		return order;
	}



	public void setOrder(Order order) {
		this.order = order;
	}



	public OrderMessage( Order order ) {
		this.order = order;
	}

}
