public class Item{
	private String name;
	private int reservedPrice;
	private String buyer;
	private int actionPrice;
	private boolean isSold;
	
	public Item(String name, int reservedPrice){
		this.name=name;
		this.reservedPrice=reservedPrice;
		buyer="";
		actionPrice=0;
		isSold=false;
	}
	
	public void setSold(String buyer,int actionPrice){
		isSold= true;
		this.buyer= buyer;
		this.actionPrice=actionPrice;
	}
	
	public boolean isSold(){
		return isSold;
	}
	
	public String getbuyer(){
		return buyer;
	}
	
	public int getactionPrice(){
		return actionPrice;
	}
	
	public int getreservedPrice(){
		return reservedPrice;
	}
}