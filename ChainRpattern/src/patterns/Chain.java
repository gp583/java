package patterns;

interface Chain{
	 
	public void setNextChain(Chain nextChain);
	//passes a reference to the next object to call in chain (if needed)
	
	public void calculate(Numbers request);
	//either make calculation, or call calculate method on next object that is set by setNextChain
	
}