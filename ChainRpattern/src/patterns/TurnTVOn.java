package patterns;

public class TurnTVOn implements Command {
	
	EelectronicDevice theDevice;
	
	public TurnTVOn(ElectronicDevice newDevice){
		theDevice = newDevice;
	}
	
	
	
	
	public void execute(){
		theDevice.on();
	}
}
