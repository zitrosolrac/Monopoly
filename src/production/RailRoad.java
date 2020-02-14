package production;

public class RailRoad {
	String Name;

	public void setName(String name) {
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void collectRailroadFee(Player player){
		
		player.setMoney(player.getMoney()-200);
		System.out.println(Name+" Railroad has charged you $200.");	
	}
}

