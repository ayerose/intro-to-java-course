package com.cbfacademy;

public class DicePlayer implements Player {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int roll() {
        int score = (int) (Math.random() * 6) + 1;
        System.out.println(name + " rolled a " + score);
        return score;
    }
}
