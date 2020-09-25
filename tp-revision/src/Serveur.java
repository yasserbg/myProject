import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket sc;
		ServerSocket ss = null;
		System.out.println("----Serveu demarer-----");
		
		try {
			ss = new ServerSocket(99);
			while(true) {
			sc = ss.accept();
				Service service = new Service(sc);
				service.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
