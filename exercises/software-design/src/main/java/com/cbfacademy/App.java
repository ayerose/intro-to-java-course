package com.cbfacademy;

public class App {
    private static SimpleContainer initialiseContainer() {
        SimpleContainer container = new SimpleContainer();
        container.register(Game.class, DiceGame.class);
        container.register(Player.class, DicePlayer.class);
        return container;
    }

    public static void main(String[] args) throws Exception {
        SimpleContainer container = initialiseContainer();

        Player player1 = container.get(Player.class);
        Player player2 = container.get(Player.class);

        player1.setName("Player 1");
        player2.setName("Player 2");

        Game game = container.get(Game.class);
        String winner = game.play();

        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
    }
}
