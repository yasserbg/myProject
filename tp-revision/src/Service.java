import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class Service extends Thread {
	Socket sc;
	BufferedReader br;
	BufferedWriter bw;
	ServerSocket ss = null;

	public Service(Socket sc) {
		super();
		this.sc = sc;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			while(true) {
				br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
				while(true) {
					bw.write("entrez nbr1 : \r\n");
					bw.flush();
					int n1 = Integer.parseInt(br.readLine());
					bw.write("entrez nbr2 : \r\n");
					bw.flush();
					int n2 = Integer.parseInt(br.readLine());
					int somme = n1/n2;
					bw.write("la somme est : "+somme+"\r\n");
					bw.flush();
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
