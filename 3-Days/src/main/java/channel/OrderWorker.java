package channel;

public class OrderWorker implements Runnable {

	@Override
	public void run() {
		
		try {
			
			while(true) {
				
				OrderMessage message = MessageChannel.message();
				System.out.println( "Message new orderID: " + message.getOrder().getId() );
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			System.err.println("Thread Error : " + e);
		}
		
	}
	
	

}
