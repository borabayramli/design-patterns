package java8news;

import java.util.List;
import java.util.Random;

public class StreamAndParalel {

	public static void main(String[] args) {
		
		
		List<DataClass> ls = Model.result(3000000);
		Long start = 0l;
		Long end = 0l;
		Long between = 0l;
		
		start = System.currentTimeMillis();
		for (int i = 0; i < ls.size(); i++) {
			if ( ls.get(i).getId() > 200 ) {
				System.out.println( new Random().nextInt(100) );
			}
		}
		end = System.currentTimeMillis();
		Long nbetween = end - start;
		//System.out.println("Normal for : " + between);
		
		
		// Stream Api
		start = System.currentTimeMillis();
		ls.stream()
		.filter( ( item ) -> item.getId() > 200 )
		.forEach( item -> {
			System.out.println( new Random().nextInt(100) );
		});
		System.out.println("Normal for : " + between);
		end = System.currentTimeMillis();
		between = end - start;
		
		
		
		
		// Paralel Stream Api
		start = System.currentTimeMillis();
		ls.parallelStream()
		.filter( ( item ) -> item.getId() > 200 )
		.forEach( item -> {
			System.out.println( new Random().nextInt(100) );
		});
		System.out.println("Normal for : " + nbetween);
		System.out.println("Stream For : " + between);
		end = System.currentTimeMillis();
		between = end - start;
		System.out.println("Paralel Stream for : " + between);
		
		
		// Thread
		Runnable rn = () -> {
			for(;;)
				System.out.println("For Call");
		};
		new Thread(rn,"Th1").start();
		
		
		// Thread
		Runnable rn1 = () -> {
			for(;;)
				System.out.println("For 2 Call");
		};
		new Thread(rn1,"Th2").start();
		
		
	}

}
