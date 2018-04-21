package item;

public class WordNode  implements Comparable<WordNode> {
	public String word;
	public double cosSimilarity;
	
	public WordNode(String word, double cosSimilarity){
		this.word = word;
		this.cosSimilarity = cosSimilarity;
	}
	
	public String toString() {
		return word + " " + cosSimilarity;
	}

	@Override
	public int compareTo(WordNode o) {
		if(this.cosSimilarity - o.cosSimilarity < 0) {
			return 1;
		}
		else if(this.cosSimilarity - o.cosSimilarity == 0) {
			return 0;
		}
		else {
			return -1;	
		}	
	}


}
