package patterns;

public class SubtractNumbers implements Chain {

	private Chain nextInChain;

	public void setNextChain(Chain nextChain) {
		
		this.nextInChain = nextChain;
		
	}

	public void calculate(Numbers request) {
		
		if(request.getcalcWanted() == "sub"){
			
			System.out.println(request.getNumber1() + " - " + request.getNumber2() +
					" = " + (request.getNumber1() - request.getNumber2()));
			
		} else {
			
			nextInChain.calculate(request);
		}	
	}
}

