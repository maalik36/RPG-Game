public class main {


public void Game(){
    Hero player = new Hero();
    Shrub shrub = new Shrub();
    System.out.println("Welcome " + player.getName() + " to your new quest.");
    Heroes list[] = new Heroes[20];
    list[0] = player;
    list[1] = shrub;
    System.out.println("Here's your first enemy! A " + shrub.getName() + "!");
    boolean result = Combat(list);
    if (result = false)
    {
        System.out.println("Game Over");
        return;

    }
    System.out.println("You defeated the " + shrub.getName() + "!");


}
public boolean Combat(Heroes[] list){
Heroes turnOrder[] = new Heroes[20];

for (Integer i = 0; i < list.length; i++)
{

}
return true;
}
}
