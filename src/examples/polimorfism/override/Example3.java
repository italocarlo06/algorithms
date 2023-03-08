package examples.polimorfism.override;

public class Example3 {
	public static void main(String[] args) {
		HappyObject happy = new HappyObject();
		happy.queryMood();
		
		SadObject sad = new SadObject();
		sad.queryMood();
	}
}

