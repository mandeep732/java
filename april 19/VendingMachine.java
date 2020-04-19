package april19.A;

import java.util.ArrayList;
import java.util.Scanner;

class Product{
	String name;
	int code, price;
	
	Product(int code,String name, int price){
		this.name=name;
		this.code=code;
		this.price=price;
	}
	
	int getCode() {
		return code;
	}
	String getName() {
		return name;
	}
	int getPrice() {
		return price;
	}
}

public class VendingMachine {

	public static void main(String[] args) {
		System.out.println("\t\tVending Machine");

		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product(1,"Candy",10));
		products.add(new Product(2,"Snack",50));
		products.add(new Product(3,"Nuts",90));
		products.add(new Product(4,"Coke",25));
		products.add(new Product(5,"Pepsi",35));
		products.add(new Product(6,"Soda",45));
		
		System.out.println("code\tProdcuts : price");
		for(Product p: products) {
			System.out.println(p.getCode()+"\t"+p.getName()+":"+p.getPrice());
		}
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter coins (1,5,10,25,50):");
		String conis=scr.nextLine();
		System.out.println("Enter notes (1,2):");
		String notes=scr.nextLine();
		
		int c1=0,c5=0,c10=0,c25=0,c50=0;
		int n1=0,n2=0;
		
		String str[]=conis.split("\\s+");
		for(int i=0;i<str.length;i++) {
			int num = Integer.parseInt(str[i]);
			switch(num) {
			case 1: c1++;
				break;
			case 5: c5++;
				break;
			case 10: c10++;
				break;
			case 25: c25++;
				break;
			case 50: c50++;
				break;
				default : System.out.println("Invalid coin "+num);
			}
		}
		
		str=notes.split("\\s+");
		for(int i=0;i<str.length;i++) {
			int num = Integer.parseInt(str[i]);
			switch(num) {
			case 1: n1++;
				break;
			case 2: n2++;
				break;
			default : System.out.println("Invalid note "+num);
			}
		}
		
		double total =  c1+c5*5+c10*10+c25*25+c50*50;
		total=total/100;
		total = total+n1+n2*2;
		
		System.out.println("Enter Prodcut code to buy and 0 for exit");
		while(true) {
			System.out.println("------------------");
			System.out.println("Total money : "+total+"$");
			System.out.println("Enter Prodcuts :");
			int input = scr.nextInt();
			
			
			
			if(input==0)
				break;
			else {
				double productPrice =products.get(input-1).getPrice();
				productPrice=productPrice/100;
				
				if(productPrice<=total)
					total=total - productPrice;
				else
				{
					System.out.println("Low balance !!");
					
				}
			}
		}
		
		System.out.println("Refund : "+total);
		
	
		
	}

}
