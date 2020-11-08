package first;

public class FilterByBathrooms implements GeneralSpec {

	private int x;

	public FilterByBathrooms(int x) {
		this.x = x;
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public boolean isSpecMatched(Houses h1) {
		// TODO Auto-generated method stub
		return h1.getBathrooms()==getX();
	}

}
