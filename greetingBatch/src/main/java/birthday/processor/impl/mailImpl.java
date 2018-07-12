package birthday.processor.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import birthday.objects.Client;
import birthday.processor.BirthdaySender;
import birthday.reader.impl.ReaderFlatFile;

public class mailImpl implements BirthdaySender {
	
	public void greetingBirthday(Client client, String template) {
		
		InputStream s = ReaderFlatFile.class.getResourceAsStream(template);
        InputStreamReader reader = new InputStreamReader(s);
        BufferedReader buff = new BufferedReader (reader);

        String line = "";
        String mail = "";
        // keep reading till readLine returns null
			try {
				//Se podria optimizar para que solo se reemplazase la linea del name.
				while ((line = buff.readLine()) != null) {
					if (line.contains("@"))
					{
						mail += line.replace("@name", client.getFirstName()) + "\n";
					} else {
						mail += line + "\n";
					}
				}
				mailSender(mail);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public String mailSender (String mail)
	{
		System.out.println(mail);
		return mail;
	}

}
