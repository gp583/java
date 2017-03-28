package patterns;

public class Television implements ElectronicDevice{

	privae int volume = 0;
	
	@Override
	public void on() {
		
		System.out.println("TV is ON");
		
	}

	@Override
	public void off() {
		System.out.println("TV is OFF");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("TV volume is at " + volume);
		
	}

	@Override
	public void volumeDown() {
		System.out.println("TV volume is at " + volume);
		
	}

}
