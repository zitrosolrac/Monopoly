package production;

import java.util.Scanner;

public class Property implements Space{
	
//	name of property
	String name;
	String owner;
	String color;
	int cost;
	
	public Property(){
		
	}
	
	public Property(String name, int cost, String color) {
		this.name = name;
		this.cost = cost;
		this.color = color;
	}

	public Property(String name, String owner, String color, int cost) {
		super();
		this.name = name;
		this.owner = owner;
		this.color = color;
		this.cost = cost;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setCost(int cost){
		this.cost = cost;
	}
	
	public int getCost(){
		return cost;
	}
	
	public int doAction(){
		
		Scanner actionScanner = new Scanner(System.in);
		System.out.println("Enter 'Y' if you'd like to buy " + this.getName());
		System.out.println("It costs: " + this.getCost());
		System.out.println("Input: ");
		String input = actionScanner.next();
		
		if(input.equalsIgnoreCase("Y")){
			return this.getCost();
		}
		
		return 0;
	}

}
