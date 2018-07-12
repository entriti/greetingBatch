package birthday.reader.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import birthday.objects.Client;
import birthday.reader.ReadClients;

public class ReaderFlatFile implements ReadClients {
	
	public ArrayList<Client> readClients (String file, int thisMonth, int today) {
		//TODO: Cambiar hardcode por un properties
		InputStream s = ReaderFlatFile.class.getResourceAsStream(file);
	    InputStreamReader reader = new InputStreamReader(s);
	    BufferedReader Buff = new BufferedReader (reader);
	    ArrayList<Client> clientsList = new ArrayList();
	
	    String line = null;
	    // keep reading till readLine returns null
	    try {
			while ((line = Buff.readLine()) != null) {
				String clientArray[] = line.split(",");
				String birthday[] = clientArray[2].split("/");

				int day = Integer.parseInt(birthday[2]);
				int month = Integer.parseInt(birthday[1]);
				if ( thisMonth == month && today == day )
				{
					Client client = new Client(clientArray[0],clientArray[1],clientArray[2],clientArray[3]);
					clientsList.add(client);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return clientsList;
}

}
