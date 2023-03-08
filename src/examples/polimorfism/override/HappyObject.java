package examples.polimorfism.override;

public class HappyObject extends MoodyObject {
	protected String getMood() {
		return "happy";
}
	public void laugh() {
		System.out.println("hehehe... hahaha... HAHAHA!!!");
	}
}

