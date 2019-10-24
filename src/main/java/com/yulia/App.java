package com.yulia;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //first hobby
        Hobby hobby1 = new Hobby();
        System.out.println( "What hobby do you have?" );
        String nameOfHobby1 = in.nextLine();
        hobby1.setNameOfHobby(nameOfHobby1);
        System.out.println( "How many years have you been doing this hobby?" );
        byte amountOfYears1 = in.nextByte();
        hobby1.setAmountOfYears(amountOfYears1);
        System.out.println( "How many times a week do you have a hobby?" );
        short numberOfOccupationPerWeek1 = in.nextShort();
        hobby1.setNumberOfOccupationPerWeek(numberOfOccupationPerWeek1);
        System.out.println( "How old were you when you started hobbies?" );
        int ageOfStart1 = in.nextInt();
        hobby1.setAgeOfStart(ageOfStart1);
        System.out.println( "How long does take one occupation?" );
        long hoursForOneOccupation1 = in.nextLong();
        hobby1.setHoursForOneOccupation(hoursForOneOccupation1);
        System.out.println("What is the first letter of your teacher’s name:" );
        char firstLetterOfTeacher1 = in.next().charAt(0);
        hobby1.setFirstLetterOfTeacher(firstLetterOfTeacher1);
        System.out.println( "How much money do you spend on a hobby per month?" );
        double costForMonth1 = in.nextDouble();
        hobby1.setCostForMonth(costForMonth1);
        System.out.println( "How much does one occupation cost?" );
        float costForOneOccupation1 = in.nextFloat();
        hobby1.setCostForOneOccupation(costForOneOccupation1);
        System.out.println( "Does your hobby relieve stress?(true/false)" );
        boolean antistress1 = in.nextBoolean();
        hobby1.setAntistress(antistress1);

        //second hobby
        String nameOfHobby = "Basketball";
        short numberOfOccupationPerWeek = (short) 45;
        int ageOfStart = 12;
        float costForOneOccupation = 6;
        Hobby hobby2 = new Hobby(nameOfHobby, numberOfOccupationPerWeek, ageOfStart ,costForOneOccupation);

        //third hobby
        String nameOfHobby2 = "Football";
        byte amountOfYears2 = (byte) 1;
        short numberOfOccupationPerWeek2 = (short) 10;
        int ageOfStart2 = 14;
        long hoursForOneOccupation2 = 4;
        char firstLetterOfTeacher2 = 'R';
        double costForMonth2 = 500.5;
        float costForOneOccupation2 = 4.5f;
        boolean antistress2 = true;
        Hobby hobby3 = new Hobby(nameOfHobby2 , amountOfYears2, numberOfOccupationPerWeek2, ageOfStart2,  hoursForOneOccupation2, firstLetterOfTeacher2, costForMonth2, costForOneOccupation2, antistress2);

        Hobby [] hobbies = {hobby1, hobby2, hobby3};

        for (Hobby hobby: hobbies ) {
            hobby.tellAboutHobby();
        }
    }
}
