//package JAVA_PROJECT;
//package com.company;
import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputnumber;
    public int noOfGuesses=0;

    public int getOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number=rand.nextInt(100);

    }

    void takeUserInput(){
        System.out.println("Guess the NUmber");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputnumber == number){
            System.out.format("Yes you guessed it right, it was %d\n you gussed it in %d attempts", number,noOfGuesses);
            return true;
        }
        else if(inputnumber<number){
            System.out.println("To low..");
        }
        else if(inputnumber>number){
            System.out.println("To high..");
        }
        return false;
    }
}

public class project1 {
    public static void main(String[] args) {
        
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.err.println(b);
        }
       
    }
}
