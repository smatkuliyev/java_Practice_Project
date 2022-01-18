package adventureGame;

import java.util.Scanner;

public class Game {
	
	Player player;
	Location location;
	
	Scanner scan = new Scanner(System.in);
	
	public void login() {
		
		System.out.println("Welcome to Adventure Game!");
		System.out.println("Enter your name: a");
	//	String playerName = scan.nextLine();
		
		player = new Player("a");
		player.selectCha();
		start();
		
			
	}


	private void start() {
		while (true) {

			System.out.println();
			System.out.println("===================================================================");
			System.out.println();
			System.out.println("Select location for action: ");
			System.out.println();
			System.out.println("1. Home --> Safe zone, no Enemies");
			System.out.println("2. Cave --> You can encounter zombies !");
			System.out.println("3. Forest --> You can encounter vampires !");
			System.out.println("4. river --> You can encounter bears !");
			System.out.println("5. Store --> You can buy armour or weapon !");
			System.out.print("Choose your destination: ");
			int selLoc = scan.nextInt();
			while (selLoc<0 || selLoc>5) {
				System.out.print("Please select valid Location: ");
				selLoc = scan.nextInt();
			}
			
			switch (selLoc) {
			case 1:
				location = new SafeHouse(player);
				break;
			case 5:
				location = new ToolStore(player);
				break;
			default:
				location = new SafeHouse(player);
				break;
			}
			
			if (!location.getLocation()) {
				System.out.println("Game Over!");
				break;
			}
			
			
		
		}
	}

}
