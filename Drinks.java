class Drinks{
	private int drinksCode;
	private String nameOfDrinks;
	private int priceOfDrinks;
	private int drinksQuantity;
	private int drinksBill;
	
	public void setdrinksCode(int drinksCode){
		this.drinksCode = drinksCode;
	}
	public int getdrinksCode(){
		return drinksCode;
	}
	
	public void setnameOfDrinks(String nameOfDrinks){
		this.nameOfDrinks = nameOfDrinks;
	}
	public String getnameOfDrinks(){
		return nameOfDrinks;
	}
	
	public void setpriceOfDrinks(int priceOfDrinks){
		this.priceOfDrinks = priceOfDrinks;
	}
	public int getpriceOfDrinks(){
		return priceOfDrinks;
	}
	public void setdrinksQuantity(int drinksQuantity){
		this.drinksQuantity = drinksQuantity;
	}
	public int getdrinksQuantity(){
		return drinksQuantity;
	}
	
	public void drinksBill(){
		int cost =  getpriceOfDrinks()*getdrinksQuantity();
		System.out.println("Total bill is : "+cost);
	}
	/*public Drinks(int drinksCode, String nameOfDrinks, int priceOfDrinks, int drinksQuantity){
		this.setdrinksCode(drinksCode);
		this.setnameOfDrinks(nameOfDrinks);
		this.setpriceOfDrinks(priceOfDrinks);
		this.setdrinksQuantity(drinksQuantity);
	}*/
	
	public void showDrinks(){
		System.out.println("Drinks code is : "+getdrinksCode());
		System.out.println("Name of drinks is : "+getnameOfDrinks());
		System.out.println("Price of drinks is : "+getpriceOfDrinks());
		System.out.println("Quantity of "+getnameOfDrinks()+" is : "+getdrinksQuantity()+" Glass ");
		drinksBill();
	}
	
	
}