package searchingSorting;

import java.util.Scanner;

public class EelctronicSystem {
	static Scanner sc = new Scanner(System.in);
	static Item[]I;
	static char ch;
//	static boolean condition;
	public EelctronicSystem() {
		I= new Item[5];
		Item i1= new Item("TV",2000.00,20);
		Item i2= new Item("Phone",900.00,20);
		Item i3= new Item("Microwave",1000.00,10);
		Item i4= new Item("Iron",500.59,20);
		Item i5= new Item("Oven",300.59,20);
		
		I[0]=i1;
		I[1]=i2;
		I[2]=i3;
		I[3]=i4;
		I[4]=i5;

	}

	public void WelcomePage() {
		do {
			System.out.println("Welcome to John Electronic system");
			System.out.println("1. View Sell Item List");
			System.out.println("2. Search item list by item name");
			System.out.println("Choose Option");
			int option = sc.nextInt();
			switch(option) {
			case 1: ViewItem();break;
			case 2: SearchItem();break;
			default : {
				System.out.println("Wrong Input");
				WelcomePage();
			}
			
			}
			System.out.println("Do Again : Y or N");
			ch = sc.next().charAt(0);
		}while(ch=='Y');
	}
	public void ViewItem()
	{
		System.out.println("Item Name  Price Quantity");
		for(Item i: I) {
			System.out.println(i.getItemName()+" "+ i.getPrice()+" "+ i.getQuantity());
		}
	}
	public void SearchItem()
	{
		sc.nextLine();
		System.out.println("Enter search key item name");
		String SIname = sc.nextLine();
		int i;
		for(i=0;i<I.length;i++)
		{
			if(SIname.equalsIgnoreCase(I[i].getItemName()))
			{
				System.out.println(I[i].getItemName()+ " " +I[i].getPrice()+ " "+ I[i].getQuantity());
				break;
			}
			
		}
		if(i==I.length)
		{
			System.out.println(SIname + " Not Found");
		}
	}

	

}
