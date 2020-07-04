package java8news;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {
	
	static List<DataClass> ls = new ArrayList<DataClass>();
	public static List<DataClass> result(int size) {
		for (int i = 0; i < size; i++) {
			DataClass dt = new DataClass();
			dt.setId(i);
			dt.setTitle("Title : " + i);
			dt.setStatu(  i > 1000 ? true : false );
			dt.setRd(new Random());
			ls.add(dt);
		}
		return ls;
	}
	

}
