package first;

public class FilterByPriceRange implements GeneralSpec {

	private int price0;
	private int price1;

	public FilterByPriceRange(int price0, int price1) {
		this.price0 = price0;
		this.price1 = price1;
		// TODO Auto-generated constructor stub
	}

	public int getPrice0() {
		return price0;
	}

	public int getPrice1() {
		return price1;
	}

	public boolean isSpecMatched(Houses h1) {
		// TODO Auto-generated method stub
		return (h1.getPrice()>=getPrice0() && h1.getPrice()<=getPrice1());
	}

}
