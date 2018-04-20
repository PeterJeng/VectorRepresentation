package item;

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
	public Vector vector;
	
	public WordNode() {	}
	
	public WordNode(String word, Vector vector) {
		this.word = word;
		this.vector = vector;
	}
	
	public String getWord() {
		return word;
	}

	public Vector getVector() {
		return vector;
	}

}
