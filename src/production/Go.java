package production;

public class Go implements Space{
	
	String Name = "Go";

	public void setName(String name) {		
	}

	public String getName() {
		return Name;
	}
	
	public void giveBasicIncome(Player player){
		
		int lapReward = 200;
		int currentCapital = player.getMoney();
		int newCaptalAmmount = lapReward + currentCapital;
		
		player.setMoney(newCaptalAmmount);
		
		System.out.println("You've been given a basic income of $200.");
	}

	@Override
	public int doAction() {
		// TODO Auto-generated method stub
		return 0;
	}
}
