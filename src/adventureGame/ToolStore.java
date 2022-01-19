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
			selItemID = armourMenu();
			buyArmour(selItemID);
			break;

		default:
			break;
		}
		
		
		return true;
	}

	private void buyArmour(int ItemID) {
		int avoid = 0;
		int price = 0;
		String aName = null;
			
			switch (ItemID) {
			case 1:
				avoid = 1;
				aName = "Light Armour";
				price = 15;
				break;
			case 2:
				avoid = 3;
				aName = "Mid Armour";
				price = 25;
				break;
			case 3:
				avoid = 5;
				aName = "Heavy Armour";
				price = 40;
				break;
			case 4:
				System.out.println("Quitting...");
				break;

			default:
				System.out.println("Invalid selection !");
				break;
			}
			if (price>0) {
				if (player.getMoney()>=price) {
					player.getInv().setArmour(avoid);
					player.getInv().setaName(aName);
					player.setMoney(player.getMoney()-price);
					System.out.println(aName + " bought, avoided damage: " + player.getInv().getArmour());
					System.out.println("Balance : " + player.getMoney());
				} else {
					System.out.println("Not enough money !");
				}
			}
	
	
		
		
		
	}

	private int armourMenu() {
		System.out.println("1. Light\t <Money : 15 - Damage : 1>");
		System.out.println("2. Medium\t <Money : 25 - Damage : 3>");
		System.out.println("3. Heavy\t <Money : 40 - Damage : 5>");
		System.out.println("4. Exit");
		System.out.println("Choose weapon : ");
		int selArmourID = scan.nextInt();
		
		return selArmourID;
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
			case 4:
				System.out.println("Quitting...");
				break;

			default:
				System.out.println("Invalid selection !");
				break;
			}
			if (price>0) {
				if (player.getMoney()>=price) {
					player.getInv().setDamage(damage);
					player.getInv().setwName(wName);
					player.setMoney(player.getMoney()-price);
					System.out.println(wName + " bought, previous damage: " + player.getDamage() + " new damage : " + player.getTotalDamege());
					System.out.println("Balance : " + player.getMoney());
				} else {
					System.out.println("Not enough money !");
				}
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
