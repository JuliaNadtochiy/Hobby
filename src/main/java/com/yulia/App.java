package com.yulia;

public final class App {
    private App() {
    }
    public static void main(final String[] args) {

        final String nameOfHobby1 = "Football";
        final byte amountOfYears1 = (byte) 10;
        final short numberOfOccupationPerWeek1 = (short) 3;
        final float costForOneOccupation1 = -202.5f;
        final int numberOfMatches1 = 1;
        final double numberOfWins1 = 35;

        Hobby football = new Football(nameOfHobby1, amountOfYears1,
                numberOfOccupationPerWeek1, costForOneOccupation1,
                numberOfMatches1, numberOfWins1);
        try {
            football.tellAboutHobby();
        } catch (HobbyException e) {
            System.out.println("All numbers in football must be positive");
        }

        final String nameOfHobby2 = "Fishing";
        final byte amountOfYears2 = (byte) 5;
        final short numberOfOccupationPerWeek2 = (short) 1;
        final float costForOneOccupation2 = 350.5f;
        final long maxCatch2 = 0;
        Hobby fishing = new Fishing(nameOfHobby2, amountOfYears2,
                numberOfOccupationPerWeek2, costForOneOccupation2, maxCatch2);
        try {
            fishing.tellAboutHobby();
        } catch (HobbyException e) {
            System.out.println("All numbers in fishing must be positive");
        }
    }
}
