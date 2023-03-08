package examples.polimorfism;

public class Example1 {
	public static void main (String[] args) {
		PersonalityObject[] personalities = new PersonalityObject[5];
		personalities[0] = new PersonalityObject();
		personalities[1] = new PessimisticObject();
		personalities[2] = new OptimisticObject();
		personalities[3] = new IntrovertedObject();
		personalities[4] = new ExtrovertedObject();
		for(PersonalityObject personality: personalities) {
		System.out.println(personality.speak());
		}
	}
	
	
	public void makeSpeak( PessimisticObject obj ) {
		System.out.println(obj.speak());
	}

	public void makeSpeak( OptimisticObject obj ) {
		System.out.println(obj.speak());
	}

	public void makeSpeak( IntrovertedObject obj ) {
		System.out.println(obj.speak());
	}

	public void makeSpeak( ExtrovertedObject obj ) {
		System.out.println(obj.speak());
	}
	
	public void makeSpeak( PersonalityObject obj ) {
		System.out.println(obj.speak());
	}
}

