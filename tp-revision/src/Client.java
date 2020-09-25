import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub12
		Socket sc;
		BufferedReader br, brKey;
		BufferedWriter bw;
		String repReseau;
		try {
			sc = new Socket("localhost", 99);
			br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			brKey = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
			while(true) {
				
				System.out.println(br.readLine());
				int n = Integer.parseInt(brKey.readLine());
				bw.write(n+"\r\n");
				bw.flush();
				
				//System.out.println(br.readLine());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
