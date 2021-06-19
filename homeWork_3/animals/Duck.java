package homeWork_3.animals;

import homeWork_3.food.SizeOfAviary;

public class Duck extends Herbivore {
    private final String name = "Duck";
    private final SizeOfAviary sizeOfAviary = SizeOfAviary.ULTRA_SMALL;

    public SizeOfAviary getSizeOfAviary() {
        return sizeOfAviary;
    }

    @Override
    public void fly() {
        System.out.println("Duck flying!");
        super.setEnergy(getEnergy() - 2);
    }

    @Override
    public void run() {
        System.out.println("Duck running!");
        super.setEnergy(getEnergy() - 1);
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming!");
        super.setEnergy(getEnergy() - 3);
    }

    @Override
    public String voice() {
        return "Krya-Krya!";
    }

    @Override
    public String getNameOfAnimal() {
        return name;
    }
}
