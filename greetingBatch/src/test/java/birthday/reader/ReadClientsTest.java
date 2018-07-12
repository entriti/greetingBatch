package birthday.reader;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import birthday.objects.Client;
import birthday.reader.impl.ReaderFlatFile;
import birthday.utils.Dates;

public class ReadClientsTest {

		@Test
		public void testReadFile() {
			
			String fileName = "mockStakesHolders";
			File file = null;
			Writer output;
			ReadClients reader = new ReaderFlatFile();
			try {
	    		 
			      file = new File(fileName);
			      
			      if (file.createNewFile()){
			        System.out.println("File is created!");
			      }else{
			        System.out.println("File already exists.");
			      }
				  
				  output = new BufferedWriter(new FileWriter(file));  //clears file every time
				  output.append("Ani, Mary, 1975/07/12, mary.ani@foobar.com");
				  output.close();
				  ArrayList<Client> read = reader.readClients(fileName, Dates.getThisMonth(), Dates.getToday());
				  
				  assertEquals(1, read.size());
			      
		    	} catch (IOException e) {
			      e.printStackTrace();
			}
			

			
		}

}
