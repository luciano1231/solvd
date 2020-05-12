package main.java.com.solvd.readingFile;
import java.io.*;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnerFile {
	private final static Logger LOGGER = LogManager.getLogger(RunnerFile.class);
	
	public static void main(String[] args) throws IOException {
		InputStream is;
		try {
			is = new FileInputStream("texto.txt");
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line = buf.readLine();
			StringBuilder sb = new StringBuilder();
			        
			while(line != null){
			   sb.append(line);
			   line = buf.readLine();
			}
			        
			String  fileAsString = sb.toString();
			String[] fulltext = fileAsString.split(" ");
			LOGGER.info("This text has "+fulltext.length + " words\n");
			LOGGER.info("What is the word you want tu compare?");
			Scanner myScaner = new Scanner (System.in);
			String theWord= myScaner.nextLine();
			int coincidences=0;
			
			// Compares
			for(String elemento:fulltext ) {
				if (elemento.equals(theWord)) {
					coincidences=coincidences+1;
				}			}
			LOGGER.info("The text have the word "+theWord +" "+coincidences+" times");
			
			//Writing on the current text File
			FileWriter fw= new FileWriter("C:\\ESD\\texto.txt",true);
			fw.append("The text have the word "+theWord +" "+coincidences+" times");
			fw.close();
			
			
		} catch (FileNotFoundException e) {
			LOGGER.info("Some Error");
		}
		

	}

}
