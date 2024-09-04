import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.*;

class Receipt{
		public void makeReceipt(){
			try{
				Scanner input = new Scanner(System.in);
				String a, b, c;
			
				System.out.println();
				System.out.println("What is your name ?");
				a = input.nextLine();
				System.out.println("Your name is : "+a);
				System.out.println();
				
				System.out.println("What is your address ?");
				b = input.nextLine();
				System.out.println("Your address is : : "+b);
				System.out.println();
				
				System.out.println("What is your number ?");
				c = input.nextLine();
				System.out.println("Your number is : "+c);
				System.out.println();
			
				FileWriter frout = new FileWriter("Receipt.txt");
			
				frout.write(a);
				frout.write(b);
				frout.write(c);
					
				frout.close();
			}
			catch(Exception e){
				System.out.println("Error: "+e);
			}
		}
	}