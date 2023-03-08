package examples.polimorfism.override;

public class SadObject extends MoodyObject {
	protected String getMood() {
		return "sad";
}
	public void laugh() {
		System.out.println("hehehe... hahaha... HAHAHA!!!");
	}
}
