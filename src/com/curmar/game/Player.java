package com.curmar.game;

import java.util.List;
import java.util.ArrayList;

public class Player {
    private List<Item> inventory;

    public Player() {
        inventory = new ArrayList<Item>();
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void putItemToInventory(Item item) {
        inventory.add(item);
    }
}
