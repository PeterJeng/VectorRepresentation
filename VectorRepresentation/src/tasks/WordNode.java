package tasks;

import java.util.ArrayList;

/**
 * 
 * @author Peter
 *
 *         Represent a singular row in the word vector representation
 * 
 */
public class WordNode {
	public String word;
	public ArrayList<Float> vector = new ArrayList<Float>();
	
	public WordNode() {	}
	
	public WordNode(String word, ArrayList<Float> vector) {
		this.word = word;
		this.vector = vector;
	}
	
	public String getWord() {
		return word;
	}

	public ArrayList<Float> getVector() {
		return vector;
	}

	/**
	 * using the vector inside the WordNode, normalize all values inside it
	 * 
	 * @return normalized vector
	 */
	public ArrayList<Float> normalize() {
		ArrayList<Float> normalizedVector = new ArrayList<Float>();
		float magnitude = 0;

		for (int i = 0; i < vector.size(); i++) {
			magnitude += vector.get(i) * vector.get(i);
		}

		magnitude = (float) Math.sqrt(magnitude);

		if (magnitude != 0) {
			for (int i = 0; i < vector.size(); i++) {
				normalizedVector.add(vector.get(i) / magnitude);
			}
		}

		return normalizedVector;
	}
	
}
