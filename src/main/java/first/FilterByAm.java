package first;

public class FilterByAm implements GeneralSpec {

	private String[] amtokens;

	public FilterByAm(String[] amtokens) {
		this.amtokens = amtokens;
		// TODO Auto-generated constructor stub
	}

	public boolean isSpecMatched(Houses h1) {
		// TODO Auto-generated method stub
		Boolean correct=false;
		for (String s: amtokens) {
			if (h1.getTemp().toLowerCase().contains(s.toLowerCase())){
				correct=true; 
			}
			else {
				correct=false; 
				break;
			}
		}
		return correct;
	}

}
