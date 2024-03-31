import com.curmar.game.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("<-BEGIN->");
        Player pl = new Player();
        pl.getInventory().add(new Item("Sword", 2));
        pl.getInventory().add(new Item("Axe", 5));

        for (Item i : pl.getInventory()) {
            System.out.println(i.getName());
        }
    }
}