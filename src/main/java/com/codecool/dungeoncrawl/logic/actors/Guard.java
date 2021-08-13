package com.codecool.dungeoncrawl.logic.actors;

import com.codecool.dungeoncrawl.logic.Cell;

public class Guard extends Enemy {

    public Guard(Cell cell) {
        super(cell);
        setHealth(500);
        setStrength(40);
    }

//
    @Override
    public String getTileName() {
        return "enemy guard";
    }
}
