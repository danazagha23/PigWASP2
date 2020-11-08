package first;

public class FilterByType implements GeneralSpec {

	private String string;

	public FilterByType(String string) {
		this.string = string;
		
	}

	public String getString() {
		return string;
	}

	public boolean isSpecMatched(Houses h1) {
		return h1.getType().equalsIgnoreCase(getString());
	}

}
