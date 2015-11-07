package comunicazione;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connection {

	private HttpURLConnection connection;
	private static Connection object = new Connection();

	private Connection() {

	}

	public static Connection getConnection() {
		return object;
	}

	// Questo metodo invia un comando attraverso la rete ad Arduino
	public String inviaComando(String ip, String command) {
		try {
			URL url = new URL("http://" + ip + "/?" + command);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setDoInput(true);
			connection.setDoOutput(true);
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			String line;
			StringBuffer response = new StringBuffer();
			while ((line = rd.readLine()) != null) {
				response.append(line);
			}
			rd.close();
			return response.toString();
		} catch (Exception e) {
			return "Errore nella comunicazione";
		}
	}

}
