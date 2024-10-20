package com.cbfacademy;

public class GameFactory {
    public static Game create(Player player1, Player player2) {
        return new DiceGame(player1, player2);
    }
}
