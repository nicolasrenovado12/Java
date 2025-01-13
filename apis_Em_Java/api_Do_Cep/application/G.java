package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class  G {

		public static void main(String[] args) throws IOException {
			// https://viacep.com.br/ws/13606-325/json/

			String path = "exemplo.json";
			Scanner sc = new Scanner(System.in);
			String cep = sc.next();
			URL url = new URL("https://viacep.com.br/ws/" + cep + "/json/");
		
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setRequestMethod("GET");
			int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
            	BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            	StringBuilder informationString = new StringBuilder();
            	String a = in.readLine();
            	
            	BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
            	
            	while(a != null) {
            		buffWrite.write(a);
            	}
            	         
            	
            }
		}
	
}
