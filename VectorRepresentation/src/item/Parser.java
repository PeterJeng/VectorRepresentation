package item;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Parser {
	public HashMap<String, Vector> wordList;
	
	public Parser() {
		this.wordList = new HashMap<String, Vector>();
	} 
	
	
	public void readFile(String file) throws IOException {
		FileInputStream inputStream = null;
		Scanner sc = null;
		String[] line;
		String key;
		try {
		    inputStream = new FileInputStream(file);
		    sc = new Scanner(inputStream, "UTF-8");
		    while (sc.hasNextLine()) {
		    	line = sc.nextLine().split(" ");
			    key = line[0];
			    Vector value = new Vector();
			    for (int i = 1; i < line.length; i++) {
			    	value.list.add(Double.parseDouble(line[i]));
			    }
			  
			    this.wordList.put(key, value);
		    }
		    // note that Scanner suppresses exceptions
		    if (sc.ioException() != null) {
		        throw sc.ioException();
		    }
		} finally {
		    if (inputStream != null) {
		        inputStream.close();
		    }
		    if (sc != null) {
		        sc.close();
		    }
		}

	}

}
