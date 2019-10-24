package com.yulia;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        //first hobby
        System.out.println( "What hobby do you have?" );
        String nameOfHobby1 = in.next();
        System.out.println( "How many years have you been doing this hobby?" );
        byte amountOfYears1 = in.nextByte();
        System.out.println( "How many times a week do you have a hobby?" );
        short numberOfOccupationPerWeek1 = in.nextShort();
        System.out.println( "How much does one occupation cost?" );
        float costForOneOccupation1 = in.nextFloat();
        System.out.println( "How many matches did you have?" );
        int numberOfMatches1 =in.nextInt();
        System.out.println( "How many matches did you win?" );
        double numberOfWins1 = in.nextDouble();
        Hobby football1 = new Football(nameOfHobby1, amountOfYears1, numberOfOccupationPerWeek1, costForOneOccupation1, numberOfMatches1, numberOfWins1);

        //second hobby
        String nameOfHobby2 = "Fishing";
        byte amountOfYears2 = (byte) 5;
        short numberOfOccupationPerWeek2 = (short) 1;
        float costForOneOccupation2 = 350.5f;
        long maxCatch2 = 14;
        Hobby fishing = new Fishing(nameOfHobby2, amountOfYears2, numberOfOccupationPerWeek2, costForOneOccupation2, maxCatch2);

        //third hobby
        String nameOfHobby3 = "Football";
        byte amountOfYears3 = (byte) 10;
        short numberOfOccupationPerWeek3 = (short) 3;
        float costForOneOccupation3 = 202.5f;
        int numberOfMatches3 = 40;
        double numberOfWins3 = 35;

        Hobby football2 = new Football(nameOfHobby3, amountOfYears3, numberOfOccupationPerWeek3, costForOneOccupation3, numberOfMatches3, numberOfWins3);

        Hobby[] hobbies = {football1, fishing, football2};

        for (Hobby hobby: hobbies ) {
            hobby.tellAboutHobby();
        }
    }
}
