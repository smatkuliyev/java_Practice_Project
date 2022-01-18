package adventureGame;

import java.util.Scanner;

public class Player {
	
	private int damage,healthy,money, rHealthy;
	private String name, cName;
	private Inventory inv;
	
	
	Scanner scan = new Scanner(System.in);
	
	public void selectCha() {
		
		switch (chaMenu()) {
		case 1:
			initPlayer("Samurai", 5, 21, 15);
			break;
		case 2:
			initPlayer("Archer", 7, 18, 20);
			break;
		case 3:
			initPlayer("Knight", 8, 24, 5);
			break;			
		default:
			initPlayer("Samurai", 5, 21, 15);
			break;
		}
		System.out.println("Character: " + getcName() + "\t Damage: " + getDamage() + "\t Health: " + getHealthy() + "\t Money: " + getMoney());
		
	}
	
	
	
	private int chaMenu() {
		System.out.println("Please select character : ");
		System.out.println("1- Samurai \t Damage : 5 \t Health : 21 \t Monay : 15");
		System.out.println("2- Archer \t Damage : 7 \t Health : 18 \t Monay : 20");
		System.out.println("3- Knight \t Damage : 8 \t Health : 24 \t Monay : 5");
		System.out.print("Character selection : ");
		int charId = scan.nextInt();
		
		while (charId<1 || charId>3) {
			System.out.print("Please select valid character: ");
			charId = scan.nextInt();
		}
		
		return charId;
	}

	public void initPlayer(String cNm, int dmg, int hlth, int mny) {
		setcName(cNm);
		setDamage(dmg);
		setHealthy(hlth);
		setMoney(mny);
		setrHealthy(hlth);
	}


	public Player(String name) {
		this.name = name;
		this.inv = new Inventory();
	}


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getHealthy() {
		return healthy;
	}


	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public Inventory getInv() {
		return inv;
	}


	public void setInv(Inventory inv) {
		this.inv = inv;
	}



	public int getrHealthy() {
		return rHealthy;
	}



	public void setrHealthy(int rHealthy) {
		this.rHealthy = rHealthy;
	}
	
	
	
}
