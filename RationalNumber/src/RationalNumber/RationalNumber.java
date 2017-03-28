package RationalNumber;

public class RationalNumber {

	private int numer;
	private int denom;

	public RationalNumber(int Numer, int denom) {
		numer = Numer;
		this.denom = denom;
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}

	public int getDenom() {
		return denom;
	}

	public void setDenom(int denom) {
		this.denom = denom;
	}

	public String toString(){
		return "("+ numer + "/" + denom + ")";
	}

	public RationalNumber add (RationalNumber frac){
		int sumNumer, sumDenom;

		sumNumer = this.getNumer()*frac.getDenom()+frac.getNumer()*this.getDenom();
		sumDenom = this.getDenom()*frac.getDenom();
		return new RationalNumber(sumNumer,sumDenom);
	}

	public RationalNumber sub (RationalNumber frac){
		int diffNumer, diffDenom;

		diffNumer = this.getNumer()*frac.getDenom()-frac.getNumer()*this.getDenom();
		diffDenom = this.getDenom()*frac.getDenom();
		return new RationalNumber(diffNumer,diffDenom);
	}

	public RationalNumber mult (RationalNumber frac){
		int prodNumer, prodDenom;

		prodNumer = this.getNumer()*frac.getNumer();
		prodDenom = this.getDenom()*frac.getDenom();

		return new RationalNumber(prodNumer,prodDenom);
	}

	public RationalNumber div (RationalNumber frac2){
		int quotNumer, quotDenom;

		quotNumer = this.getNumer()*frac2.getDenom();
		quotDenom = this.getDenom()*frac2.getNumer();

		return new RationalNumber(quotNumer, quotDenom);
	}

	public void reduce (){
		int i, rem=1, large, small;

		if (numer > denom){
			large = numer;
			small = denom;
		}
		else{
			large = denom;
			small = numer;
		}
		if (small != 0){
			while (rem != 0){
				rem = large%small;
				large = small; 
				small = rem;
			}
			large = Math.abs(large);
			numer = numer/large;
			denom = denom/large;
		}
	}
}



