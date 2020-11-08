package first;

public class FilterByMaterial implements GeneralSpec {

	private String s1;

	public FilterByMaterial(String s1) {
		this.s1 = s1;
		// TODO Auto-generated constructor stub
		
	}
	

	public String getS1() {
		return s1;
	}


	public boolean isSpecMatched(Houses h1) {
		// TODO Auto-generated method stub
		return h1.getMaterial().equalsIgnoreCase(getS1());
	}

}
