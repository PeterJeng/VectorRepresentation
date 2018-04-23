package tasks;

import java.io.IOException;

import item.Parser;
import item.Vector;

public class TaskThree {
	public static Parser parser;
	
	public static void main(String[] args) throws IOException {
		// read text file
		parser = new Parser();
		parser.readFile("glove.6B.50d.txt");
		
		String sentenceZero = "she is my girlfriend";
		String sentenceOne = "he is my boyfriend";
		String sentenceTwo = "im a stranger";
		
		Vector vectorZero = sentenceToVector(sentenceZero);
		Vector vectorOne = sentenceToVector(sentenceOne);
		Vector vectorTwo = sentenceToVector(sentenceTwo);
		
		double cosSimOne = Vector.cosineSimilarity(vectorZero, vectorOne);
		double cosSimTwo = Vector.cosineSimilarity(vectorZero, vectorTwo);
		
		System.out.println("Cosine similarity between sentence of similar meaning: " + cosSimOne);
		System.out.println("Cosine similarity between sentence of different meaning: " + cosSimTwo);
		
				
	}
	
	public static Vector sentenceToVector(String s) {
		s = s.toLowerCase();
		
		String[] words = s.split(" ");
		
		Vector sentenceVector = new Vector();
		
		double count = 0;
		
		//add word vectors together
		for(String word : words) {
			//skip words not in the text file
			try {
				sentenceVector = sentenceVector.sum(parser.wordList.get(word));
				count++;
			}
			catch(Exception e) {
				continue;
			}
			
		}
		
		sentenceVector.averageSum(count);
		
		return sentenceVector;
	}

}
