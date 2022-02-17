package _11_dateTime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {

    ArrayList<User> kullanicilar = new ArrayList<>();

    @SuppressWarnings("resource")
    public List<User> register() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Adinizi giriniz : ");
        String isim = scan.nextLine();

        User user = new User(isim, LocalDateTime.now());
        kullanicilar.add(user);


        return kullanicilar;
    }

    public void printHappyUsers(ArrayList<User> users) {

        for (User each : users) {
            if (each.registerDate.getSecond() < 10) {
                System.out.println("Sansli kisisiniz : " + each.name + " agam 5 kilo bal kazandin");
            } else {
                System.out.println("malasef" + each.name + " kazandain ama ben aldim senin yerine");
            }
        }

    }

    public void listele(ArrayList<User> users) {
        for (User each : users) {
            System.out.println("adi " + each.name + " kayit zamani " + each.registerDate);
        }
    }


}
