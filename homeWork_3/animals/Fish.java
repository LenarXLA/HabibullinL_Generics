package homeWork_3.animals;

import homeWork_3.food.SizeOfAviary;

public class Fish extends Herbivore {
    private final String name = "Fish";
    private final SizeOfAviary sizeOfAviary = SizeOfAviary.ULTRA_SMALL;

    public SizeOfAviary getSizeOfAviary() {
        return sizeOfAviary;
    }

    @Override
    public void swim() {
        System.out.println("Fish swimming!");
        super.setEnergy(getEnergy() - 1);
    }

    @Override
    public String getNameOfAnimal() {
        return name;
    }
}
