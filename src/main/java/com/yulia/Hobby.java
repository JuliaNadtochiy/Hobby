package com.yulia;

public abstract class Hobby {
    private String nameOfHobby;
    private byte amountOfYears;
    private short numberOfOccupationPerWeek;
    private float costForOneOccupation;

    public Hobby(final String nameOfHobby, final byte amountOfYears,
                 final short numberOfOccupationPerWeek,
                 final float costForOneOccupation) {
        this.nameOfHobby = nameOfHobby;
        this.amountOfYears = amountOfYears;
        this.numberOfOccupationPerWeek = numberOfOccupationPerWeek;
        this.costForOneOccupation = costForOneOccupation;
    }

    public final void setNameOfHobby(final String nameOfHobby) {
        this.nameOfHobby = nameOfHobby;
    }

    public final byte getAmountOfYears() {
        return amountOfYears;
    }

    public final void setAmountOfYears(final byte amountOfYears) {
        this.amountOfYears = amountOfYears;
    }

    public final short getNumberOfOccupationPerWeek() {
        return numberOfOccupationPerWeek;
    }

    public final void setNumberOfOccupationPerWeek(
            final short numberOfOccupationPerWeek) {
        this.numberOfOccupationPerWeek = numberOfOccupationPerWeek;
    }

    public final float getCostForOneOccupation() {
        return costForOneOccupation;
    }

    public final void setCostForOneOccupation(
            final float costForOneOccupation) {
        this.costForOneOccupation = costForOneOccupation;
    }

    public final String getNameOfHobby() {
        return nameOfHobby;
    }

    @Override
    public String toString() {
        return "Hobby{"
                + "nameOfHobby='" + nameOfHobby + '\''
                + ", amountOfYears=" + amountOfYears
                + ", numberOfOccupationPerWeek=" + numberOfOccupationPerWeek
                + ", costForOneOccupation=" + costForOneOccupation
                + '}';
    }

    public abstract void tellAboutHobby() throws HobbyException;

}
