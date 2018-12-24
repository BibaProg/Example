package ru.bell;

public class Lorry extends Car {
    private Integer weightLimit;

    public Lorry(String mark, Integer weight, Integer power, Integer weightLimit) {
        super(mark, weight, power);
        this.weightLimit = weightLimit;
    }

    public Lorry(String mark, Integer weight, Integer power) {
        super(mark, weight, power);
    }

    public Integer getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(Integer weightLimit) {
        this.weightLimit = weightLimit;
    }

    public void changeMark(String mark) {
        super.setMark(mark);
    }

    public boolean changeWeightLimit(int weightLimit) {
        try {
            this.weightLimit += weightLimit;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+" Lorry{" +
                "weightLimit=" + weightLimit +
                '}';
    }
}
