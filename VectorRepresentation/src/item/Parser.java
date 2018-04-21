package item;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Parser {
	public HashMap<String, Vector> wordList;
	
	public Parser() {
		this.wordList = new HashMap<String, Vector>();
	} 
	
	@SuppressWarnings("resource")
	public void readFile(String file) throws IOException {
		FileReader input = new FileReader(file);
		BufferedReader bufRead = new BufferedReader(input);
		String myLine = null;

		while ( (myLine = bufRead.readLine()) != null)
		{    
		    String[] line = myLine.split(" ");
		    String key = line[0];
		    Vector value = new Vector();
		    for (int i = 1; i < line.length; i++) {
		    	value.list.add(Double.parseDouble(line[i]));
		    }
		  
		    this.wordList.put(key, value); 
		}
	}

}
