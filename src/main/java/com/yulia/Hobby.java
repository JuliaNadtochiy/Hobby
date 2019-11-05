package com.yulia;

public abstract class Hobby {
    private String nameOfHobby;
    private byte amountOfYears;
    private short numberOfOccupationPerWeek;
    private float costForOneOccupation;

    public Hobby(String nameOfHobby, byte amountOfYears, short numberOfOccupationPerWeek, float costForOneOccupation) {
        this.nameOfHobby = nameOfHobby;
        this.amountOfYears = amountOfYears;
        this.numberOfOccupationPerWeek = numberOfOccupationPerWeek;
        this.costForOneOccupation = costForOneOccupation;
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

    public float getCostForOneOccupation() {
        return costForOneOccupation;
    }

    public void setCostForOneOccupation(float costForOneOccupation) {
        this.costForOneOccupation = costForOneOccupation;
    }

    public String getNameOfHobby() {
        return nameOfHobby;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "nameOfHobby='" + nameOfHobby + '\'' +
                ", amountOfYears=" + amountOfYears +
                ", numberOfOccupationPerWeek=" + numberOfOccupationPerWeek +
                ", costForOneOccupation=" + costForOneOccupation +
                '}';
    }

    public abstract void tellAboutHobby () throws HobbyException;

}
