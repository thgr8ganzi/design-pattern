package org.example.designpattern._03_behavioral.memento._03_java;

import org.example.designpattern._03_behavioral.memento._01_before.Game;

import java.io.*;
import java.util.Date;

public class MementoInJava {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        date.setTime(time);

        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        try (
                FileOutputStream fileOut = new FileOutputStream("GameSave.hex"); 
                ObjectOutputStream out = new ObjectOutputStream(fileOut)
        ) 
        {
            out.writeObject(game);
        }
        game.setRedTeamScore(30);
        game.setBlueTeamScore(40);
        
        try (
                FileInputStream fileIn = new FileInputStream("GameSave.hex");
                ObjectInputStream in = new ObjectInputStream(fileIn)
        ) 
        {
            game = (Game) in.readObject();
            System.out.println("Restored game: " + game.getRedTeamScore() + " - " + game.getBlueTeamScore());
        }
    }
}
