package first;

public class FilterByAreaRange implements GeneralSpec {

	private int area0;
	private int area1;

	public FilterByAreaRange(int area0, int area1) {
		this.area0 = area0;
		this.area1 = area1;
		// TODO Auto-generated constructor stub
	}

	public int getArea0() {
		return area0;
	}

	public int getArea1() {
		return area1;
	}

	public boolean isSpecMatched(Houses h1) {
		// TODO Auto-generated method stub
		return (h1.getArea()>=getArea0()&& h1.getArea()<=getArea1());
	}

}
