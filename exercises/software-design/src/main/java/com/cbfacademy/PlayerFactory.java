package com.cbfacademy;

public class PlayerFactory {
    public static Player create() {
        return new DicePlayer();
    }
}
