import java.util.*;
import java.io.*;

class Restaurant{
	private static Food[] foodList = new Food[50];
	private static Drinks[] drinksList = new Drinks[50];
	private static int count = 0;
	private static int count1 = 0;
	
	static void addFood(Food f){
		foodList[count] = f;
		count++;
	}
	
	static void showAllFood(){
		for(int index = 0; index < count; index++){
			if(foodList[index] != null){
				foodList[index].showFood();
				System.out.println();
			}
		}
	}
	
	static int searchFood(int foodCode){
		boolean desition = false;
		for(int index = 0; index < count; index++){
			int code = foodList[index].getfoodCode();
			if(foodCode == code){
				System.out.println("Food found");
				desition = true;
				foodList[index].showFood();
				System.out.println("");
				return index;
			}
		}
		if(!desition){
			System.out.println("Sorry, this food is not available right now");
		}
		return -1;
	}
	
	static void removeFood(int code){
		int foundCode = searchFood(code);
		if(foundCode >= 0){
			foodList[foundCode] = null;
			System.out.println("Food has been removed");
			System.out.println("");
			showAllFood();
		}
	}
	
	static void addDrinks(Drinks d){
		drinksList[count1] = d;
		count1++;
	}
	
	static void showAllDrinks(){
		for(int index = 0; index < count1; index++){
			if(drinksList[index] != null){
				drinksList[index].showDrinks();
				System.out.println();
			}
		}
	}
	
	static int searchDrinks(int drinksCode){
		boolean desition = false;
		for(int index = 0; index < count1; index++){
			int code = drinksList[index].getdrinksCode();
			if(drinksCode == code){
				System.out.println("Drinks found");
				desition = true;
				drinksList[index].showDrinks();
				System.out.println("");
				return index;
			}
		}
		if(!desition){
			System.out.println("Sorry, this drinks is not available right now");
		}
		return -1;
	}
	
	static void removeDrinks(int code){
		int foundCode = searchDrinks(code);
		if(foundCode >= 0){
			drinksList[foundCode] = null;
			System.out.println("Drinks has been removed");
			System.out.println("");
			showAllDrinks();
		}
	}
	
	static void placeOrder(){
		Food f = new Food();
		Drinks d = new Drinks();
		int a, b;
		System.out.println();
		System.out.println("\t\t----------Wellcome to our restaurant----------");
		Scanner input = new Scanner(System.in);
		String Confirm = "y";
		while(Confirm.equalsIgnoreCase("Y")){
			boolean Con = true;
			int total = 0;
			while(Con){
				Menu m = new Menu();
				m.menu();
				int i = input.nextInt();
			switch(i){
				case 1:
					m.bangla();
					int choice = input.nextInt();
					switch(choice){
						case 1:
							System.out.println("You have chosen Panta Ilish");
							System.out.print("How many plate do you want :");
							a= input.nextInt();
							f.setfoodQuantity(a);
							b = f.getfoodQuantity();
							total = total +(b*300);
							break;
						case 2:
							System.out.println("You have chosen Kachchi Birrani");
							System.out.print("How many plate do you want :");
							a= input.nextInt();
							f.setfoodQuantity(a);
							b = f.getfoodQuantity();
							total = total +(b*200);
							break;
						case 3:
							System.out.println("You have chosen Morog Polao");
							System.out.print("How many plate do you want :");
							a= input.nextInt();
							f.setfoodQuantity(a);
							b = f.getfoodQuantity();
							total = total +(b*150);
							break;
						case 4:
							System.out.println("You have chosen Bhuna Khichuri");
							System.out.print("How many plate do you want :");
							a= input.nextInt();
							f.setfoodQuantity(a);
							b = f.getfoodQuantity();
							total = total +(b*120);
							break;
						case 5:
							System.out.println("You have chosen Haleem");
							System.out.print("How many plate do you want :");
							a= input.nextInt();
							f.setfoodQuantity(a);
							b = f.getfoodQuantity();
							total = total +(b*100);
							break;
						}
				break;
				case 2:
					Menu x = new Menu();
					x.chinese();
					int pick = input.nextInt();
					switch(pick){
						case 1:
							System.out.println("You have chosen Fried Rice");
							System.out.print("How many plate do you want :");
							a= input.nextInt();
							f.setfoodQuantity(a);
							b = f.getfoodQuantity();
							total = total +(b*250);
							break;
						case 2:
							System.out.println("You have chosen Noodles");
							System.out.print("How many plate do you want :");
							a= input.nextInt();
							f.setfoodQuantity(a);
							b = f.getfoodQuantity();
							total = total +(b*150);
							break;
						case 3:
							System.out.println("You have chosen Dumplings");
							System.out.print("How many plate do you want :");
							a= input.nextInt();
							f.setfoodQuantity(a);
							b = f.getfoodQuantity();
							total = total +(b*200);
							break;
						case 4:
							System.out.println("You have chosen Wonton");
							System.out.print("How many plate do you want :");
							a= input.nextInt();
							f.setfoodQuantity(a);
							b = f.getfoodQuantity();
							total = total +(b*80);
							break;
						case 5:
							System.out.println("You have chosen Chow Mein");
							System.out.print("How many plate do you want :");
							a= input.nextInt();
							f.setfoodQuantity(a);
							b = f.getfoodQuantity();
							total = total +(b*210);
							break;
						}
				break;
				case 3:
					Menu b1 = new Menu();
					b1.continental();
					int close = input.nextInt();
					switch(close){
						case 1:
							System.out.println("You have chosen Crispy Calamari Rings");
							System.out.print("How many plate do you want :");
							a= input.nextInt();
							f.setfoodQuantity(a);
							b = f.getfoodQuantity();
							total = total +(b*300);
							break;
						case 2:
							System.out.println("You have chosen Prawn Pie");
							System.out.print("How many plate do you want :");
							int a2, b2;
							a2 = input.nextInt();
							f.setfoodQuantity(a2);
							b2 = f.getfoodQuantity();
							total = total +(b2*210);
							break;
						case 3:
							System.out.println("You have chosen Dumplings");
							System.out.print("How many plate do you want :");
							a= input.nextInt();
							f.setfoodQuantity(a);
							b = f.getfoodQuantity();
							total = total +(b*200);
							break;
						case 4:
							System.out.println("You have chosen Chicken And Cheese Salad");
							System.out.print("How many plate do you want :");
							a= input.nextInt();
							f.setfoodQuantity(a);
							b = f.getfoodQuantity();
							total = total +(b*350);
							break;
						case 5:
							System.out.println("You have chosen Yorkshire Lamb Patties");
							System.out.print("How many plate do you want :");
							a= input.nextInt();
							f.setfoodQuantity(a);
							b = f.getfoodQuantity();
							total = total +(b*400);
							break;
					}
				break;
				case 4:
					Menu a2 = new Menu();
					a2.drinks();
					int check = input.nextInt();
					switch(check){
						case 1:
							System.out.println("You have chosen Pepsi");
							System.out.print("How much you want :");
							a= input.nextInt();
							d.setdrinksQuantity(a);
							b = d.getdrinksQuantity();
							total = total +(b*30);
							break;
						case 2:
							System.out.println("You have chosen Mirinda");
							System.out.print("How much you want :");
							a= input.nextInt();
							d.setdrinksQuantity(a);
							b = d.getdrinksQuantity();
							total = total +(b*25);
							break;
						case 3:
							System.out.println("You have chosen Mountain Dew");
							System.out.print("How much you want :");
							a= input.nextInt();
							d.setdrinksQuantity(a);
							b = d.getdrinksQuantity();
							total = total +(b*30);
							break;
						}
				break;
				case 5:
					//Con = true;
					//System.out.println("Do you want to order more");
					Menu u = new Menu();
					u.wantMemberShip();
					int a1 = input.nextInt();
					switch(a1){
						case 1:
							Receipt r = new Receipt();
							r.makeReceipt();
							double total1 = 0;
							total1 = total - (total*0.1);
							System.out.println(".........................................................");
							System.out.println("After 10% discount your bill is : "+total1);
							System.out.println(".........................................................");
						break;
						case 2:
							Receipt s = new Receipt();
							s.makeReceipt();
							System.out.println(".........................................................");
							System.out.println("Your total bill is : "+total);
							total = 0;
							System.out.println(".........................................................");
						break;
					}
				break;
				case 6:
					Con = false;
				break;
				}
			}
			System.out.println("Is there more customs available Y/N ");
			Confirm = input.next();
			Confirm = Confirm.toUpperCase();
			System.out.println("Thank you for coming here.\nHave a nice day");
		}
	}
}