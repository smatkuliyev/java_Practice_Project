package adventureGame;

public abstract class BattleLoc extends Location {

    protected Obstacle obstacle;
    protected String award;

    public BattleLoc(Player player, String name, Obstacle obstacle, String award) {
        super(player);
        this.obstacle = obstacle;
        this.name = name;
        this.award = award;
    }

    public boolean getLocation() {
        int obsCount = obstacle.count();
        System.out.println("Now you are at " + this.getName());
        System.out.println("Be careful! There is " + obsCount + " pcs of " + obstacle.getName());
        System.out.print("<F>ight or <L>eave: ");
        String selCase = scan.next();
        if (selCase.equalsIgnoreCase("f")) {

            if (combat(obsCount)) {
                System.out.println("At " + this.getName() + " area, you wiped out all enemies");
                if (this.award.equals("Food") && player.getInv().isFood() == false) {
                    System.out.println("You earned " + this.award);
                    player.getInv().setFood(true);
                } else if (this.award.equals("Water") && player.getInv().isWater() == false) {
                    System.out.println("You earned " + this.award);
                    player.getInv().setWater(true);
                } else if (this.award.equals("Firewood") && player.getInv().isFirewood() == false) {
                    System.out.println("You earned " + this.award);
                    player.getInv().setFirewood(true);
                }

                return true;
            }
            if (player.getHealthy() <= 0) {
                System.out.println("You are dead !");
                return false;
            }

        }
        return true;
    }

    public boolean combat(int obsCount) {

        for (int i = 0; i < obsCount; i++) {
            int defObsHealth = obstacle.getHealth();
            playerStats();
            enemyStats();
            while (player.getHealthy() > 0 && obstacle.getHealth() > 0) {
                System.out.print("<F>ight or <L>eave: ");
                String selCase = scan.next().toUpperCase();
                if (selCase.equals("F")) {
                    System.out.println("You hitted !");
                    obstacle.setHealth(obstacle.getHealth() - player.getTotalDamege());
                    afterHit();
                    if (obstacle.getHealth() > 0) {
                        System.out.println();
                        System.out.println("Enemy hitted !");
                        player.setHealthy(player.getHealthy() - (obstacle.getDamage() - player.getInv().getArmour()));
                        afterHit();
                    }

                } else {
                    return false;
                }
            }
            if (obstacle.getHealth() < player.getHealthy()) {
                System.out.println("You killed enemy!");
                player.setMoney(player.getMoney() + obstacle.getAward());
                System.out.println("Current money: " + player.getMoney());
                obstacle.setHealth(defObsHealth);
            } else {
                return false;
            }
            System.out.println("-----------------------------");


        }

        return true;
    }


    public void afterHit() {
        System.out.println("Player health : " + player.getHealthy());
        System.out.println(obstacle.getName() + " health: " + obstacle.getHealth());
        System.out.println();
    }

    public void playerStats() {
        System.out.println("Player Values \n-------------------");
        System.out.println("Health:" + player.getHealthy());
        System.out.println("Damage: " + player.getDamage());
        System.out.println("Money: " + player.getMoney());
        if (player.getInv().getDamage() > 0) {
            System.out.println("Weapon: " + player.getInv().getwName());
        }
        if (player.getInv().getArmour() > 0) {
            System.out.println("Armour: " + player.getInv().getaName());
        }

    }

    public void enemyStats() {
        System.out.println("\n" + obstacle.getName() + " Values \n-------------------");
        System.out.println("Health:" + obstacle.getHealth());
        System.out.println("Damage: " + obstacle.getDamage());
        System.out.println("Award: " + obstacle.getAward());


    }


}
