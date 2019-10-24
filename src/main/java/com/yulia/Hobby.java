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

    @Override
    public String toString() {
        return "Hobby{" +
                "nameOfHobby='" + nameOfHobby + '\'' +
                ", amountOfYears=" + amountOfYears +
                ", numberOfOccupationPerWeek=" + numberOfOccupationPerWeek +
                ", costForOneOccupation=" + costForOneOccupation +
                '}';
    }

    public abstract void tellAboutHobby();

}
