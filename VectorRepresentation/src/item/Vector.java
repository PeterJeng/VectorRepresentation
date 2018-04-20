package item;

import java.util.ArrayList;

public class Vector {
	public ArrayList<Double> list;
	
	public Vector() {
		this.list = new ArrayList<Double>();
	}
	
	public static Vector normalize(Vector vector){
		Vector newVector = new Vector();
		
		double magnitude = magnitude(vector);

		if (magnitude != 0) {
			for (int i = 0; i < vector.list.size(); i++) {
				newVector.list.add(vector.list.get(i) / magnitude);
			}
		}
		
		return newVector;
	}
	
	public static double dotProduct(Vector v1, Vector v2) {
		double result = 0;
		
		for(int i = 0; i< v1.list.size(); i++) {
			result += v1.list.get(i) * v2.list.get(i);
		}
		
		return result;
	}
	
	public static double magnitude(Vector vector) {
		return Math.sqrt(dotProduct(vector, vector));
	}
	
	public String toString() {
		String string = "";
		
		for(int i = 0; i < list.size(); i++) {
			string = string + list.get(i).toString() + ", ";
		}
		return string;
	}
}
