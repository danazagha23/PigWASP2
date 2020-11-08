package first;

public class FilterByMany implements GeneralSpec {
	private String filterp;
	private String filterm;
	private String filtert;
	private int price3;
	private int price0;
	private int price1;
	private int area3;
	private int area0;
	private int area1;
	private String filter2;
	private String am;
	private int bedr;
	private int bathr;
	private int ll;
	public FilterByMany(String filterp, String filterm, String filtert, int price3, int price0, int price1, int area3, int area0, int area1,
			String filter2, String am, int bedr, int bathr, int ll) {
		// TODO Auto-generated constructor stub
		this.filterp=filterp;
		this.filterm=filterm; 
		this.filtert=filtert; 
		this.price3= price3;
		this.price0=price0;
		this.price1=price1;
		this.area3=area3;
		this.area0 = area0;
		this.area1 = area1;
		this.filter2 = filter2;
		this.am = am;
		this.bedr = bedr;
		this.bathr = bathr;
		this.ll = ll;
		
	}
	public boolean isSpecMatched(Houses h1) {
		
	    boolean filtered=true; 
	    if (filterp.length()!=0) {
	    	FilterByPlacement fp= new FilterByPlacement(filterp);
	    	filtered=filtered && fp.isSpecMatched(h1);
	   }
	   if (filtered==true && filterm.length()!=0)
	    	{FilterByMaterial fm= new FilterByMaterial(filterm);
	    	 filtered=filtered && fm.isSpecMatched(h1);
	    	
	    	}
	   if (filtered==true && filtert.length()!=0)
    	{FilterByType ft= new FilterByType(filtert);
    	 filtered=filtered && ft.isSpecMatched(h1);
    	}
	    if (filtered==true)
    	{FilterByPrice fpr= new FilterByPrice(price3);
    	 filtered=filtered && fpr.isSpecMatched(h1);
    	
    	}
	    if (filtered==true)
    	{FilterByPriceRange fbpr= new FilterByPriceRange(price0, price1);
    	 filtered=filtered && fbpr.isSpecMatched(h1);
    	}
	    if (filtered==true)
    	{FilterByArea fa= new FilterByArea(area3);
    	 filtered=filtered && fa.isSpecMatched(h1);
    	
    	}
	    if (filtered==true) {
	    	FilterByAreaRange fba= new FilterByAreaRange(area0, area1);
	    	filtered=filtered && fba.isSpecMatched(h1);
	    }
	    if (filtered==true && bedr>-1) {
	    	FilterByBedrooms fbed= new FilterByBedrooms(bedr);
	    	filtered=filtered && fbed.isSpecMatched(h1);
	    }
	    if (filtered==true && bathr>-1) {
	    	FilterByBathrooms fbath= new FilterByBathrooms(bathr);
	    	filtered=filtered && fbath.isSpecMatched(h1);
	    }
	    if (filtered==true && filter2.length()!=0) {
	    	FilterByPets fbp= new FilterByPets(filter2);
	    	filtered=filtered && fbp.isSpecMatched(h1);
	    }
	    if (filtered==true && ll>-1) {
	    	FilterByLease fl= new FilterByLease(ll);
	    	filtered=filtered && fl.isSpecMatched(h1);
	    }
	    if (filtered==true && am.length()!=0) {
	    	String[] amtokens=am.split(",");
	    	FilterByAm fam= new FilterByAm(amtokens);
	    	filtered=filtered && fam.isSpecMatched(h1);
	    }
	   
	    return filtered;
	    
		
	}

    
    
    
    
    
    
    
    
    




}
