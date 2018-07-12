package birthday.processor;

import birthday.objects.Client;

public interface BirthdaySender {
	
	//Queria usar default en la interfaz o una clase abstracta, para dejar este método común para todos.
	public void greetingBirthday(Client client, String template); //s{
		
//		InputStream s = ReaderFlatFile.class.getResourceAsStream(template);
//        InputStreamReader reader = new InputStreamReader(s);
//        BufferedReader buff = new BufferedReader (reader);
//
//        String line = "";
//        String mail = "";
//        // keep reading till readLine returns null
//			try {
//				//Se podria optimizar para que solo se reemplazase la linea del name.
//				while ((line = buff.readLine()) != null) {
//					if (line.contains("@"))
//					{
//						mail += line.replace("@name", client.getFirstName()) + "\n";
//					} else {
//						mail += line + "\n";
//					}
//				}
//				mailSender(mail);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	}
	
	public String mailSender (String mail);

}
