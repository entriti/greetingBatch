package birthday.reader;

import java.util.ArrayList;

import birthday.objects.Client;

public interface ReadClients {
	
	public ArrayList<Client> readClients (String file, int thisMonth, int today);
}
