class Food{
	private int foodCode;
	private String nameOfFood;
	private int priceOfFood;
	private int foodQuantity;
	private int foodBill;
	
	public void setfoodCode(int foodCode){
		this.foodCode = foodCode;
	}
	public int getfoodCode(){
		return foodCode;
	}
	
	public void setnameOfFood(String nameOfFood){
		this.nameOfFood = nameOfFood;
	}
	public String getnameOfFood(){
		return nameOfFood;
	}
	
	public void setpriceOfFood(int priceOfFood){
		this.priceOfFood = priceOfFood;
	}
	public int getpriceOfFood(){
		return priceOfFood;
	}
	
	protected void setfoodQuantity(int foodQuantity){
		this.foodQuantity = foodQuantity;
	}
	public int getfoodQuantity(){
		return foodQuantity;
	}
	
	public void foodBill(){
		int cost =  getpriceOfFood()*getfoodQuantity();
		System.out.println("Total bill is : "+cost);
	}
	
	/*public Food(int foodCode, String nameOfFood, int priceOfFood, int foodQuantity){
		this.setfoodCode(foodCode);
		this.setnameOfFood(nameOfFood);
		this.setpriceOfFood(priceOfFood);
		this.setfoodQuantity(foodQuantity);
	}*/
	
	public void showFood(){
		System.out.println("Food code is : "+getfoodCode());
		System.out.println("Name of food is : "+getnameOfFood());
		System.out.println("Price of food is : "+getpriceOfFood());
		System.out.println("Quantity of "+getnameOfFood()+" is : "+getfoodQuantity()+" plate");
		foodBill();
	}
	
	
}