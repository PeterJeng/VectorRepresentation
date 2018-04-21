package tasks;

import java.io.IOException;

import item.*;

import java.util.Collections;
import java.util.PriorityQueue;
public class TaskOne {

	public static void main(String[] args) throws IOException {
		Parser parser = new Parser();
		parser.readFile("test.txt");
		
		String word = "his";
		
		Vector ourWord = parser.wordList.get(word);
	
		PriorityQueue<WordNode> queue = new PriorityQueue<WordNode>(5);
		
		for(String key : parser.wordList.keySet()) {
			//skip the word if it is equal to the word we are searching for
			if(key.equalsIgnoreCase(word)) {
				continue;
			}
			
			Vector value = parser.wordList.get(key);
			
			if(queue.size() < 5) {
				WordNode wn = new WordNode(key, Vector.cosineSimilarity(ourWord, value));
				queue.add(wn);
			}
			else {
				double cosSim = Vector.cosineSimilarity(ourWord, value);
				
				if(cosSim < queue.peek().cosSimilarity) {
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
