package com.curmar.game;


public class Item {
    private final String name;
    private final int rare;

    public Item(String name, int rare) {
        this.name = name;
        this.rare = rare;
    }

    public String getName() {
        return name;
    }

    public int getRare() {
        return rare;
    }
}
