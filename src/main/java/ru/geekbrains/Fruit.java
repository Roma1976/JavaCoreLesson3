package ru.geekbrains;

public class Fruit {
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public <T extends Fruit> void add(T fruit) {

    }
}
