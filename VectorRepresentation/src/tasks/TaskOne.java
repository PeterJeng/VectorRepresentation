package tasks;

import java.util.ArrayList;

public class TaskOne {

	public static void main(String[] args) {
		ArrayList<WordNode> test = new ArrayList<WordNode>();
		ArrayList<Float> alpha = new ArrayList<Float>();
		ArrayList<Float> beta = new ArrayList<Float>();

		alpha.add(1.0f);
		alpha.add(4.0f);
		alpha.add(5.0f);

		WordNode a = new WordNode("test", alpha);
		beta = a.normalize();

		for (int i = 0; i < beta.size(); i++) {
			System.out.println(beta.get(i).toString());
		}
		

	}

}
