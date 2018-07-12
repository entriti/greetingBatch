package birthday.main;

import java.util.ArrayList;

import birthday.objects.Client;
import birthday.processor.BirthdaySender;
import birthday.processor.impl.mailImpl;
import birthday.reader.ReadClients;
import birthday.reader.impl.ReaderFlatFile;
import birthday.utils.Dates;

public class Main {
	
	public static void main(String[] args) {
	
		// Instance necessary variables
		ReadClients reader = new ReaderFlatFile();
		BirthdaySender birth = new mailImpl();
		
		//read clients in the file and extract a list whose is his birthday today
		//gestion de fechas separada, para evitar interacciones
		ArrayList<Client> clientList = reader.readClients("/stakeholders", Dates.getThisMonth(), Dates.getToday());
		
		//send and email
		for (Client client : clientList) {
			birth.greetingBirthday(client,"/mail");
		}
	}

}
