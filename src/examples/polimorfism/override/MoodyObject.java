package examples.polimorfism.override;

public abstract class MoodyObject {
	
	protected abstract String getMood();
	
	public void queryMood() {
		System.out.println("I feel " + getMood() + " today!");
	}
}

