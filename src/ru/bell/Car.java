package ru.bell;

public class Car {
    private String mark;
    private Integer weight;
    private Integer power;

    public Car(String mark, Integer weight, Integer power) {
        this.mark = mark;
        this.weight = weight;
        this.power = power;
    }

    public Car() {
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public boolean changePower(int power){
        try {
            this.power += power;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }
}
