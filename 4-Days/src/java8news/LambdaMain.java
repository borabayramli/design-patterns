package java8news;

import java.util.List;

public class LambdaMain {

	public static void main(String[] args) {
		
		// Normal for : 11309
		// Lambda for : 11741
		
		List<DataClass> ls = Model.result(2000000);
		Long start = 0l;
		Long end = 0l;
		Long between = 0l;
		
		start = System.currentTimeMillis();
		for (int i = 0; i < ls.size(); i++) {
			String title = ls.get(i).getTitle();
			int rd = ls.get(i).getRd().nextInt(100);
			//System.out.println(ls.get(i).getTitle());
		}
		end = System.currentTimeMillis();
		between = end - start;
		System.out.println("Normal for : " + between);
		
		
		//lambda
		start = System.currentTimeMillis();
		ls.forEach( item -> {
			String title = item.getTitle();
			int rd = item.getRd().nextInt(100);
			System.out.println(item.getTitle());
		});
		end = System.currentTimeMillis();
		between = end - start;
		System.out.println("Lambda for : " + between);
	}

}
