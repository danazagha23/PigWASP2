package first;

public class FilterByPets implements GeneralSpec {

	private String string;

	public FilterByPets(String string) {
		this.string = string;
		
		// TODO Auto-generated constructor stub
	}

	public String getString() {
		return string;
	}

	public boolean isSpecMatched(Houses h1) {
		// TODO Auto-generated method stub
		return h1.getPets().equalsIgnoreCase(getString());
	}

}
