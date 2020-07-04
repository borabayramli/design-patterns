package channel;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MessageChannel {
	
	private static BlockingQueue<OrderMessage> orderMessagesQueue = new ArrayBlockingQueue<OrderMessage>(100);
	
	public static void put( OrderMessage message ) {
		orderMessagesQueue.add(message);
	}
	
	public static OrderMessage message() throws InterruptedException {
		return orderMessagesQueue.take();
	}

}
