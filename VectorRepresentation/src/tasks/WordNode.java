package tasks;

import java.util.ArrayList;

/**
 * 
 * @author Peter
 *
 * Represent a singular row in the word vector representation
 * 
 */
public class WordNode {
	public String word;
	public ArrayList<Float> vector = new ArrayList<Float>();
	
	public String getWord() {
		return word;
	}
	
	public ArrayList<Float> getVector(){
		return vector;
	}
	
	public ArrayList<Float> normalize() {
		ArrayList<Float> normalizedVector = new ArrayList<Float>();
		
		for(int i = 0; i < vector.size(); i++) {
			
		}
		
		
		return normalizedVector;
	}
}
