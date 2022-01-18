package adventureGame;

public class ToolStore extends NormalLoc {

	public ToolStore(Player player) {
		super(player, "Store");
		
	}

	public boolean getLocation() {
		System.out.println("Money: "  + player.getMoney());
		System.out.println("1. Weapons");
		System.out.println("2. Armours");
		System.out.println("3. Exit");
		System.out.print("Selection : ");
		int selTool = scan.nextInt();
		int selItemID;
		
		switch (selTool) {
		case 1:
			selItemID = weaponMenu();
			buyWeapon(selItemID);
			break;
		case 2:
			
			break;

		default:
			break;
		}
		
		
		return true;
	}

	private void buyWeapon(int ItemID) {
		int damage = 0;
		int price = 0;
		String wName = null;
			
			switch (ItemID) {
			case 1:
				damage = 2;
				wName = "Pistol";
				price = 25;
				break;
			case 2:
				damage = 3;
				wName = "Sword";
				price = 35;
				break;
			case 3:
				damage = 7;
				wName = "Rifle";
				price = 45;
				break;

			default:
				System.out.println("Invalid selection !");
				break;
			}
			if (player.getMoney()>price) {
				player.getInv().setDamage(damage);
				player.getInv().setwName(wName);
				player.setMoney(player.getMoney()-price);
				System.out.println(wName + " bought, previous damage: " + player.getDamage() + " new damage : " + (player.getDamage()+ player.getInv().getDamage()));
				System.out.println("Balance : " + player.getMoney());
			} else {
				System.out.println("Not enough money !");
			}
			
		
	}

	private int weaponMenu() {
		System.out.println("1. Pistol\t <Money : 25 - Damage : 2>");
		System.out.println("2. Sword\t <Money : 35 - Damage : 3>");
		System.out.println("3. Rifle\t <Money : 45 - Damage : 7>");
		System.out.println("4. Exit");
		System.out.println("Choose weapon : ");
		int selWeaponID = scan.nextInt();
		
		return selWeaponID;
	}
	
}
