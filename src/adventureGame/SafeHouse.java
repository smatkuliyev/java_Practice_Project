package adventureGame;

public class SafeHouse extends NormalLoc {

	public SafeHouse(Player player) {
		super(player, "Safe Zone");
	}

	public boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println("Your are healed");
		System.out.println("Your are at the Safe Zone");
		return true;
	}
	
}
