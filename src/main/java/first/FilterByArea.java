package first;

public class FilterByArea implements GeneralSpec {

	private int area;

	public FilterByArea(int area) {
		this.area = area;
		// TODO Auto-generated constructor stub
	}
	

	public int getArea() {
		return area;
	}


	public boolean isSpecMatched(Houses h1) {
		// TODO Auto-generated method stub
		return h1.getArea()<=getArea();
	}

}
