package first;

public class FilterByLease implements GeneralSpec {

	private int i;

	public FilterByLease(int i) {
		this.i = i;
		// TODO Auto-generated constructor stub
		
	}

	public boolean isSpecMatched(Houses h1) {
		// TODO Auto-generated method stub
		return h1.getLease()==getI();
	}

	private int getI() {
		// TODO Auto-generated method stub
		return i;
	}

}
