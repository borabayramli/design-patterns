package channel;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private long id;
	private Customer customer;
	private List<Item> items = new ArrayList<Item>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
	

}
