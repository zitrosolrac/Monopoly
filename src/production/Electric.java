package production;

public class Electric{
	
	String Name = "Electric";

	public String getName() {
		return Name;
	}
	
	public void collectElectricFee(Player player){
		
		player.setMoney(player.getMoney()-200);
		System.out.println("Electric has collected $200 from you.");	
	}
}
