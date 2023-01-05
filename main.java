import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class main {


public void Game(){
    Hero player = new Hero();
    Shrub shrub = new Shrub();
    Scanner name = new Scanner(System.in);
    System.out.println("Welcome " + player.getName() + " to your new quest.");
    Vector<Heroes> party = new Vector<>(20);
    Vector<Heroes> enemies = new Vector<>(20);
    party.add(player);
    enemies.add(shrub);

    System.out.println("Here's your first enemy! A " + shrub.getName() + "!");
    boolean result = Combat();
    if (result = false)
    {
        System.out.println("Game Over");
        return;

    }
    System.out.println("You defeated the " + shrub.getName() + "!");
    System.out.println("Oh look! There's a mage on the Road! Would you like to recruit them? Y or N");
    String answer = name.nextLine();
    if (answer == "Y")
    {
        Mage mage = new Mage();
        party.add(mage);
    }

}
/*
public Vector<Heroes> mergesort(Vector<Heroes> list, Vector<Heroes> tmp, Integer left, Integer right){
    if (left < right)
    {
        Integer center = (left + right) / 2;
        mergesort(list, tmp, left, center);
        mergesort(list, tmp, center + 1, right);

    }
    return list;
}
*/

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
public boolean Combat(){
    Scanner response = new Scanner(System.in);
Vector<Heroes> turnOrder = turnOrder();

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

                }
                case "items":
                {

                }
                case "special":
                {

                }
                case "defend":
                {

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

                }
            }
        }

    }
}

return true;
}
}
