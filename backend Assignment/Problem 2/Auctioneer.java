import java.util.HashMap;

public class Auctioneer{
	private static HashMap<String,Item> itemList=new HashMap<String,Item>();
	private static HashMap<String, Auction> auctionList= new HashMap<String, Auction>();
	
	public void startAuction(String itemname, int reservedPrice){
		if(itemList.containsKey(itemname)){
			System.out.println("This name have been used, try another name please.");
		}
		else{
		    Item i= new Item(itemname,reservedPrice);
		    itemList.put(itemname,i);
		    Auction a = new Auction(i);
		    auctionList.put(itemname,a);
		}
	}
	
	public void callAuction(Auction a){
		if(a.isValid()){
			auctionList.remove(a);
			System.out.print("This auction is successful.");
		}
		else {
			System.out.print("This auction fails.");
		}
	}
	
	public static void setbid(String buyername, int price, String itemName){
		Auction a = auctionList.get(itemName);
		a.bid(buyername, price);
	}
	

		
	public static void query(String itemname){
		if(!itemList.containsKey(itemname)){
			System.out.println("There is no item with the name: "+ itemname);
		}
		else{
		    Item i=itemList.get(itemname);
		    if(i.isSold()){
		    	System.out.println("This item is sold");
		    	System.out.println("Buyer is: " + i.getbuyer());
		    	System.out.println("Price sold is: " + i.getactionPrice());
		    }
		    else{
		    	System.out.println("This item is being auctioned.");
		    }
		}
		
	}
	
}