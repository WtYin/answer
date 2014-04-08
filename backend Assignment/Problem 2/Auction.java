public class Auction{
	private Item i;
	private String currentbuyer;
	private int currentPrice;
	
	public Auction(Item i){
		this.i=i;
		currentbuyer="";
		currentPrice=0;
	}
	
	public void bid(String buyername, int price){
		if (price>currentPrice){
			currentPrice=price;
			currentbuyer=buyername;
			System.out.println("A valid bid.");
		}
		else System.out.println("This is not a valid bid.");
	}
	
	public boolean isValid(){
		if (currentPrice>=i.getreservedPrice()){
			i.setSold(currentbuyer, currentPrice);
			return true;
		}
		else return false;
	}
}