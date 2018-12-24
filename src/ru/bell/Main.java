package ru.bell;

public class Main {

    public static void main(String[] args) {
	Car car = new Car("A",2,2);
	Lorry lorry = new Lorry(car.getMark(),car.getWeight(),car.getPower(),137);
    System.out.println(car.toString());
    System.out.println(lorry.toString());
    }
}
