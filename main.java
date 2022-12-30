import java.util.Collections;
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
Vector<Heroes> turnOrder = turnOrder();

for (Integer i = 0; i < turnOrder.size(); i++)
{

}
return true;
}
}
