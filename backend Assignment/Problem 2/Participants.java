public class Participants{	
	private String name;
	
	public Participants(String name){
		this.name=name;
	}
	
	public void query(String itemname){
		Auctioneer.query(itemname);
	}
	
	public void submitAuction(int price, String itemName){
		Auctioneer.setbid(name,price,itemName);
}
	
}