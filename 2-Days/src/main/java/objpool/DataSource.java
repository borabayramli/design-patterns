package objpool;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
	
	public static DataSource instance = new DataSource();
	public List<Connection> pool = new ArrayList<Connection>();
	
	public DataSource() {
		init();
	}
	
	private void init() {
		for (int i = 0; i < 3; i++) {
			pool.add(new Connection());
		}
	}
	
	
	
	static public Connection getConnection() throws Exception {
		
		if (instance.pool.size() == 0) {
			throw new Exception();
		}
		
		Connection con = instance.pool.get(0);
		instance.pool.remove(0);
		System.out.println("con : " + con);
		
		return con;
	}

	
	static public void relase ( Connection con ) {
		if ( con != null ) {
			instance.pool.add(con);
		}
	}
	
	
}
