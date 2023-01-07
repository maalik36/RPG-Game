import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class main {



public void Game(){
    Hero player = new Hero();
    Shrub shrub = new Shrub();
    Rats rats = new Rats();
    Hawk hawk = new Hawk();
    Eagle eagle = new Eagle();
    Panther panther = new Panther();
    Goat goat = new Goat();
    GiantShark giantShark = new GiantShark();
    BlinkDog blinkDog = new BlinkDog();
    Nothic nothic = new Nothic();
    AnimatedArmor animatedArmor = new AnimatedArmor();
    Kufra kufra = new Kufra();
    Scanner name = new Scanner(System.in);
    System.out.println("Welcome " + player.getName() + " to your new quest.");
    Vector<Heroes> heroes = new Vector<>(20);
    heroes.add(player);
    heroes.add(shrub);

    System.out.println("Here's your first enemy! A " + shrub.getName() + "!");
    boolean result = Combat(heroes);
    if (result = false)
    {
        System.out.println("Game Over");
        return;

    }
    heroes.remove(shrub);
    System.out.println("You defeated the " + shrub.getName() + "!");
    System.out.println("Oh look! There's a mage on the Road! Would you like to recruit them? Y or N");
    String answer = name.nextLine();
    if (answer == "Y")
    {
        Mage mage = new Mage();
        heroes.add(mage);
    }
    System.out.println("Oh look! A group of rats appeared!");
    heroes.add(rats);
    result = Combat(heroes);
    if (result = false)
    {
        System.out.println("Game Over");
        return;

    }
    heroes.remove(rats);
    System.out.println("You defeated the " + rats.getName() + "!");
    System.out.println("Oh look! There's a shield bearer on the Road! Would you like to recruit them? Y or N");
    answer = name.nextLine();
    if (answer == "Y")
    {
        Shield shield = new Shield();
        heroes.add(shield);
    }
    System.out.println("Oh look! A hawk and an eagle appeared!");
    enemies.add(eagle);
    enemies.add(hawk);
    result = Combat(heroes);
    if (result = false)
    {
        System.out.println("Game Over");
        return;

    }
    heroes.remove(hawk);
    heroes.remove(eagle);
    System.out.println("You defeated the " + hawk.getName() + " and " + eagle.getName() + "!");
    System.out.println("Oh look! There's a healer on the Road! Would you like to recruit them? Y or N");
    answer = name.nextLine();
    if (answer == "Y")
    {
        Healer healer = new Healer();
        heroes.add(healer);
    }
    System.out.println("Oh look! A panther and a goat appeared!");
    heroes.add(panther);
    heroes.add(goat);
    result = Combat(heroes);
    if (result = false)
    {
        System.out.println("Game Over");
        return;

    }
    heroes.remove(panther);
    heroes.remove(goat);
    System.out.println("You defeated the " + panther.getName() + " and " + goat.getName() + "!");
    System.out.println("Oh look! There's a chameleon on the Road! Would you like to recruit them? Y or N");
    answer = name.nextLine();
    if (answer == "Y")
    {
        Chameleon chameleon = new Chameleon();
        heroes.add(chameleon);
    }
    System.out.println("Oh look! A giant shark and a blink dog appeared!");
    heroes.add(giantShark);
    heroes.add(blinkDog);
    result = Combat(heroes);
    if (result = false)
    {
        System.out.println("Game Over");
        return;

    }
    heroes.remove(giantShark);
    heroes.add(blinkDog);
    System.out.println("You defeated the " + giantShark.getName() + " and " + blinkDog.getName() + "!");
    System.out.println("Oh look! There's a sweeper on the Road! Would you like to recruit them? Y or N");
    answer = name.nextLine();
    if (answer == "Y")
    {
        Sweeper sweeper = new Sweeper();
        heroes.add(sweeper);
    }
    System.out.println("Oh look! A Nothic and an Armor appeared!");
    heroes.add(nothic);
    heroes.add(animatedArmor);
    result = Combat(heroes);
    if (result = false)
    {
        System.out.println("Game Over");
        return;

    }
    heroes.remove(nothic);
    heroes.remove(animatedArmor);
    System.out.println("You defeated the " + nothic.getName() + " and " + animatedArmor.getName() + "!");
    System.out.println("Oh look! Everyone appeared!");
    heroes.add(panther);
    heroes.add(goat);
    heroes.add(shrub);
    heroes.add(nothic);
    heroes.add(animatedArmor);
    heroes.add(hawk);
    heroes.add(eagle);
    heroes.add(giantShark);
    heroes.add(blinkDog);
    heroes.add(rats);
    result = Combat(heroes);
    if (result = false)
    {
        System.out.println("Game Over");
        return;

    }
    heroes.remove(panther);
    heroes.remove(goat);
    heroes.remove(shrub);
    heroes.remove(nothic);
    heroes.remove(animatedArmor);
    heroes.remove(hawk);
    heroes.remove(eagle);
    heroes.remove(giantShark);
    heroes.remove(blinkDog);
    heroes.remove(rats);
    System.out.println("You defeated everyone!");
System.out.println("Oh no! The boss Kufra, the soul god, has appeared!");
    heroes.add(kufra);
result = Combat(heroes);
    if (result = false)
    {
        System.out.println("Game Over");
        return;

    }
    heroes.remove(kufra);

    System.out.println("You Win!");
    return;


}

public Vector<Heroes> mergesort(Vector<Heroes> list, Vector<Heroes> tmp, Integer left, Integer right){
    if (left < right)
    {
        Integer center = (left + right) / 2;
        mergesort(list, tmp, left, center);
        mergesort(list, tmp, center + 1, right);

    }
    return list;
}


public Vector<Heroes> turnOrder(Vector<Heroes> party, Vector<Heroes> enemies, Vector<Heroes> tmp, Integer leftPos, Integer rightPos, Integer rightEnd){
    Vector<Heroes> turnOrder = new Vector<>(20);
    for (Integer i = 0; i < party.size(); i++)
    {
        turnOrder.add(party.elementAt(i));
    }
    for (Integer i = 0; i < enemies.size(); i++)
    {
        turnOrder.add(enemies.elementAt(i));
    }
    for (Integer i = 0; i < turnOrder.size() - 1; i++)
    { Integer tracker = i;
        for (Integer j = i; j <= turnOrder.size()- 1; j++)
        {
            if (turnOrder.elementAt(i).Speed < turnOrder.elementAt(tracker).Speed)
            {
                tracker = j;
            }
        }
        Collections.swap(turnOrder, i, tracker);



    }
    return turnOrder;
}
public boolean Combat(Vector<Heroes> heroes){
    Scanner response = new Scanner(System.in);
Vector<Heroes> turnOrder = turnOrder();
Vector<Heroes> goodOrder = new Vector<>(20);
Vector<Heroes> badOrder = new Vector<>(20);;
for (Integer i = 0; i < turnOrder.size(); i++)
{
    if (turnOrder.elementAt(i).type == "good")
    {
        goodOrder.add(turnOrder.elementAt(i));
    }
    else
    {
        badOrder.add(turnOrder.elementAt(i));
    }
}
while(turnOrder.elementAt(0).HP != 0){
    for (Integer i = 0; i < turnOrder.size(); i++)
    {
        if (turnOrder.elementAt(i).type == "good")
        {
            System.out.println("What would " + turnOrder.elementAt(i).name + " like to do?");
            String answer = response.nextLine();
            switch (answer)
            {
                case "attack":
                {
                    System.out.println("Who would you like to attack?");

                    turnOrder.elementAt(i).damage();

                }
                case "spells":
                {
                    turnOrder.elementAt(i).spells();
                }
                case "items":
                {
                    turnOrder.elementAt(i).item();
                }
                case "special":
                {
                    turnOrder.elementAt(i).Special();
                }
                case "defend":
                {
                    turnOrder.elementAt(i).defend();
                }
            }

        }
        if (turnOrder.elementAt(i).type == "bad")
        {
            Random rand = new Random();
            Integer choice = rand.nextInt(2);
            switch (choice)
            {
                case 0:
                {

                }
                case 1:
                {

                }
                case 2:
                {
                    turnOrder.elementAt(i).Special();
                }
            }
        }

    }
}

return true;
}
}
