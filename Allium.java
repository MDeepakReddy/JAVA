package general;

public class Allium {
	
	public static void main(String[] args) {
		
	}
	

}

class All1{
	private int marketId;
	private String altype;
	private String state;
	private int price;
	
	public All1(int marketId,String altype,String state,int price) {
		this.marketId = marketId;
		this.altype = altype;
		this.state = state;
		this.price = price;
	}
	
	public int getMarketId() {
		return this.marketId;
	}
	public String getAltype() {
		return this.altype;
	}
	public String getState() {
		return this.state;
	}
	public int getPrice() {
		return this.price;
	}
	public void setMarketId(int marketId) {
		this.marketId = marketId;
	}
	public void setAltype(String altype) {
		this.altype = altype;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}