package CH07_03;

public class Dog extends Animal{
	
	public Dog() {
		super();
	}
	

	public Dog(String kind) {
		super(kind);
	}


	@Override
	public String sound() {
		String sound = "멍멍";
		return sound;
	}

}
