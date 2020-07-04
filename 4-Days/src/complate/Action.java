package complate;

import java.util.concurrent.CompletableFuture;

import org.jsoup.Jsoup;

public class Action {
	
	CompletableFuture<Void> ft1 = CompletableFuture.runAsync(() -> {
		try {
			String url = "https://www.tcmb.gov.tr/kurlar/today.xml";
			String data = Jsoup.connect(url).get().toString();
			System.out.println(data);
			/*
			for (int i = 0; i < 10; i++) {
				System.out.println("ft1 call : " + i);
				Thread.sleep(500);
			}
			*/
		} catch (Exception e) {
			System.err.println("ft1 Error : " + e);
		}
	});
	
	
	CompletableFuture<Void> ft2 = CompletableFuture.runAsync(() -> {
		try {
			String url = "http://jsonbulut.com/json/product.php?ref=5380f5dbcc3b1021f93ab24c3a1aac24&start=0";
			String data = Jsoup.connect(url).ignoreContentType(true).timeout(30000).get().body().text();
			System.out.println(data);
			/*
			for (int i = 0; i < 20; i++) {
				System.out.println("ft2 call : " + i);
				Thread.sleep(500);
			}*/
		} catch (Exception e) {
			System.err.println("ft2 Error : " + e);
		}
	});
	
	
	public void call() {
		System.out.println("Action Thread Start");
		CompletableFuture<Void> allOf = CompletableFuture.allOf(ft1,ft2);
		allOf.join();
		System.out.println("Action Thread End");
	}

}
