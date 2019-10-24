package com.yulia;

public class Hobby {
    private String nameOfHobby;
    private byte amountOfYears;
    private short numberOfOccupationPerWeek;
    private int ageOfStart;
    private long hoursForOneOccupation;
    private char firstLetterOfTeacher;
    private double costForMonth;
    private float costForOneOccupation;
    private boolean antistress;


    public Hobby() {
    }

    public Hobby(String nameOfHobby, short numberOfOccupationPerWeek, int ageOfStart, float costForOneOccupation) {
        this.nameOfHobby = nameOfHobby;
        this.numberOfOccupationPerWeek = numberOfOccupationPerWeek;
        this.ageOfStart = ageOfStart;
        this.costForOneOccupation = costForOneOccupation;
    }

    public Hobby(String nameOfHobby, byte amountOfYears, short numberOfOccupationPerWeek, int ageOfStart, long hoursForOneOccupation, char firstLetterOfTeacher, double costForMonth, float costForOneOccupation, boolean antistress) {
        this.nameOfHobby = nameOfHobby;
        this.amountOfYears = amountOfYears;
        this.numberOfOccupationPerWeek = numberOfOccupationPerWeek;
        this.ageOfStart = ageOfStart;
        this.hoursForOneOccupation = hoursForOneOccupation;
        this.firstLetterOfTeacher = firstLetterOfTeacher;
        this.costForMonth = costForMonth;
        this.costForOneOccupation = costForOneOccupation;
        this.antistress = antistress;
    }

    public String getNameOfHobby() {
        return nameOfHobby;
    }

    public void setNameOfHobby(String nameOfHobby) {
        this.nameOfHobby = nameOfHobby;
    }

    public byte getAmountOfYears() {
        return amountOfYears;
    }

    public void setAmountOfYears(byte amountOfYears) {
        this.amountOfYears = amountOfYears;
    }

    public short getNumberOfOccupationPerWeek() {
        return numberOfOccupationPerWeek;
    }

    public void setNumberOfOccupationPerWeek(short numberOfOccupationPerWeek) {
        this.numberOfOccupationPerWeek = numberOfOccupationPerWeek;
    }

    public int getAgeOfStart() {
        return ageOfStart;
    }

    public void setAgeOfStart(int ageOfStart) {
        this.ageOfStart = ageOfStart;
    }

    public long getHoursForOneOccupation() {
        return hoursForOneOccupation;
    }

    public void setHoursForOneOccupation(long hoursForOneOccupation) {
        this.hoursForOneOccupation = hoursForOneOccupation;
    }

    public char getFirstLetterOfTeacher() {
        return firstLetterOfTeacher;
    }

    public void setFirstLetterOfTeacher(char firstLetterOfTeacher) {
        this.firstLetterOfTeacher = firstLetterOfTeacher;
    }

    public double getCostForMonth() {
        return costForMonth;
    }

    public void setCostForMonth(double costForMonth) {
        this.costForMonth = costForMonth;
    }

    public float getCostForOneOccupation() {
        return costForOneOccupation;
    }

    public void setCostForOneOccupation(float costForOneOccupation) {
        this.costForOneOccupation = costForOneOccupation;
    }

    public boolean isAntistress() {
        return antistress;
    }

    public void setAntistress(boolean antistress) {
        this.antistress = antistress;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "nameOfHobby='" + nameOfHobby + '\'' +
                ", amountOfYears=" + amountOfYears +
                ", numberOfOccupationPerWeek=" + numberOfOccupationPerWeek +
                ", ageOfStart=" + ageOfStart +
                ", hoursForOneOccupation=" + hoursForOneOccupation +
                ", firstLetterOfTeacher=" + firstLetterOfTeacher +
                ", costForMonth=" + costForMonth +
                ", costForOneOccupation=" + costForOneOccupation +
                ", antistress=" + antistress +
                '}';
    }

    public void tellAboutHobby(){
        System.out.println(toString());

    }

}

