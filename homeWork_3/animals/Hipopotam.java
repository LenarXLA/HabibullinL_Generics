package homeWork_3.animals;

import homeWork_3.food.SizeOfAviary;

public class Hipopotam extends Herbivore {
    private final String name = "Hipopotam";
    private final SizeOfAviary sizeOfAviary = SizeOfAviary.LARGE;

    public SizeOfAviary getSizeOfAviary() {
        return sizeOfAviary;
    }

    @Override
    public void run() {
        System.out.println("Hipopotam running!");
        super.setEnergy(getEnergy() - 1);
    }

    @Override
    public void swim() {
        System.out.println("Hipopotam swimming!");
        super.setEnergy(getEnergy() - 2);
    }

    @Override
    public String voice() {
        return "Ghhhhh!";
    }

    @Override
    public String getNameOfAnimal() {
        return name;
    }
}
