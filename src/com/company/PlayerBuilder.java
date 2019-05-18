package com.company;

public class PlayerBuilder {
    private String name;
    private Board board;

    public PlayerBuilder name (String name) {
        this.name = name;
        return this;
    }

    public PlayerBuilder board (Board board){
        this.board = board;
        return this;
    }

    public Player build (){
        Player player = new Player(name,board);
        return player;
    }
}
