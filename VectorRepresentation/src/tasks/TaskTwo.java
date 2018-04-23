package tasks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;

import item.Parser;
import item.Vector;
import item.WordNode;

public class TaskTwo {

	public static void main(String[] args) throws IOException {
		//read text file
		Parser parser = new Parser();
		parser.readFile("glove.6B.50d.txt");

		//change sentence to vector
		String sentence = "happy friday";
		
		sentence = sentence.toLowerCase();
		
		String[] words = sentence.split(" ");
		
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
		
		PriorityQueue<WordNode> queue = new PriorityQueue<WordNode>();
		
		for(String key : parser.wordList.keySet()) {
			Vector value = parser.wordList.get(key);
			
			if(sentence.toLowerCase().contains(key)) {
				continue;
			}
			 
			if(queue.size() < words.length) {
				WordNode wn = new WordNode(key, Vector.cosineSimilarity(sentenceVector, value));
				queue.add(wn);
			}
			else {
				double cosSim = Vector.cosineSimilarity(sentenceVector, value);
				
				if(cosSim > queue.peek().cosSimilarity) {
					WordNode wn = new WordNode(key, cosSim);
					queue.poll();
					queue.add(wn);		
				}
			}
		}
		
		int queueSize = queue.size();
		
		for(int i = 0; i < queueSize; i++) {
			System.out.println(queue.poll().toString());
		}
		
		
	}

}
