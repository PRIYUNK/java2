/* package task1;
import java.util.Scanner;

 class Pizza{

	String pizzabase;
	int price;

	public Pizza(String pizzabase, int price) {

		this.pizzabase = "pita";
		this.price = price;
	}

	public Pizza() {
		this.pizzabase="pita";
	}
	public void display()
	{
		System.out.println("pizzabase ="+pizzabase);
	}

}
 class ChickenPizza  extends Pizza{

	String topping;
	public ChickenPizza(String pizzabase, int price) {
		super(pizzabase, price);
	}
	public ChickenPizza() 
	{
		super();
		this.topping ="chicken topping";
		this.price= 400;
	}
	
public void display()
{
super.display();
System.out.println("topping is"+topping+"\nPrice is "+price);
}
}

 class MuttonPizza extends ChickenPizza {

	String flavouredtopping;

	public MuttonPizza(String pizzabase, int price) {
		super(pizzabase, price);
		
	}
	public MuttonPizza() 
	{
		super();
		this.price =600;
		this.flavouredtopping="mutton topping";
	}
	public void display()
	{
		super.display();
		System.out.println("Flavouredtopping is"+flavouredtopping);
	}

}


public class PizzaHut {

	public static void main(String[] args) {
	Pizza p = new Pizza();
	ChickenPizza c = new ChickenPizza();
	MuttonPizza m = new MuttonPizza();
	int ch;
	do {
		Scanner s= new Scanner(System.in);
	System.out.println("Prizes of Chickenpizzza : RS300 and MuttonPizza:RS500");
	System.out.println("Please select choice \t 1) ChickenPizza \t 2) MuttonPizza:");
	ch =s.nextInt();
	switch(ch)
	{
	case 1:
	{
		System.out.println("*FOR CHICKEN-PIZZA*");
		c.display();
		break;
	}
	case 2:
	{

		System.out.println("*FOR MUTTON-PIZZA*");
		m.display();
		break;
	}
	default:
	{
		System.out.println("Invalid choice!!");
		break;
	}
	}
	}while(ch>3);
	}
	
}*/