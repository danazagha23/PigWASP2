package first;

public class FilterByPrice implements GeneralSpec {

	private int price;

	public FilterByPrice(int price) {
		this.price = price;
		// TODO Auto-generated constructor stub
	}
	

	public int getPrice() {
		return price;
	}


	public boolean isSpecMatched(Houses h1) {
		// TODO Auto-generated method stub
		
		return h1.getPrice()<=getPrice();
	}

}
