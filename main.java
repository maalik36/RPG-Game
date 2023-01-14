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
        Tank tank = new Tank();
        heroes.add(tank);
    }
    System.out.println("Oh look! A hawk and an eagle appeared!");
    heroes.add(eagle);
    heroes.add(hawk);
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
        turnOrder(list, tmp, left, center + 1, right);

    }
    return list;
}


public Vector<Heroes> turnOrder(Vector<Heroes> heroes, Vector<Heroes> tmp, Integer leftPos, Integer rightPos, Integer rightEnd){
    Integer leftEnd = rightPos - 1;
    Integer tmpPos = leftPos;
    Integer numElements = rightEnd - leftPos + 1;
    while (leftPos <= leftEnd && rightPos <= rightEnd)
    {
        if(heroes.elementAt(leftPos).Speed <= heroes.elementAt(rightPos).Speed)
        {
            Collections.swap(heroes, leftPos, rightPos);
            //tmp.elementAt(tmpPos++) = heroes.  elementAt(leftPos++);

        }
        /*
        else
        {
            Collections.swap(heroes, );
            tmpArray[ tmpPos++ ] = std::move(a[ rightPos++ ]);
        }

    }
    while(leftPos <= leftEnd)
    {
        tmpArray[ tmpPos++ ] = std::move( a[ leftPos++ ]);
    }
    while(rightPos <= rightEnd)
    {
        tmpArray[tmpPos++] = std::move(a[rightPos++]);

    }
    for(int i = 0; i < numElements; ++i, --rightEnd)
    {
        a[rightEnd] = std::move(tmpArray[rightEnd]);
    }
*/
}


    return heroes;
}
public boolean Combat(Vector<Heroes> heroes){
    Scanner response = new Scanner(System.in);
    Vector<Heroes> tmp = new Vector<>(20);
Vector<Heroes> turnOrder = mergesort(heroes, tmp, 0,  heroes.size() - 1);
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
            System.out.println("attack, spells, special, defend");
            String answer = response.nextLine();
            switch (answer)
            {
                case "attack":
                {
                    System.out.println("Who would you like to attack?");
                    for (Integer j = 0; j < badOrder.size(); j++)
                    {
                        System.out.println(badOrder.elementAt(j).name);
                    }
                    answer = response.nextLine();
                    for (Integer k = 0; k < badOrder.size(); k++)
                    {
                        if (badOrder.elementAt(k).name == answer)
                        {   boolean hit = turnOrder.elementAt(i).hit(badOrder.elementAt(k));
                            if (hit == true)
                            {
                                turnOrder.elementAt(i).damage(turnOrder.elementAt(i).items.elementAt(0), badOrder.elementAt(k));
                            }

                        }
                    }



                }
                case "spells":
                {
                    turnOrder.elementAt(i).spells(turnOrder);
                }
                case "special":
                {
                    turnOrder.elementAt(i).Special(turnOrder.elementAt(i).items.elementAt(0), turnOrder.elementAt(i), goodOrder, badOrder);
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
                    Integer target = rand.nextInt(goodOrder.size());
                    boolean hit = turnOrder.elementAt(i).hit(goodOrder.elementAt(target));
                    if (hit == true)
                    {
                        turnOrder.elementAt(i).damage(turnOrder.elementAt(i).items.elementAt(0), goodOrder.elementAt(target));
                    }

                }
                case 1:
                { Integer magic = rand.nextInt(turnOrder.elementAt(i).spells.size());
                  Integer target = rand.nextInt(goodOrder.size());
                    turnOrder.elementAt(i).damage(turnOrder.elementAt(i).spells.elementAt(magic), goodOrder.elementAt(target));
                }
                case 2:
                {
                    turnOrder.elementAt(i).Special(turnOrder.elementAt(i).items.elementAt(0), turnOrder.elementAt(i), goodOrder, badOrder);
                }
            }
        }

    }
}

return true;
}
}
