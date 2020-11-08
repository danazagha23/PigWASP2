package first;

public class Houses {
	
		private String type ;
		private String material;
		private String placement ;
	    private String pets; 
		private String temp; 
		private int price;
		private int area;
		private int bedrooms;
		private int bathrooms;
		private int lease; 
		String[]amenties;
		String[] stokens; 
		String[] itokens; 

		
		public Houses (String s, String i) {
			stokens=s.split("_");
			itokens=i.split("_");
			type=stokens[0]; 
			material=stokens[1];
			placement=stokens[2];
			pets=stokens[3];;
			temp=stokens[4];
			price=Integer.parseInt(itokens[0]);
			area=Integer.parseInt(itokens[1]);
			bedrooms=Integer.parseInt(itokens[2]);
			bathrooms=Integer.parseInt(itokens[3]);
			lease=Integer.parseInt(itokens[4]);
		    amenties= temp.split(",");
		  
			
		}


		public String getType() {
			return type;
		}


		public String getMaterial() {
			return material;
		}


		public String getPlacement() {
			return placement;
		}


		public String getPets() {
			return pets;
		}


		public String getTemp() {
			return temp;
		}


		public int getPrice() {
			return price;
		}


		public int getArea() {
			return area;
		}


		public int getBedrooms() {
			return bedrooms;
		}


		public int getBathrooms() {
			return bathrooms;
		}


		public int getLease() {
			return lease;
		}


		public String[] getAmenties() {
			return amenties;
		}


		public String[] getStokens() {
			return stokens;
		}


		public String[] getItokens() {
			return itokens;
		}

		

	}

