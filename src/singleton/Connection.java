package singleton;

import java.io.IOException;
import java.util.Properties;

public class Connection {

	private static Connection conn = new Connection();
	Properties pros = new Properties();

	private Connection() {

	}

	public static Connection getInstance() {
		return conn;
	}

	public Properties getConnectioninfo() {
		try {
			pros.load(Connection.class.getClassLoader().getResourceAsStream(
					"singleton/connection.properties"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pros;
	}
}
