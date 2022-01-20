package adventureGame;

public abstract class BattleLoc extends Location {
	
	protected Obstacle obstacle;
	
	public BattleLoc(Player player, String name, Obstacle obstacle) {
		super(player);
		this.obstacle = obstacle;
		this.name = name;
	}
	
	public boolean getLocation() {
		int obsCount = obstacle.count();
		System.out.println("Now you are at " + this.getName());
		System.out.println("Be careful! There is " + obsCount + " pcs of " + obstacle.getName());
		System.out.println("<F>ight or <L>eave");
		String selCase = scan.next();
		if (selCase.equalsIgnoreCase("f")) {
			
			if (combat(obsCount)) {
				System.out.println("At " + this.getName() + " area, you wiped out all enemies");
				return true;
			} else {
				System.out.println("You are dead !");
				return false;
			}
			
		}
		return true;
	}
	
	public boolean combat(int obsCount) {
		
		for (int i = 0; i < obsCount; i++) {
			playerStats();
			enemyStats();
		}
		
		return true;
	}


	public void playerStats() {
		System.out.println("Player Values \n-------------------");
		System.out.println("Health:" + player.getHealthy());
		System.out.println("Damage: " + player.getDamage());
		System.out.println("Money: " + player.getMoney());
		if (player.getInv().getDamage()>0) {
			System.out.println("Weapon: " + player.getInv().getwName());
		}
		if (player.getInv().getArmour()>0) {
			System.out.println("Armour: " + player.getInv().getaName());
		}
			
	}
	
	public void enemyStats() {
		System.out.println("\n"+obstacle.getName() +  " Values \n-------------------");
		System.out.println("Health:" + obstacle.getHealth());
		System.out.println("Damage: " + obstacle.getDamage());
		System.out.println("Award: " + obstacle.getAward());
		
		
	}
	
	
}
